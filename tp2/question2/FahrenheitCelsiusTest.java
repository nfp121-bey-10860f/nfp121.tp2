package question2;

public class FahrenheitCelsiusTest extends junit.framework.TestCase{
    public FahrenheitCelsiusTest(){
    }

    protected void setUp()
    {
        System.out.println("test began");
    }

    protected void tearDown()
    {
        System.out.println("test ended");
    }

    public void test_2006(){
        assertTrue(FahrenheitCelsius.fahrenheitEnCelsius(2006) == (float)1096.6);
    }
    
    public void test_100(){
        assertTrue(FahrenheitCelsius.fahrenheitEnCelsius(100) == (float)37.7);
    }

    public void test_fahrenheitEnCelsius() {
        assertEquals("0 �F -> -17.7 �C ?", -17.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
        assertEquals("100 �F -> 37.7 �C ?", 37.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
        assertEquals("2000 �F -> 1093.3 �C ?", 1093.3, question1.FahrenheitCelsius.fahrenheitEnCelsius(2000), 0.1);
        assertEquals("54 �F -> 12.2 �C ?", 12.2, question1.FahrenheitCelsius.fahrenheitEnCelsius(54), 0.1);
    }
}

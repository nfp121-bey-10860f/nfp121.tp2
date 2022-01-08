package question3;

import question1.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  private JButton  boutonDeConversion = new JButton( "convertir" );
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    boutonDeConversion.addActionListener( this );
  }
  
  public void actionPerformed( ActionEvent ae ){
    try{
      int fahrenheit = Integer.parseInt(entree.getText());
      float celsius = fahrenheitEnCelsius(fahrenheit);
        if(celsius < -273.1F){
            celsius = -273.1F;
        }
      sortie.setText(Float.toString(celsius));
    }catch(NumberFormatException nfe){
      sortie.setText("erreure");
    }
  }
 
  public float fahrenheitEnCelsius( int f){
        float x = 5;
        float y = 9;
        float z = (x/y * (f - 32));
        z = z * 10;
        z = (float)Math.floor(z);
        z = z / 10;
        return z;
  }  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
}

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23/03/2019
 * @author 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class startbutton implements ActionListener {
  JTextField t;
  Timerclass timerlevel1;
  zufalleasyy zlevel1;
  JButton jButton1;
  
   public startbutton(JTextField tf, Timerclass timerlevel2, zufalleasyy zlevel2, JButton jButton1){ 
    this.jButton1=jButton1;
    t= tf;
    timerlevel1=timerlevel2;
   zlevel1=zlevel2; }
   public void actionPerformed(ActionEvent e){
    t.setText(zlevel1.getVocc().getEnglish());
          timerlevel1.start();
    jButton1.setVisible(false);
    timerlevel1.setI();
  }
  
  public static void main(String[] args) {
    
  } // end of main

} // end of class startbutton


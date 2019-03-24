/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23/03/2019
 * @author 
 */
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.text.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.*;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.util.Random;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;
public class verifybutton implements ActionListener {
  
  zufalleasyy zlevel1;
  JLabel jLabel4;
  JTextField jTextField1;
  JTextField jTextField2;
  points pointslevel1;
  JLabel jLabel5;
  Timerclass timerlevel1;
  JButton jButton1;
  JButton jButton2;
  public verifybutton(zufalleasyy zlevel1, JLabel jlabel4, JTextField jTextField1, JTextField jTextField2, points pointslevel1, JLabel jLabel5,Timerclass timerlevel1, JButton jButton1, JButton jButton2){ 
    
    this.zlevel1=zlevel1;
    this.jLabel4=jlabel4;
    this.jTextField1=jTextField1;
    this.jTextField2=jTextField2;
    this.pointslevel1=pointslevel1;
    this.jLabel5=jLabel5;
    this.timerlevel1=timerlevel1;
    this.jButton1=jButton1;
    this.jButton2=jButton2;
    
  }                
  public void actionPerformed(ActionEvent e){
    if(timerlevel1.getTimerNow()<timerlevel1.getV()){
      if(jTextField2.getText().equals(zlevel1.ynow().getVokabelnA(0).getDeutsch())){
        jLabel4.setText("Gut Gemacht!");
        zlevel1.getVoccc().remove(zlevel1.getK());
        jTextField1.setText(zlevel1.getVocc().getVokabelnA(0).getEnglish());
        jTextField2.setText(null);
        pointslevel1.addppoint();
        jLabel5.setText("You scored "+ pointslevel1.getPositivepoints()+" correct answers and "+pointslevel1.getNegativepoints()+ " wrong answers");
        //zlevel1.getVoccc().remove(zlevel1.getK());
      }
      
      else{ 
        jLabel4.setText("Falsch");
        zlevel1.getVoccc().remove(zlevel1.getK());
        jTextField1.setText(zlevel1.getVocc().getVokabelnA(0).getEnglish());
        pointslevel1.addnpoint();
        jLabel5.setText("You scored "+ pointslevel1.getPositivepoints() +" correct answers and "+pointslevel1.getNegativepoints() + " wrong answers");
        jTextField2.setText(null); 
        
      }
      // end of if-else
      }
      else{ 
      jButton1.setVisible(false);
      jButton2.setVisible(false);
    }     
      }
      public static void main(String[] args) {
    
  } // end of main

} // end of class verifybutton


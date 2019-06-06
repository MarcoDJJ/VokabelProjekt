/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15/02/2019
 * @author 
 */
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.event.*;
public class Timerclass{
  // Anfang Attribute
  int secondsPassed = 0;
  JLabel j;
  Timer t=new Timer();
  int v=10;
  JButton jButton3;
  JTextField jTextField3;
  int i=0;

  JTextField jTextField1;
  JTextField jTextField2;
  JButton jButton4;
  JButton jButton1;
  JButton jButton2;
  public Timerclass(JButton jButton2,JButton jButton1,JTextField jTextField1,JTextField jTextField2,JLabel jj, JButton jButton3, JTextField jTextField3,JButton jButton4){
    this.jButton2=jButton2;
    this.jButton1=jButton1;
    this.v=v;
    this.jTextField1=jTextField1;
    this.jTextField2=jTextField2;
    
    this.j=jj;
    this.jButton3=jButton3;
    this.jTextField3=jTextField3;
    this.jButton4=jButton4;
    
  }
  // Anfang Methoden
  TimerTask task = new TimerTask() {
    public void run(){
      if(secondsPassed<v){
      secondsPassed++;

      }
      else {
         jButton2.setVisible(false);
        jButton1.setVisible(true);
    jButton4.setVisible(true);
        jButton3.setVisible(true);
        jTextField3.setVisible(true);
       
        jTextField1.setText(null);
        jTextField2.setText(null);
     
        
      } 
      j.setText(secondsPassed + " ");
    
    }
  
    };
    
  // Ende Attribute
  public int getTimerNow(){
    return secondsPassed;
  }
  public void start(){
    t.scheduleAtFixedRate(task, 1000, 1000);
  }
  public static void main(String[] args) {
    
  } // end of main
  
  public int setV(int vNeu) {
    v = vNeu;
    return v;
  }
  public void setsp(int sNeu) {
    secondsPassed = sNeu;
    
  }
  public int getV() {
    return v;
  }
  
  public int getSecondsPassed() {
    return secondsPassed;
  }
  public void setI() {
    i=0;
  }
  
  // Ende Methoden
  
} // end of class Timerclass


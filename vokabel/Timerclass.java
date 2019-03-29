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
  int v = 60;
  JButton jButton3;
  JTextField jTextField3;
  int i=0;
  public Timerclass(JLabel jj, JButton jButton3, JTextField jTextField3){
     this.j=jj;
     this.jButton3=jButton3;
    this.jTextField3=jTextField3;
    }
  // Anfang Methoden
  TimerTask task = new TimerTask() {
    public void run(){
      if(secondsPassed<v && i==0){
      secondsPassed++;}
      else {
        jButton3.setVisible(true);
        jTextField3.setVisible(true);
        i=1;
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


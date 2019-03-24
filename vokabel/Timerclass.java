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
  
  public Timerclass(JLabel jj){
     this.j=jj;
    }
  // Anfang Methoden
  TimerTask task = new TimerTask() {
    public void run(){
      if(secondsPassed<v){
      secondsPassed++;}
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

  public int getV() {
    return v;
  }

  public int getSecondsPassed() {
    return secondsPassed;
  }
 
      
  // Ende Methoden
  
} // end of class Timerclass


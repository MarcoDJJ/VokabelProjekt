/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15/02/2019
 * @author 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Timer;
import java.util.TimerTask;
public class Timerclass{
  int secondsPassed=0;
  JLabel j;
  Timer t=new Timer(); 
  public Timerclass(JLabel jj){
     this.j=jj;
    }
  TimerTask task = new TimerTask() {
    public void run(){
      if(secondsPassed<60){
      secondsPassed++;}
      j.setText(secondsPassed + " ");
      
      
    }
  
    };
  public void start(){
  t.scheduleAtFixedRate(task, 1000, 1000);
    }
  public static void main(String[] args) {
     
} // end of main
  
} // end of class Timerclass

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15/02/2019
 * @author 
 */
import java.util.Timer;
import java.util.TimerTask;
public class Timerclass extends easy {
   int secondsPassed=0;
  Timer t=new Timer();
  TimerTask task = new TimerTask() {
          public void run(){
        if(secondsPassed<60){
          secondsPassed++;}
        jLabel1.setText(secondsPassed + " ");
            
  
    }
  
            };
  public void start(){
    t.scheduleAtFixedRate(task, 1000, 1000);
  }
  public static void main(String[] args) {
    
  } // end of main

} // end of class Timerclass


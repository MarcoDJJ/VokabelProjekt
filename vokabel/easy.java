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

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15/02/2019
 * @author 
 */

public class easy extends JFrame {
  // Anfang Attribute
  vokabelnarray easyy= new vokabelnarray();
  vokabel f = new vokabel("F", "t");

  
  public JLabel jLabel1 = new JLabel();
  private JButton jButton1 = new JButton();
  Timerclass tt;
  /*int secondsPassed=0;
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
  }*/
  private JLabel lEnglish = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JLabel lDeutsch = new JLabel();
    // Ende Attribute
    
  public easy() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 302;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("easy");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(72, 0, 153, 41);
    jLabel1.setText("");
    cp.add(jLabel1);
    jButton1.setBounds(24, 56, 65, 33);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
          Timerclass gg= new Timerclass();
        easyy.fuegevokabelnhinzu(f);
        jTextField1.setText(easyy.getVokabelnA(0).getDeutsch());
        gg.start();
        
        
        
      }
    });
    cp.add(jButton1);
    lEnglish.setBounds(0, 104, 89, 41);
    lEnglish.setText("English");
    cp.add(lEnglish);
    jTextField1.setBounds(96, 112, 145, 33);
    cp.add(jTextField1);
    jTextField2.setBounds(96, 160, 142, 36);
    cp.add(jTextField2);
    lDeutsch.setBounds(0, 168, 89, 25);
    lDeutsch.setText("Deutsch");
    cp.add(lDeutsch);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public easy
    
  // Anfang Methoden
  
  public static void main(String[] args) {
    new easy();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class easy


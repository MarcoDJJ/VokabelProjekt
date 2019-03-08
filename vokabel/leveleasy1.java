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
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03/03/2019
 * @author 
 */

public class leveleasy1 extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JButton jButton2 = new JButton();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  // Ende Attribute
  vokabelnarray vlevel11= new vokabelnarray();
  vokabel f1 = new vokabel("v", "vv");
  vokabelnarray vlevel12= new vokabelnarray();
  vokabel f = new vokabel("g", "gg");
  zufalleasyy zlevel1= new zufalleasyy();
  Timerclass tt;
  Timerclass timerlevel1 =new Timerclass(jLabel1);
  points pointslevel1=new points(0, 0, 0);
   /*public void keyPressed(KeyEvent e) {

    int key = e.getKeyCode();

    if(key == KeyEvent.VK_D){

        stop();
    }
}*/
  
  public leveleasy1() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 701; 
    int frameHeight = 290;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("leveleasy1");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 8, 81, 17);
    jLabel1.setText("");
    cp.add(jLabel1);
    jLabel2.setBounds(8, 96, 57, 49);
    jLabel2.setText("English");
    cp.add(jLabel2);
    jLabel3.setBounds(0, 168, 65, 41);
    jLabel3.setText("Deutsch");
    cp.add(jLabel3);
    jButton1.setBounds(0, 40, 73, 33);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    
        vlevel12.fuegevokabelnhinzu(f1);
        vlevel11.fuegevokabelnhinzu(f);
        zlevel1.fuegevoccnhinzu(vlevel12);
        zlevel1.fuegevoccnhinzu(vlevel11);
        
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        
        
        
        jTextField1.setText(zlevel1.getVocc().getVokabelnA(0).getEnglish());
        
        timerlevel1.start();
      }
    });
    
    cp.add(jButton1);
    jTextField1.setBounds(96, 96, 121, 33);
    cp.add(jTextField1);
    jTextField2.setBounds(96, 160, 113, 33);
    cp.add(jTextField2);
    jButton2.setBounds(96, 40, 65, 33);
    jButton2.setText("Verify");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        if(jTextField2.getText().equals(zlevel1.ynow().getVokabelnA(0).getDeutsch())){
          jLabel4.setText("Gut Gemacht!");
          
          jTextField1.setText(zlevel1.getVocc().getVokabelnA(0).getEnglish());
          jTextField2.setText(null);
          pointslevel1.addppoint();
          jLabel5.setText("You scored "+ pointslevel1.getPositivepoints()+" correct answers and "+pointslevel1.getNegativepoints()+ " wrong answers");
        }
        
          else{ 
          jLabel4.setText("Falsch");
          
          jTextField1.setText(zlevel1.getVocc().getVokabelnA(0).getEnglish());
          pointslevel1.addnpoint();
          jLabel5.setText("You scored "+ pointslevel1.getPositivepoints() +" correct answers and "+pointslevel1.getNegativepoints() + " wrong answers");
          jTextField2.setText(null); 
        
        }
      
    }
    });
    cp.add(jButton2);
    jLabel4.setBounds(96, 216, 113, 33);
    jLabel4.setText("");
    cp.add(jLabel4);
    jLabel5.setBounds(256, 200, 417, 49);
    jLabel5.setText("You scored 0 correct answers and 0 wrong answers");
    cp.add(jLabel5);
    // Ende Komponenten
    
  setVisible(true);
  } // end of public leveleasy1
  
  // Anfang Methoden
  
    public static void main(String[] args) {
      new leveleasy1();
  
  } // end of main
  
    public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  
  } // end of jButton1_ActionPerformed
  
    public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  
  } // end of jButton2_ActionPerformed

// Ende Methoden
} // end of class leveleasy1


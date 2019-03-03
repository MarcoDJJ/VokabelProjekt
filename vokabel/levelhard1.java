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

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03/03/2019
 * @author 
 */

public class levelhard1 extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  // Ende Attribute
  
   vokabelnarray vlevel71= new vokabelnarray();
  vokabel f12 = new vokabel("f", "ff");
  vokabelnarray vlevel72= new vokabelnarray();
  vokabel f13 = new vokabel("g", "gg");
  zufalleasyy zlevel7= new zufalleasyy();
  Timerclass tt7;
  Timerclass timerlevel7 =new Timerclass(jLabel1);
  public levelhard1() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("levelhard1");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 16, 97, 25);
    jLabel1.setText("");
    cp.add(jLabel1);
    jLabel2.setBounds(0, 104, 73, 25);
    jLabel2.setText("English");
    cp.add(jLabel2);
    jLabel3.setBounds(8, 160, 57, 41);
    jLabel3.setText("Deutsch");
    cp.add(jLabel3);
    jButton1.setBounds(0, 56, 73, 33);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
         vlevel71.fuegevokabelnhinzu(f12);
        vlevel72.fuegevokabelnhinzu(f13);
        zlevel7.fuegevoccnhinzu(vlevel71);
        zlevel7.fuegevoccnhinzu(vlevel72);
        jTextField1.setText(zlevel7.getVocc().getVokabelnA(0).getDeutsch());
        timerlevel7.start();
      }
    });
    cp.add(jButton1);
    jTextField1.setBounds(72, 104, 97, 33);
    cp.add(jTextField1);
    jTextField2.setBounds(72, 160, 81, 33);
    cp.add(jTextField2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public levelhard1
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new levelhard1();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class levelhard1


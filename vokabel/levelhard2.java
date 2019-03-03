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

public class levelhard2 extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  // Ende Attribute
    vokabelnarray vlevel81= new vokabelnarray();
  vokabel f14 = new vokabel("f", "ff");
  vokabelnarray vlevel82= new vokabelnarray();
  vokabel f15 = new vokabel("g", "gg");
  zufalleasyy zlevel8= new zufalleasyy();
  Timerclass tt8;
  Timerclass timerlevel8 =new Timerclass(jLabel1);
  public levelhard2() { 
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
    setTitle("levelhard2");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(0, 0, 81, 41);
    jLabel1.setText("");
    cp.add(jLabel1);
    jLabel2.setBounds(16, 104, 57, 33);
    jLabel2.setText("English");
    cp.add(jLabel2);
    jLabel3.setBounds(8, 168, 57, 33);
    jLabel3.setText("Deutsch");
    cp.add(jLabel3);
    jButton1.setBounds(0, 48, 97, 41);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
        vlevel81.fuegevokabelnhinzu(f14);
        vlevel82.fuegevokabelnhinzu(f15);
        zlevel8.fuegevoccnhinzu(vlevel81);
        zlevel8.fuegevoccnhinzu(vlevel82);
        jTextField1.setText(zlevel8.getVocc().getVokabelnA(0).getDeutsch());
        timerlevel8.start();
      }
    });
    cp.add(jButton1);
    jTextField1.setBounds(88, 104, 81, 25);
    cp.add(jTextField1);
    jTextField2.setBounds(80, 176, 81, 25);
    cp.add(jTextField2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public levelhard2
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new levelhard2();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class levelhard2


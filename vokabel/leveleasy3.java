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

public class leveleasy3 extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  // Ende Attribute
   vokabelnarray vlevel31= new vokabelnarray();
  vokabel f4 = new vokabel("f", "ff");
  vokabelnarray vlevel32= new vokabelnarray();
  vokabel f5 = new vokabel("g", "gg");
  zufalleasyy zlevel3= new zufalleasyy();
  Timerclass tt3;
  Timerclass timerlevel3 =new Timerclass(jLabel1);
  public leveleasy3() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 404; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("leveleasy3");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(0, 8, 81, 33);
    jLabel1.setText("");
    cp.add(jLabel1);
    jLabel2.setBounds(0, 96, 105, 33);
    jLabel2.setText("English");
    cp.add(jLabel2);
    jLabel3.setBounds(0, 160, 89, 33);
    jLabel3.setText("Deutsch");
    cp.add(jLabel3);
    jButton1.setBounds(8, 56, 81, 25);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
        vlevel31.fuegevokabelnhinzu(f4);
        vlevel32.fuegevokabelnhinzu(f5);
        zlevel3.fuegevoccnhinzu(vlevel31);
        zlevel3.fuegevoccnhinzu(vlevel32);
        jTextField1.setText(zlevel3.getVocc().getVokabelnA(0).getDeutsch());
        timerlevel3.start();
      }
    });
    cp.add(jButton1);
    jTextField1.setBounds(112, 104, 89, 25);
    cp.add(jTextField1);
    jTextField2.setBounds(104, 168, 105, 33);
    cp.add(jTextField2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public leveleasy3
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new leveleasy3();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class leveleasy3


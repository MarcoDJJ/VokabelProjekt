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

public class levelnormal1 extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JButton jButton1 = new JButton();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  // Ende Attribute
   vokabelnarray vlevel41= new vokabelnarray();
  vokabel f6 = new vokabel("f", "ff");
  vokabelnarray vlevel42= new vokabelnarray();
  vokabel f7 = new vokabel("g", "gg");
  zufalleasyy zlevel4= new zufalleasyy();
  Timerclass tt4;
  Timerclass timerlevel4 =new Timerclass(jLabel1);
  public levelnormal1() { 
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
    setTitle("levelnormal1");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 8, 73, 33);
    jLabel1.setText("");
    cp.add(jLabel1);
    jButton1.setBounds(8, 56, 65, 33);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
         vlevel41.fuegevokabelnhinzu(f6);
        vlevel42.fuegevokabelnhinzu(f7);
        zlevel4.fuegevoccnhinzu(vlevel41);
        zlevel4.fuegevoccnhinzu(vlevel42);
        jTextField1.setText(zlevel4.getVocc().getVokabelnA(0).getDeutsch());
        timerlevel4.start();
      }
    });
    cp.add(jButton1);
    jLabel2.setBounds(0, 104, 65, 33);
    jLabel2.setText("English");
    cp.add(jLabel2);
    jLabel3.setBounds(0, 144, 73, 25);
    jLabel3.setText("Deutsch");
    cp.add(jLabel3);
    jTextField1.setBounds(88, 104, 113, 25);
    cp.add(jTextField1);
    jTextField2.setBounds(80, 144, 113, 25);
    cp.add(jTextField2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public levelnormal1
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new levelnormal1();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class levelnormal1


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

public class levelhard3 extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  // Ende Attribute
  
    vokabelnarray vlevel91= new vokabelnarray();
  vokabel f16 = new vokabel("f", "ff");
  vokabelnarray vlevel92= new vokabelnarray();
  vokabel f17 = new vokabel("g", "gg");
  zufalleasyy zlevel9= new zufalleasyy();
  Timerclass tt9;
  Timerclass timerlevel9 =new Timerclass(jLabel1);
  public levelhard3() { 
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
    setTitle("levelhard3");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 8, 89, 33);
    jLabel1.setText("");
    cp.add(jLabel1);
    jLabel2.setBounds(0, 112, 89, 33);
    jLabel2.setText("English");
    cp.add(jLabel2);
    jLabel3.setBounds(8, 184, 81, 33);
    jLabel3.setText("Deutsch");
    cp.add(jLabel3);
    jButton1.setBounds(0, 56, 81, 33);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
        vlevel91.fuegevokabelnhinzu(f16);
        vlevel92.fuegevokabelnhinzu(f17);
        zlevel9.fuegevoccnhinzu(vlevel91);
        zlevel9.fuegevoccnhinzu(vlevel92);
        jTextField1.setText(zlevel9.getVocc().getVokabelnA(0).getDeutsch());
        timerlevel9.start();
      }
    });
    cp.add(jButton1);
    jTextField1.setBounds(104, 120, 89, 25);
    cp.add(jTextField1);
    jTextField2.setBounds(104, 192, 65, 25);
    cp.add(jTextField2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public levelhard3
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new levelhard3();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class levelhard3


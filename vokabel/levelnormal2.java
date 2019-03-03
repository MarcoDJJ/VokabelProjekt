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

public class levelnormal2 extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
    private JButton jButton1 = new JButton();
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
  
  vokabelnarray vlevel51= new vokabelnarray();
  vokabel f8 = new vokabel("f", "ff");
  vokabelnarray vlevel52= new vokabelnarray();
  vokabel f9 = new vokabel("g", "gg");
  zufalleasyy zlevel5= new zufalleasyy();
  Timerclass tt5;
  Timerclass timerlevel5 =new Timerclass(jLabel1);
    // Ende Attribute
    
    public levelnormal2() { 
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
    setTitle("levelnormal2");
    setResizable(false);
    Container cp = getContentPane();
  cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 16, 57, 33);
  jLabel1.setText("");
    cp.add(jLabel1);
  jLabel2.setBounds(0, 96, 65, 33);
    jLabel2.setText("English");
    cp.add(jLabel2);
jLabel3.setBounds(0, 168, 57, 33);
    jLabel3.setText("Deutsch");
    cp.add(jLabel3);
    jButton1.setBounds(8, 56, 65, 25);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
         vlevel51.fuegevokabelnhinzu(f8);
        vlevel52.fuegevokabelnhinzu(f9);
        zlevel5.fuegevoccnhinzu(vlevel51);
        zlevel5.fuegevoccnhinzu(vlevel52);
        jTextField1.setText(zlevel5.getVocc().getVokabelnA(0).getDeutsch());
        timerlevel5.start();
      }
    });
    cp.add(jButton1);
    jTextField1.setBounds(72, 104, 89, 33);
    cp.add(jTextField1);
    jTextField2.setBounds(72, 168, 97, 41);
    cp.add(jTextField2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public levelnormal2
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new levelnormal2();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class levelnormal2


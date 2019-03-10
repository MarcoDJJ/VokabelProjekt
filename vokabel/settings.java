import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08/03/2019
 * @author 
 */

public class settings extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JNumberField jNumberField1 = new JNumberField();
  private JSlider jSlider1 = new JSlider();
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
   Timerclass stimer=new Timerclass(jLabel1);
  public settings() { 
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
    setTitle("settings");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(16, 24, 65, 33);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
        stimer.setV(jSlider1.getBounds());
      }
    });
    cp.add(jButton1);
    jNumberField1.setBounds(104, 16, 129, 41);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jSlider1.setBounds(96, 64, 153, 57);
    jSlider1.setMinorTickSpacing(10);
    jSlider1.setMajorTickSpacing(50);
    jSlider1.setPaintTicks(true);
    jSlider1.setPaintLabels(true);
    cp.add(jSlider1);
    jLabel1.setBounds(24, 40, 9, 9);
    jLabel1.setText("text");
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public settings
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new settings();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class settings


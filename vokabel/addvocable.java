import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15/05/2019
 * @author 
 */

public class addvocable extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  // Ende Attribute
  
  public addvocable() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 600; 
    int frameHeight = 361;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("addvocable");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(16, 8, 185, 41);
    jButton1.setText("add a couple of vocables");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jLabel1.setBounds(128, 64, 81, 41);
    jLabel1.setText("Deutsch");
    cp.add(jLabel1);
    jLabel2.setBounds(128, 128, 81, 41);
    jLabel2.setText("English");
    cp.add(jLabel2);
    jTextField1.setBounds(0, 64, 105, 41);
    cp.add(jTextField1);
    jTextField2.setBounds(0, 128, 105, 41);
    cp.add(jTextField2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public addvocable
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new addvocable();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class addvocable


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03/03/2019
 * @author 
 */

public class easy extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  // Ende Attribute
  
  public easy() { 
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
    setTitle("easy");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(80, 96, 113, 41);
    jButton1.setText("leveleasy1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
        leveleasy1 level1=new leveleasy1();
        level1.setVisible(true);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(80, 144, 113, 41);
    jButton2.setText("leveleasy2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
        leveleasy2 level2=new leveleasy2();
        level2.setVisible(true);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(80, 192, 113, 41);
    jButton3.setText("leveleasy3");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
       
        leveleasy3 level3=new leveleasy3();
        level3.setVisible(true);
      }
    });
    cp.add(jButton3);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public easy
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new easy();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton3_ActionPerformed

  // Ende Methoden
} // end of class easy


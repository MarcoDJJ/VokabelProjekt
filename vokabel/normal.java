import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15/02/2019
 * @author 
 */

public class normal extends JFrame {
  // Anfang Attribute
  // Ende Attribute
  
  public normal() { 
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
    setTitle("normal");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    // Ende Komponenten
    
    setVisible(true);
  } // end of public normal
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new normal();
  } // end of main
  
  // Ende Methoden
} // end of class normal


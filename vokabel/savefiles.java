import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;
import java.text.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.*;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 24/03/2019
 * @author 
 */

public class savefiles extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
  ArrayList<String> savefiless = new ArrayList<>();
  
  public savefiles() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 482; 
    int frameHeight = 358;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("savefiles");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(0, 16, 377, 273);
    jLabel1.setText("text");
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public savefiles
  public void addsave(String ss){
    savefiless.add(ss);
  }
  // Anfang Methoden
  public void setjlabel1text(String sss){
    jLabel1.setText(sss);
    }
  public static void main(String[] args) {
    new savefiles();
  } // end of main
  
  public ArrayList<String> getSavefiless() {
    return savefiless;
  }

  // Ende Methoden
} // end of class savefiles


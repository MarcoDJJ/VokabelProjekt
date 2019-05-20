import java.io.*;
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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
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
  boolean bl=true;
  // Ende Attribute
  
  public easy(boolean bl) { 
    // Frame-Initialisierung
    super();
    this.bl=bl;
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
        
        level levell=new level(0,bl);
        
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(80, 144, 113, 41);
    jButton2.setText("leveleasy2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
         
        level levell=new level(1,bl);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(80, 192, 113, 41);
    jButton3.setText("leveleasy3");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
           
        level levell=new level(2,bl);
      }
    });
    cp.add(jButton3);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public easy
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    
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


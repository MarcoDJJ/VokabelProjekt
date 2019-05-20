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

import java.util.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15/02/2019
 * @author 
 */

public class home extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  
  private JLabel jLabel1 = new JLabel();
  boolean bl=true;
  // Ende Attribute
  
  public home() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 596; 
    int frameHeight = 334;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("home");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(80, 16, 113, 41);
    jButton1.setText("Easy");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
        easy easy1=new easy(bl);
         easy1.setVisible(true);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(80, 64, 113, 41);
    jButton2.setText("Normal");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
        normal level2=new normal(bl);
         level2.setVisible(true);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(80, 112, 113, 41);
    jButton3.setText("Hard");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
        hard level3=new hard(bl);
         level3.setVisible(true);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(83, 168, 107, 41);
    jButton4.setText("Personalized");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
        personalized level4= new personalized();
         level4.setVisible(true);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(200, 216, 81, 41);
    jButton5.setText("Settings");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(320, 64, 81, 33);
    jButton6.setText("jButton6");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        if(bl==true){
           bl=false;
          jLabel1.setText("Ask in German and answer in Engish");
          }
        else {
          bl=true;
          jLabel1.setText("Ask in English and answer in German");
        } // end of if-else
      }
    });
    cp.add(jButton6);
    jLabel1.setBounds(256, 16, 233, 33);
    jLabel1.setText("Ask in English and answer in German");
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public home
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new home();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton7_ActionPerformed

  // Ende Methoden
} // end of class home


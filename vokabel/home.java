
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


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
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
  
  boolean bl=true;
  
  private JButton jButton7 = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JButton jButton5 = new JButton();
  // Ende Attribute
  
  public home() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 526; 
    int frameHeight = 369;
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
    
    try (FileInputStream fis = new FileInputStream ("language.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      bl= (boolean) ois.readObject();
      
      
      
    }                        
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Lesen von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Lesen von dummy.ser: Ein- Ausgabefehler");
    }
    catch(ClassNotFoundException e)
    {
      System.out.println("Fehler beim Erzeugen des Objekts: Klasse nicht gefunden.");
    }
    
    
    jButton1.setBounds(56, 96, 113, 41);
    jButton1.setText("Easy");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
        easy easy1=new easy(bl);
        easy1.setVisible(true);
      }
    });
    jButton1.setBackground(Color.GREEN);
    jButton1.setFont(new Font("Calibri", Font.BOLD, 16));
    jButton1.setForeground(Color.BLACK);
    cp.add(jButton1);
    jButton2.setBounds(56, 144, 113, 41);
    jButton2.setText("Normal");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
        normal level2=new normal(bl);
        level2.setVisible(true);
      }
    });
    jButton2.setBackground(Color.BLUE);
    jButton2.setFont(new Font("Calibri", Font.BOLD, 16));
    jButton2.setForeground(Color.BLACK);
    cp.add(jButton2);
    jButton3.setBounds(56, 192, 113, 41);
    jButton3.setText("Hard");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
        hard level3=new hard(bl);
        level3.setVisible(true);
      }
    });
    jButton3.setBackground(Color.RED);
    jButton3.setFont(new Font("Calibri", Font.BOLD, 16));
    jButton3.setForeground(Color.BLACK);
    cp.add(jButton3);
    jButton4.setBounds(363, 96, 113, 41);
    jButton4.setText("Personalized");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
        personalized level4= new personalized(bl);
        level4.setVisible(true);
      }
    });
    jButton4.setBackground(Color.YELLOW);
    jButton4.setForeground(Color.BLACK);
    jButton4.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton4);
    
    
    jButton7.setBounds(400, 200, 74, 34);
    jButton7.setText("Settings");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        settings sss=new settings();
      }
    });
    
    jButton7.setHorizontalAlignment(SwingConstants.CENTER);
    
    jButton7.setBackground(new Color(0xC0C0C0));
    jButton7.setVerticalAlignment(SwingConstants.CENTER);
    jButton7.setHorizontalTextPosition(SwingConstants.CENTER);
    jButton7.setFont(new Font("Calibri", Font.BOLD, 14));
    jButton7.setForeground(Color.BLACK);
    
    
    cp.add(jButton7);
    cp.setBackground(Color.BLACK);
    jLabel1.setBounds(112, 8, 273, 65);
    jLabel1.setText("Vocabulary Game");
    jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
    jLabel1.setForeground(Color.WHITE);
    jLabel1.setFont(new Font("Calibri", Font.BOLD, 36));
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel1);
    jLabel2.setBounds(296, 304, 217, 33);
    jLabel2.setText("Created by: Marco Di Giacomo, Federico Cariti, Matteo Tausch");
    jLabel2.setFont(new Font("Calibri", Font.ITALIC, 8));
    jLabel2.setForeground(Color.WHITE);
    jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel2.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(jLabel2);
    jButton5.setBounds(392, 152, 81, 33);
    jButton5.setText("Tutorial");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        /*File file = new File("tutorial.pdf");
        try {
          
          Desktop.getDesktop().open(file);
        }catch (IOException exception){
          exception.printStackTrace();
        } */
        
        
        
        
      }
    });
    cp.add(jButton5);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public home
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new home();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton2_ActionPerformed
  
  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton3_ActionPerformed
  
  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton4_ActionPerformed
  
  public void jButton7_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton7_ActionPerformed
  
  public void jButton5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    
  } // end of jButton5_ActionPerformed
  
  // Ende Methoden
} // end of class home


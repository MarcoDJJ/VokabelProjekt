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
  boolean bl=true;
  int l;
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
  
  public easy(boolean bl,int l) { 
    // Frame-Initialisierung
    //Easy ist eine Klasse, in der Sie auswählen können, mit welchen Wörtern Sie üben möchten.
    super();
    this.bl=bl;
    this.l=l;
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Choose the group of vocs");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(88, 88, 113, 41);
    
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    //Abhängig von der von Home geerbten Zahl werden die angeforderten Wortgruppen geändert
    if(l==1){
      jLabel1.setText("Easy");
      jButton1.setText("Food");
      jButton2.setText("Animals");
      jButton1.setBackground(Color.GREEN);  
      jButton2.setBackground(Color.GREEN);
    }
    if(l==2){
      jLabel1.setText("Normal");
      jButton1.setText("Sport");
      jButton2.setText("Politic");
      jButton1.setBackground(Color.BLUE);  
      jButton2.setBackground(Color.BLUE);
    }
    if(l==3){
      jLabel1.setText("Hard");
      jButton1.setText("Economic");
      jButton2.setText("Physics");
      jButton1.setBackground(Color.RED);  
      jButton2.setBackground(Color.RED);
    }
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        if(l==1){
          level levell=new level(0,bl);
        }
        if(l==2){
          level levell=new level(2,bl);
        }
        if(l==3){
          level levell=new level(4,bl);
          
        }
      } 
      });
        
   
    jButton1.setFont(new Font("Calibri", Font.BOLD, 16));
      cp.add(jButton1);
    jButton2.setBounds(88, 136, 113, 41);
      
      jButton2.setMargin(new Insets(2, 2, 2, 2));
      jButton2.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
        
        if(l==1){
        level levell=new level(1,bl);
        }
        if(l==2){
        level levell=new level(3,bl);
        }
        if(l==3){
         level levell=new level(5,bl);
        }
        }
        });
    jButton2.setFont(new Font("Calibri", Font.BOLD, 16));
        cp.add(jButton2);
        
        
    jLabel1.setBounds(32, 16, 217, 57);
        
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setFont(new Font("Calibri", Font.BOLD, 36));
    jLabel1.setForeground(Color.WHITE);
        cp.add(jLabel1);
    cp.setBackground(new Color(0x404040));
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
      
      // Ende Methoden
    } // end of class easy
    

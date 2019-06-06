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
 * @version 1.0 vom 15/05/2019
 * @author 
 */

public class addvocable extends JFrame implements Serializable {
  // Anfang Attribute
  
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JLabel jLabel3 = new JLabel();
  // Ende Attribute
  zufalleasyy zlevel1=new zufalleasyy();
  
  public addvocable() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 712; 
    int frameHeight = 317;
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
    
    
    
    jLabel1.setBounds(128, 96, 81, 41);
    jLabel1.setText("Deutsch");
    jLabel1.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel1.setForeground(Color.WHITE);
    cp.add(jLabel1);
    jLabel2.setBounds(128, 168, 81, 41);
    jLabel2.setText("English");
    jLabel2.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel2.setForeground(Color.WHITE);
    cp.add(jLabel2);
    jTextField1.setBounds(0, 168, 105, 41);
    cp.add(jTextField1);
    jTextField2.setBounds(0, 96, 105, 41);
    cp.add(jTextField2);
    jButton2.setBounds(264, 96, 113, 49);
    jButton2.setText("Food");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    
     jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        addAlistener a=new addAlistener(0,zlevel1,jTextField1,jTextField2);
      }
    }); 
     
    jButton2.setBackground(Color.GREEN);
    jButton2.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton2);
    jButton3.setBounds(264, 160, 113, 49);
    jButton3.setText("Animal");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        addAlistener a=new addAlistener(1,zlevel1,jTextField1,jTextField2);
      }
    });
    jButton3.setBackground(Color.GREEN);
    jButton3.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton3);
    jButton4.setBounds(400, 96, 113, 49);
    jButton4.setText("Sport");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        addAlistener a=new addAlistener(2,zlevel1,jTextField1,jTextField2);
      }
    });
    jButton4.setBackground(Color.BLUE);
    jButton4.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton4);
    jButton5.setBounds(400, 160, 113, 49);
    jButton5.setText("Politic");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        addAlistener a=new addAlistener(3,zlevel1,jTextField1,jTextField2);
      }
    });
    jButton5.setBackground(Color.BLUE);
    jButton5.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton5);
    jButton6.setBounds(536, 96, 113, 49);
    jButton6.setText("jButton6");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        addAlistener a=new addAlistener(4,zlevel1,jTextField1,jTextField2);
      }
    });
    jButton6.setBackground(Color.RED);
    jButton6.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton6);
    jButton7.setBounds(536, 160, 113, 49);
    jButton7.setText("jButton7");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        addAlistener a=new addAlistener(5,zlevel1,jTextField1,jTextField2);
      }
    });
    jButton7.setBackground(Color.RED);
    jButton7.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton7);
    
    
    
    jLabel3.setBounds(160, 16, 393, 48);
    jLabel3.setText("Add a couple of vocables");
    jLabel3.setFont(new Font("Calibri", Font.BOLD, 36));
    jLabel3.setForeground(Color.WHITE);
    jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(jLabel3);
    cp.setBackground(new Color(0x404040));
    // Ende Komponenten
    
    setVisible(true);
  } // end of public addvocable
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    
  } // end of main
  public class addAlistener extends JFrame{
    
    int i; 
    zufalleasyy zlevel1;
    JTextField jTextField1; 
    JTextField jTextField2;       
        public addAlistener(int i, zufalleasyy zlevel1,JTextField jTextField1, JTextField jTextField2){  //Hier werden die Wörter in einem bestimmten Ordner gespeichert. Der Ordner wird anhand der eingegebenen Nummer ausgewählt
        this.jTextField1=jTextField1;
        this.jTextField2=jTextField2;
        this.zlevel1=zlevel1;
        this.i=i;
         if(jTextField2.getText().equals("") || jTextField1.getText().equals("") || jTextField2.getText().equals(null) || jTextField1.getText().equals(null)){    //Falls der Spieler nichts schreibt, wird das Vokabel nicht gespeichert
          
          System.out.println("It is not possible to insert the entered couple of vocables"); 
        }
        else{
         readzufalleasyy r=new readzufalleasyy(zlevel1,i); //readzufalleasyy ist eine Klasse, die eine Datei liest, die die Vokabeln enthält, und sie in die ihr zugewiesene Arrayliste einfügt
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(i,zlevel1); // addzufalleasyy ist eine Klasse, die die neue Vokabeln in einer bestimmten Datei speichert
        }                                  
        
        jTextField2.setText(null);
        jTextField1.setText(null);
         }
    
    
          }
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

  public void jButton8_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton8_ActionPerformed

  public void jButton10_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton10_ActionPerformed

  // Ende Methoden
} // end of class addvocable


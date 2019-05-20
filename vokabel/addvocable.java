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
  private JButton jButton1 = new JButton();
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
  private JButton jButton8 = new JButton();
  private JButton jButton9 = new JButton();
  private JButton jButton10 = new JButton();
  // Ende Attribute
  zufalleasyy zlevel1=new zufalleasyy();
  
  public addvocable() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 712; 
    int frameHeight = 295;
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
    jButton2.setBounds(264, 56, 113, 49);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        readzufalleasyy r=new readzufalleasyy(zlevel1,0);
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(0,zlevel1);
        
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(264, 112, 113, 49);
    jButton3.setText("jButton3");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        readzufalleasyy r=new readzufalleasyy(zlevel1,1);
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(1,zlevel1);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(264, 168, 113, 49);
    jButton4.setText("jButton4");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        readzufalleasyy r=new readzufalleasyy(zlevel1,2);
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(2,zlevel1);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(392, 56, 113, 49);
    jButton5.setText("jButton5");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        readzufalleasyy r=new readzufalleasyy(zlevel1,3);
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(3,zlevel1);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(392, 112, 113, 49);
    jButton6.setText("jButton6");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        readzufalleasyy r=new readzufalleasyy(zlevel1,4);
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(4,zlevel1);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(392, 168, 113, 49);
    jButton7.setText("jButton7");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        readzufalleasyy r=new readzufalleasyy(zlevel1,5);
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(5,zlevel1);
      }
    });
    cp.add(jButton7);
    jButton8.setBounds(520, 56, 113, 49);
    jButton8.setText("jButton8");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        readzufalleasyy r=new readzufalleasyy(zlevel1,6);
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(6,zlevel1);
      }
    });
    cp.add(jButton8);
    jButton9.setBounds(520, 112, 113, 49);
    jButton9.setText("jButton9");
    jButton9.setMargin(new Insets(2, 2, 2, 2));
    jButton9.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        readzufalleasyy r=new readzufalleasyy(zlevel1,7);
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(7,zlevel1);
      }
    });
    cp.add(jButton9);
    jButton10.setBounds(520, 168, 113, 49);
    jButton10.setText("jButton10");
    jButton10.setMargin(new Insets(2, 2, 2, 2));
    jButton10.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        readzufalleasyy r=new readzufalleasyy(zlevel1,8);
        vokabel v=new vokabel(jTextField1.getText(),jTextField2.getText());
        zlevel1.fuegevoccnhinzu(v);
        addzufalleasyy add= new addzufalleasyy(8,zlevel1);
      }
    });
    cp.add(jButton10);
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

  public void jButton9_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton9_ActionPerformed

  public void jButton10_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton10_ActionPerformed

  // Ende Methoden
} // end of class addvocable


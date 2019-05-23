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
import java.nio.file.*; 
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 22/05/2019
 * @author 
 */

public class settings extends JFrame implements Serializable {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JSlider jSlider1 = new JSlider();
  private JLabel jLabel1 = new JLabel();
  private JButton jButton2 = new JButton();
  private JLabel jLabel2 = new JLabel();
  boolean bl;
  private JButton jButton3 = new JButton();
  private JLabel jLabel3 = new JLabel();
  // Ende Attribute
  
  public settings() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 526; 
    int frameHeight = 409;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("settings");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(24, 184, 113, 41);
    jButton1.setText("Set the timer");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        try
        { 
            Files.deleteIfExists(Paths.get("timer.ser")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
        try (FileOutputStream fos = new FileOutputStream ("timer.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos)) {
      
      
          oos.writeObject (jSlider1.getValue());
          jLabel1.setText("The timer has been set at "+ jSlider1.getValue() + " seconds");
      
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
    }
      }
    });
    jButton1.setBackground(Color.WHITE);
    jButton1.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton1);
    jSlider1.setBounds(152, 184, 281, 49);
    jSlider1.setMinorTickSpacing(10);
    jSlider1.setMajorTickSpacing(50);
    jSlider1.setPaintTicks(true);
    jSlider1.setPaintLabels(true);
    jSlider1.setMaximum(300);
    jSlider1.setBackground(Color.WHITE);
    cp.add(jSlider1);
    jLabel1.setBounds(24, 240, 265, 41);
    jLabel1.setText(null);
    jLabel1.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel1.setForeground(Color.WHITE);
    cp.add(jLabel1);
    jButton2.setBounds(24, 296, 113, 41);
    jButton2.setText("Change");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    
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
    if(bl==true){
           jLabel2.setText("Ask in English and answer in German");
         
          }
        else {
                jLabel2.setText("Ask in German and answer in Engish");
         
          }    
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        if(bl==true){
           bl=false;
          jLabel2.setText("Ask in German and answer in English");
          }
        else {
          bl=true;
          jLabel2.setText("Ask in English and answer in German");
          }
          try
        { 
            Files.deleteIfExists(Paths.get("language.ser")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
       
        
        try (FileOutputStream fos = new FileOutputStream ("language.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos)) {
      
      
      oos.writeObject (bl);
      
      
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
    }
          }
    });
    jButton2.setBackground(Color.WHITE);
    jButton2.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton2);
    jLabel2.setBounds(168, 288, 265, 49);
    
    jLabel2.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel2.setForeground(Color.WHITE);
    cp.add(jLabel2);
    jButton3.setBounds(24, 120, 209, 41);
    jButton3.setText("Add a couple of vocables");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        addvocable add=new addvocable();
      }
    });
    jButton3.setBackground(Color.WHITE);
    jButton3.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton3);
    jLabel3.setBounds(104, 8, 297, 65);
    jLabel3.setText("Settings");
    jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel3.setFont(new Font("Calibri", Font.BOLD, 36));
    jLabel3.setForeground(Color.WHITE);
    cp.add(jLabel3);
    cp.setBackground(Color.BLACK);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public settings
    
  // Anfang Methoden
  
  public static void main(String[] args) {

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

  // Ende Methoden
} // end of class settings


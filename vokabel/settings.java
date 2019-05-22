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
  // Ende Attribute
  
  public settings() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 526; 
    int frameHeight = 304;
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
    
    jButton1.setBounds(32, 80, 105, 41);
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
    cp.add(jButton1);
    jSlider1.setBounds(32, 8, 281, 49);
    jSlider1.setMinorTickSpacing(10);
    jSlider1.setMajorTickSpacing(50);
    jSlider1.setPaintTicks(true);
    jSlider1.setPaintLabels(true);
    jSlider1.setMaximum(300);
    cp.add(jSlider1);
    jLabel1.setBounds(168, 80, 265, 41);
    jLabel1.setText(null);
    cp.add(jLabel1);
    jButton2.setBounds(32, 160, 113, 41);
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
    cp.add(jButton2);
    jLabel2.setBounds(160, 160, 265, 49);
    
    cp.add(jLabel2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public settings
    
  // Anfang Methoden
  
  public static void main(String[] args) {
    new settings();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton2_ActionPerformed

  // Ende Methoden
} // end of class settings


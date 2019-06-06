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
 * @version 1.0 vom 03/03/2019
 * @author 
 */

public class personalized extends JFrame implements Serializable {
  // Anfang Attribute
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JButton jButton2 = new JButton();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JButton jButton3 = new JButton();
  private JTextField jTextField3 = new JTextField();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JLabel jLabel6 = new JLabel();
  private JLabel jLabel7 = new JLabel();
  private JTextField jTextField4 = new JTextField();
  private JTextField jTextField5 = new JTextField();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JLabel jLabel8 = new JLabel();
  // Ende Attribute
  
  
  
  DefaultListModel jl;
  boolean bl;
  zufalleasyy zlevel1= new zufalleasyy();

  int j=0;
  points pointslevel1=new points(0, 0, 0);
  savefiles s= new savefiles(); 
  
  

  public personalized() { 
    // Frame-Initialisierung
    super();
   
    try (FileInputStream fis = new FileInputStream ("language.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      this.bl= (boolean) ois.readObject();
      
      
      
    }                        
    catch(FileNotFoundException e)
    {
      System.out.println("");
    }
    catch(IOException e)
    {
      System.out.println("");
    }
    catch(ClassNotFoundException e)
    {
      System.out.println("");
    }
    
     try (FileInputStream fis = new FileInputStream ("savefiles.ser");
        ObjectInputStream ois = new ObjectInputStream (fis)) {
          jl= (DefaultListModel) ois.readObject();
          s.setgleichjlistmodel(jl);
          
          
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
    
    s.setVisible(false);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1391; 
    int frameHeight = 504;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Personalized");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel2.setBounds(0, 240, 89, 41);
    
    jLabel2.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel2.setForeground(Color.WHITE);
    cp.add(jLabel2);
    jLabel3.setBounds(0, 168, 89, 41);
    
    jLabel3.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel3.setForeground(Color.WHITE);
    cp.add(jLabel3);
    jButton1.setBounds(600, 96, 73, 33);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton7.setVisible(false);
    
    
    
    
    
    
    
    //indexof
    //remove(Object o)
    
    //if(timerlevel1.getSecondsPassed()<60){
    
    
    jButton1.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton1);
    jTextField1.setBounds(96, 176, 121, 33);
    cp.add(jTextField1);
    jTextField2.setBounds(96, 240, 121, 41);
    cp.add(jTextField2);
    jButton2.setBounds(96, 112, 81, 33);
    jButton2.setText("Verify");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    
    
    
    
    
    
    
    jButton2.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton2);
    jLabel4.setBounds(120, 336, 113, 33);
    jLabel4.setText("");
    jLabel4.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel4.setForeground(Color.WHITE);
    cp.add(jLabel4);
    jLabel5.setBounds(248, 328, 417, 49);
    jLabel5.setText("You scored " +pointslevel1.getPositivepoints()+ " correct answers and " +pointslevel1.getNegativepoints()+" wrong answers");
    jLabel5.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel5.setForeground(Color.WHITE);
    cp.add(jLabel5);
    jButton3.setBounds(312, 264, 177, 41);
    jButton3.setText("save your results");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jTextField3.setText("write a title for your save file");
    jTextField3.setVisible(false);
    jButton3.setVisible(false);
    jButton4.setVisible(false);
    
    jButton2.setVisible(false);
    jLabel2.setVisible(false);
    jLabel3.setVisible(false);
    jLabel5.setVisible(false);
    jTextField1.setVisible(false);
    jTextField2.setVisible(false);
    if(bl==false){
      jLabel2.setText("English");
      jLabel3.setText("Deutsch"); 
    }
    else{
      jLabel2.setText("Deutsch");
      jLabel3.setText("English");
      
    }
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        jButton2.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel5.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jLabel7.setVisible(false);
        jLabel6.setVisible(false);
        jTextField5.setVisible(false);
        jTextField4.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(true);
        jButton4.setVisible(false);
        jTextField3.setVisible(false);
        jButton3.setVisible(false);
        
        if(bl==false){
          
          jTextField1.setText(zlevel1.getVocc().getEnglish());
          
          
          
        }
        else{
          jTextField1.setText(zlevel1.getVocc().getDeutsch());
          
          
          
          
        }
        
        jButton1.setVisible(false);
      }
    });
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        
        if(bl==false){
          
          if(jTextField2.getText().equals(zlevel1.ynow().getDeutsch())){
            jLabel4.setText("Well done!");
            
            
            jTextField2.setText(null);
            pointslevel1.addppoint();
            jLabel5.setText("You scored "+ pointslevel1.getPositivepoints()+" correct answer/-s and "+pointslevel1.getNegativepoints()+ " wrong answer/-s");
            //zlevel1.getVoccc().remove(zlevel1.getK());
          }
          
          else{ 
            jLabel4.setText("Wrong answer");
            
            
            pointslevel1.addnpoint();
            jLabel5.setText("You scored "+ pointslevel1.getPositivepoints() +" correct answer/-s and "+pointslevel1.getNegativepoints() + " wrong answer/-s");
            jTextField2.setText(null); 
            
          }
          jTextField1.setText(zlevel1.getVocc().getEnglish());
        }
        else{
          if(jTextField2.getText().equals(zlevel1.ynow().getEnglish())){
            jLabel4.setText("Well done!");
            
            jTextField2.setText(null);
            pointslevel1.addppoint();
            jLabel5.setText("You scored "+ pointslevel1.getPositivepoints()+" correct answer/-s and "+pointslevel1.getNegativepoints()+ " wrong answer/-s");
            //zlevel1.getVoccc().remove(zlevel1.getK());
          }
          
          else{ 
            jLabel4.setText("Wrong answer");
            
            pointslevel1.addnpoint();
            jLabel5.setText("You scored "+ pointslevel1.getPositivepoints() +" correct answer/-s and "+pointslevel1.getNegativepoints() + " wrong answer/-s");
            jTextField2.setText(null); 
            
          }
          jTextField1.setText(zlevel1.getVocc().getDeutsch());
        }
        
        
        
      }
    });
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
         s.addelement(jTextField3.getText()+" =  "+ jLabel5.getText()+" "+"with the group of words that you created");
        
        try (FileOutputStream fos = new FileOutputStream ("savefiles.ser");
        ObjectOutputStream oos = new ObjectOutputStream (fos)) {
          
          
          oos.writeObject(s.getjlist());
          
          
          
        }
        catch(FileNotFoundException e)
        {
          System.out.println("Fehler beim Schreiben von savefiles.ser: Datei nicht gefunden");
        }
        catch(IOException e)
        {
          System.out.println("Fehler beim Schreiben von savefiles.ser: Ein- Ausgabefehler");
        }
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton3.setVisible(false);
        
        pointslevel1.setpp(0);
        pointslevel1.setpn(0);
        jLabel5.setText("You scored "+ pointslevel1.getPositivepoints() +" correct answer/-s and "+pointslevel1.getNegativepoints() + " wrong answer/-s");
      }
    });
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        try (FileInputStream fis = new FileInputStream ("savefiles.ser");
        ObjectInputStream ois = new ObjectInputStream (fis)) {
          jl= (DefaultListModel) ois.readObject();
          s.addjList1Model(jl);
          
          
        }                        
        catch(FileNotFoundException e)
        {
          System.out.println("Fehler beim Lesen von savefiles.ser: Datei nicht gefunden");
        }
        catch(IOException e)
        {
          System.out.println("Fehler beim Lesen von savefiles.ser: Ein- Ausgabefehler");
        }
        catch(ClassNotFoundException e)
        {
          System.out.println("Fehler beim Erzeugen des Objekts: Klasse nicht gefunden.");
        }
        
        s.setVisible(true);
       
       
      }
    });
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        
        jButton5.setVisible(false);
        
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jTextField1.setText(zlevel1.getVocc().getEnglish());
        
        jTextField3.setVisible(false);
        
        
        pointslevel1.setpp(0);
        pointslevel1.setpn(0);
        jLabel5.setText("You scored " +pointslevel1.getPositivepoints()+ " correct answers and " +pointslevel1.getNegativepoints()+" wrong answers");
      }
    });
    
    
    
    jButton3.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton3);
    jTextField3.setBounds(760, 328, 225, 41);
    jTextField3.setFont(new Font("Calibri", Font.PLAIN, 16));
    cp.add(jTextField3);
    jButton4.setBounds(512, 264, 177, 41);
    jButton4.setText("go to your save files");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    
    jButton4.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton4);
    jButton5.setBounds(248, 40, 105, 33);
    jButton5.setText("New");
    jButton5.setVisible(false);
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    cp.add(jButton5);
    
    jLabel6.setBounds(976, 208, 121, 41);
    jLabel6.setText("Deutsch");
    jLabel6.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel6.setForeground(Color.WHITE);
    cp.add(jLabel6);
    jLabel7.setBounds(976, 144, 129, 41);
    jLabel7.setText("English");
    jLabel7.setFont(new Font("Calibri", Font.BOLD, 16));
    jLabel7.setForeground(Color.WHITE);
    cp.add(jLabel7);
    jTextField4.setBounds(1136, 144, 161, 41);
    jTextField4.setFont(new Font("Calibri", Font.PLAIN, 16));
    cp.add(jTextField4);
    jTextField5.setBounds(1136, 208, 161, 41);
    jTextField5.setFont(new Font("Calibri", Font.PLAIN, 16));
    cp.add(jTextField5);
    jButton6.setBounds(1136, 88, 97, 33);
    jButton6.setText("Add voc");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        if(jTextField5.getText().equals("") || jTextField4.getText().equals("") || jTextField4.getText().equals(null) || jTextField4.getText().equals(null)){
          
          System.out.println("It is not possible to insert the entered couple of vocables"); 
        }
        else{
          vokabel vok=new vokabel(jTextField5.getText(),jTextField4.getText());
          zlevel1.fuegevoccnhinzu(vok);
        }
        jTextField5.setText(null);
        jTextField4.setText(null);
        
      }
    });
    jButton6.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton6);
    jButton7.setBounds(576, 400, 161, 41);
    jButton7.setText("Finish");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jButton3.setVisible(true);
        jButton1.setVisible(true);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jLabel7.setVisible(true);
        jLabel6.setVisible(true);
        jTextField5.setVisible(true);
        jTextField4.setVisible(true);
        jButton6.setVisible(true);
        jButton4.setVisible(true);
        jTextField1.setText(null);
        jTextField2.setText(null);
        jButton7.setVisible(false);
        jTextField3.setVisible(true);
        jLabel4.setText(null);
      }
    });
    jButton7.setFont(new Font("Calibri", Font.BOLD, 16));
    cp.add(jButton7);
    jLabel8.setBounds(272, 8, 713, 73);
    jLabel8.setText("Personalized");
    jLabel8.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel8.setFont(new Font("Calibri", Font.BOLD, 36));
    jLabel8.setForeground(Color.WHITE);
    cp.add(jLabel8);
    cp.setBackground(new Color(0x404040));
    // Ende Komponenten
    
    setVisible(true);
    //}
    /*else{
    jButton1.setVisible(false);
    jButton2.setVisible(false);
    } */
  }
  // end of public level
  
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
} // end of class level
    

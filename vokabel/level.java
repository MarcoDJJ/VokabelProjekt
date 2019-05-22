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

public class level extends JFrame implements Serializable {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
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
  // Ende Attribute
  
  
  
  
  boolean bl=true;
  zufalleasyy zlevel1= new zufalleasyy();
  boolean b=bl;
  int j=0;
  points pointslevel1=new points(0, 0, 0);
  savefiles s= new savefiles(); 
   int t1=60;
  Timerclass timerlevel1 =new Timerclass(jTextField1,jTextField2,jButton5,jLabel1,jButton3,jTextField3);
  /*public void keyPressed(KeyEvent e) {
  
  int key = e.getKeyCode();
  
  if(key == KeyEvent.VK_D){
  
  stop();
  }
  }*/
  
  public level(int j,boolean bl) { 
    // Frame-Initialisierung
    super();
    this.bl=bl;
    b=bl;
    this.j=j;
    
    s.setVisible(false);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1055; 
    int frameHeight = 311;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("leveleasy1");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(8, 8, 81, 17);
    jLabel1.setText("");
    cp.add(jLabel1);
    jLabel2.setBounds(0, 96, 57, 49);
    
    cp.add(jLabel2);
    jLabel3.setBounds(0, 168, 65, 41);
    
    cp.add(jLabel3);
    jButton1.setBounds(0, 40, 73, 33);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    try (FileInputStream fis = new FileInputStream ("timer.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      t1= (int) ois.readObject();
      timerlevel1.setV(t1);
      
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
    
    
    
    
    
    
    
    //indexof
    //remove(Object o)
    
    //if(timerlevel1.getSecondsPassed()<60){
    
    
    cp.add(jButton1);
    jTextField1.setBounds(96, 96, 121, 33);
    cp.add(jTextField1);
    jTextField2.setBounds(96, 160, 113, 33);
    cp.add(jTextField2);
    jButton2.setBounds(96, 40, 65, 33);
    jButton2.setText("Verify");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    
    
    //jButton1.addActionListener(new startbutton(j,jTextField1, timerlevel1, zlevel1,jButton1));
    //jButton2.addActionListener(new verifybutton(zlevel1, jLabel4, jTextField1, jTextField2, pointslevel1, jLabel5, timerlevel1,jButton1,jButton2));
    /*jButton1.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
    jButton2_ActionPerformed(evt);
    System.out.println(timerlevel1.getV());
    }
    });  */
    
    
    
    
    cp.add(jButton2);
    jLabel4.setBounds(96, 216, 113, 33);
    jLabel4.setText("");
    cp.add(jLabel4);
    jLabel5.setBounds(256, 200, 417, 49);
    jLabel5.setText("You scored " +pointslevel1.getPositivepoints()+ " correct answers and " +pointslevel1.getNegativepoints()+" wrong answers");
    cp.add(jLabel5);
    jButton3.setBounds(280, 160, 185, 33);
    jButton3.setText("save your results");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jTextField3.setText("write a title for your save file");
    jTextField3.setVisible(false);
    jButton3.setVisible(false);
    jButton4.setVisible(false);
    
    
    if(bl==true){
      jLabel2.setText("English");
      jLabel3.setText("Deutsch"); 
    }
    else{
      jLabel2.setText("Deutsch");
      jLabel3.setText("English");
    
    }
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        
        readzufalleasyy read= new readzufalleasyy(zlevel1,j);
        timerlevel1.start();
        if(bl==true){
          
          jTextField1.setText(zlevel1.getVocc().getEnglish());
          
          
          
        }
        else{
          jTextField1.setText(zlevel1.getVocc().getDeutsch());
          timerlevel1.start();
          
          
          
        }
        timerlevel1.setI();
        jButton1.setVisible(false);
      }
    });
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        if(timerlevel1.getTimerNow()<timerlevel1.getV()){
          if(bl==true){
            
          if(jTextField2.getText().equals(zlevel1.ynow().getDeutsch())){
            jLabel4.setText("Gut Gemacht!");
            zlevel1.getVoccc().remove(zlevel1.getK());
            
            jTextField2.setText(null);
            pointslevel1.addppoint();
            jLabel5.setText("You scored "+ pointslevel1.getPositivepoints()+" correct answers and "+pointslevel1.getNegativepoints()+ " wrong answers");
            //zlevel1.getVoccc().remove(zlevel1.getK());
          }
          
          else{ 
            jLabel4.setText("Falsch");
            zlevel1.getVoccc().remove(zlevel1.getK());
            
            pointslevel1.addnpoint();
            jLabel5.setText("You scored "+ pointslevel1.getPositivepoints() +" correct answers and "+pointslevel1.getNegativepoints() + " wrong answers");
            jTextField2.setText(null); 
            
          }
            jTextField1.setText(zlevel1.getVocc().getEnglish());
          }
          else{
               if(jTextField2.getText().equals(zlevel1.ynow().getEnglish())){
            jLabel4.setText("Gut Gemacht!");
            zlevel1.getVoccc().remove(zlevel1.getK());
            jTextField2.setText(null);
            pointslevel1.addppoint();
            jLabel5.setText("You scored "+ pointslevel1.getPositivepoints()+" correct answers and "+pointslevel1.getNegativepoints()+ " wrong answers");
            //zlevel1.getVoccc().remove(zlevel1.getK());
          }
          
          else{ 
            jLabel4.setText("Falsch");
            zlevel1.getVoccc().remove(zlevel1.getK());
            pointslevel1.addnpoint();
            jLabel5.setText("You scored "+ pointslevel1.getPositivepoints() +" correct answers and "+pointslevel1.getNegativepoints() + " wrong answers");
            jTextField2.setText(null); 
            
          }
             jTextField1.setText(zlevel1.getVocc().getDeutsch());
            }
          // end of if-else
        }
        else{ 
          jButton1.setVisible(false);
          jButton2.setVisible(false);
        } 
      }
    });
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        s.addsave(jTextField3.getText()+" =  "+ jLabel5.getText());
        try (FileOutputStream fos = new FileOutputStream ("savefile.ser");
        ObjectOutputStream oos = new ObjectOutputStream (fos)) {
          
          
          oos.writeObject (s.getJList());
          
          
          
        }
        catch(FileNotFoundException e)
        {
          System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
        }
        catch(IOException e)
        {
          System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
        }
        jButton4.setVisible(true);
        jButton5.setVisible(true);
      }
    });
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        
        
        s.setVisible(true);
        jButton4.setVisible(false);
        //jButton3.setVisible(false);
      }
    });
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        readzufalleasyy read2= new readzufalleasyy(zlevel1,j);
        jButton5.setVisible(false);
        timerlevel1.setsp(0);
        jLabel1.setText("");
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jTextField1.setText(zlevel1.getVocc().getEnglish());
        
        jTextField3.setVisible(false);
        
        
        pointslevel1.setpp(0);
        pointslevel1.setpn(0);
        jLabel5.setText("You scored " +pointslevel1.getPositivepoints()+ " correct answers and " +pointslevel1.getNegativepoints()+" wrong answers");
      }
    });
    
   
    
    cp.add(jButton3);
    jTextField3.setBounds(704, 200, 225, 41);
    cp.add(jTextField3);
    jButton4.setBounds(616, 152, 145, 33);
    jButton4.setText("go to your save files");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    
    cp.add(jButton4);
    jButton5.setBounds(248, 40, 105, 33);
    jButton5.setText("New");
    jButton5.setVisible(false);
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    cp.add(jButton5);
    
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
  
  // Ende Methoden
} // end of class level
    

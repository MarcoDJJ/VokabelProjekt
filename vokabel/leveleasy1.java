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
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 03/03/2019
 * @author 
 */

public class leveleasy1 extends JFrame {
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
  // Ende Attribute
  
  
  vokabelnarray vlevel13 = new vokabelnarray();
  vokabelnarray vlevel14 = new vokabelnarray();
  vokabelnarray vlevel15 = new vokabelnarray();
  vokabelnarray vlevel16 = new vokabelnarray();
  vokabelnarray vlevel17 = new vokabelnarray();
  vokabelnarray vlevel18 = new vokabelnarray();
  vokabelnarray vlevel19 = new vokabelnarray();
  vokabelnarray vlevel20 = new vokabelnarray();
  vokabelnarray vlevel21 = new vokabelnarray();
  vokabelnarray vlevel22 = new vokabelnarray();
  vokabelnarray vlevel23 = new vokabelnarray();
  vokabelnarray vlevel24 = new vokabelnarray();
  vokabelnarray vlevel25 = new vokabelnarray();
  vokabelnarray vlevel26 = new vokabelnarray();
  vokabelnarray vlevel27 = new vokabelnarray();
  vokabelnarray vlevel28 = new vokabelnarray();
  vokabelnarray vlevel29 = new vokabelnarray();
  vokabelnarray vlevel30 = new vokabelnarray();
  vokabelnarray vlevel31 = new vokabelnarray();
  vokabelnarray vlevel32 = new vokabelnarray();
  vokabelnarray vlevel33 = new vokabelnarray();
  vokabelnarray vlevel34 = new vokabelnarray();
  vokabelnarray vlevel35 = new vokabelnarray();
  vokabelnarray vlevel36 = new vokabelnarray();
  vokabelnarray vlevel37 = new vokabelnarray();
  vokabelnarray vlevel38 = new vokabelnarray();
  vokabelnarray vlevel39 = new vokabelnarray();
  vokabelnarray vlevel40 = new vokabelnarray();
  vokabelnarray vlevel41 = new vokabelnarray();
  
  
  
  vokabel fd = new vokabel("apple", "apfel");
  vokabel fd1 = new vokabel("pear", "birne");
  vokabel fd2 = new vokabel("water", "wasser");
  vokabel fd3 = new vokabel("watermelon", "wassermelone");
  vokabel fd4 = new vokabel("pepper", "pfeffer");
  vokabel fd5 = new vokabel("salt", "salz");
  vokabel fd6 = new vokabel("egg", "ei");
  vokabel fd7 = new vokabel("banane", "banane");
  vokabel fd8 = new vokabel("oil", "oel");
  vokabel fd9 = new vokabel("cheese", "kaese");
  vokabel fd10 = new vokabel("bread", "brot");
  vokabel fd11 = new vokabel("orange", "orange");
  vokabel fd12 = new vokabel("cherry", "kirsche");
  vokabel fd13 = new vokabel("beer", "bier");
  vokabel fd14 = new vokabel("wine", "wein");
  vokabel fd15 = new vokabel("rice", "rice");
  vokabel fd16 = new vokabel("juice", "saft");
  vokabel fd17 = new vokabel("milk", "milch");
  vokabel fd18 = new vokabel("meat", "fleisch");
  vokabel fd19 = new vokabel("tomato", "tomate");
  vokabel fd20 = new vokabel("potato", "kartoffel");
  vokabel fd21 = new vokabel("carrot", "karotte");
  vokabel fd22 = new vokabel("broccoli", "brokkoli");
  vokabel fd23 = new vokabel("cucumber", "gurke");
  vokabel fd24 = new vokabel("chicken", "huhn");
  vokabel fd25 = new vokabel("hamburger", "hamburger");
  vokabel fd26 = new vokabel("biscuits", "kaekse");
  vokabel fd27 = new vokabel("coffee", "kaffee");
  vokabel fd28 = new vokabel("tea", "tee");
  vokabel fd29 = new vokabel("soup", "suppe");
  
  
  zufalleasyy zlevel1= new zufalleasyy();
  
  Timerclass timerlevel1 =new Timerclass(jLabel1);
  points pointslevel1=new points(0, 0, 0);
  
  
  /*public void keyPressed(KeyEvent e) {
  
  int key = e.getKeyCode();
  
  if(key == KeyEvent.VK_D){
  
  stop();
  }
  }*/
  
  public leveleasy1() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 701; 
    int frameHeight = 290;
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
    jLabel2.setBounds(8, 96, 57, 49);
    jLabel2.setText("English");
    cp.add(jLabel2);
    jLabel3.setBounds(0, 168, 65, 41);
    jLabel3.setText("Deutsch");
    cp.add(jLabel3);
    jButton1.setBounds(0, 40, 73, 33);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    
    
    vlevel13.fuegevokabelnhinzu(fd);
    vlevel14.fuegevokabelnhinzu(fd1);
    vlevel15.fuegevokabelnhinzu(fd2);
    vlevel16.fuegevokabelnhinzu(fd3);
    vlevel17.fuegevokabelnhinzu(fd4);
    vlevel18.fuegevokabelnhinzu(fd5);
    vlevel19.fuegevokabelnhinzu(fd6);
    vlevel20.fuegevokabelnhinzu(fd7);
    vlevel21.fuegevokabelnhinzu(fd8);
    vlevel22.fuegevokabelnhinzu(fd9);
    vlevel23.fuegevokabelnhinzu(fd10);
    vlevel24.fuegevokabelnhinzu(fd11);
    vlevel24.fuegevokabelnhinzu(fd11);
    vlevel25.fuegevokabelnhinzu(fd13);
    vlevel26.fuegevokabelnhinzu(fd14);
    vlevel27.fuegevokabelnhinzu(fd15);
    vlevel28.fuegevokabelnhinzu(fd16);
    vlevel29.fuegevokabelnhinzu(fd17);
    vlevel30.fuegevokabelnhinzu(fd18);
    vlevel31.fuegevokabelnhinzu(fd19);
    vlevel32.fuegevokabelnhinzu(fd20);
    vlevel33.fuegevokabelnhinzu(fd21);
    vlevel34.fuegevokabelnhinzu(fd22);
    vlevel35.fuegevokabelnhinzu(fd23);
    vlevel36.fuegevokabelnhinzu(fd24);
    vlevel37.fuegevokabelnhinzu(fd25);
    vlevel38.fuegevokabelnhinzu(fd26);
    vlevel39.fuegevokabelnhinzu(fd27);
    vlevel40.fuegevokabelnhinzu(fd28);
    vlevel41.fuegevokabelnhinzu(fd29);
    
    
    
    
    
    
    
    zlevel1.fuegevoccnhinzu(vlevel13);
    zlevel1.fuegevoccnhinzu(vlevel14);
    zlevel1.fuegevoccnhinzu(vlevel15);
    zlevel1.fuegevoccnhinzu(vlevel16);
    zlevel1.fuegevoccnhinzu(vlevel17);
    zlevel1.fuegevoccnhinzu(vlevel18);
    zlevel1.fuegevoccnhinzu(vlevel19);
    zlevel1.fuegevoccnhinzu(vlevel20);
    zlevel1.fuegevoccnhinzu(vlevel21);
    zlevel1.fuegevoccnhinzu(vlevel22);
    zlevel1.fuegevoccnhinzu(vlevel23);
    zlevel1.fuegevoccnhinzu(vlevel24);
    zlevel1.fuegevoccnhinzu(vlevel25);
    zlevel1.fuegevoccnhinzu(vlevel26);
    zlevel1.fuegevoccnhinzu(vlevel27);
    zlevel1.fuegevoccnhinzu(vlevel28);
    zlevel1.fuegevoccnhinzu(vlevel29);
    zlevel1.fuegevoccnhinzu(vlevel30);
    zlevel1.fuegevoccnhinzu(vlevel31);
    zlevel1.fuegevoccnhinzu(vlevel32);
    zlevel1.fuegevoccnhinzu(vlevel33);
    zlevel1.fuegevoccnhinzu(vlevel34);
    zlevel1.fuegevoccnhinzu(vlevel35);
    zlevel1.fuegevoccnhinzu(vlevel36);
    zlevel1.fuegevoccnhinzu(vlevel37);
    zlevel1.fuegevoccnhinzu(vlevel38);
    zlevel1.fuegevoccnhinzu(vlevel39);
    zlevel1.fuegevoccnhinzu(vlevel40);
    zlevel1.fuegevoccnhinzu(vlevel41);  
     //indexof
     //remove(Object o)
    
    
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jTextField1.setText(zlevel1.getVocc().getVokabelnA(0).getEnglish());
        timerlevel1.start();
        //zlevel1.getVoccc().remove(zlevel1.getK());
      }
    });
    
    cp.add(jButton1);
    jTextField1.setBounds(96, 96, 121, 33);
    cp.add(jTextField1);
    jTextField2.setBounds(96, 160, 113, 33);
    cp.add(jTextField2);
    jButton2.setBounds(96, 40, 65, 33);
    jButton2.setText("Verify");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        if(jTextField2.getText().equals(zlevel1.ynow().getVokabelnA(0).getDeutsch())){
          jLabel4.setText("Gut Gemacht!");
          jTextField1.setText(zlevel1.getVocc().getVokabelnA(0).getEnglish());
          jTextField2.setText(null);
          pointslevel1.addppoint();
          jLabel5.setText("You scored "+ pointslevel1.getPositivepoints()+" correct answers and "+pointslevel1.getNegativepoints()+ " wrong answers");
          //zlevel1.getVoccc().remove(zlevel1.getK());
        }
        
        else{ 
          jLabel4.setText("Falsch");
          jTextField1.setText(zlevel1.getVocc().getVokabelnA(0).getEnglish());
          pointslevel1.addnpoint();
          jLabel5.setText("You scored "+ pointslevel1.getPositivepoints() +" correct answers and "+pointslevel1.getNegativepoints() + " wrong answers");
          jTextField2.setText(null); 
          //zlevel1.getVoccc().remove(zlevel1.getK());
        }
        
      }
    });
    
    cp.add(jButton2);
    jLabel4.setBounds(96, 216, 113, 33);
    jLabel4.setText("");
    cp.add(jLabel4);
    jLabel5.setBounds(256, 200, 417, 49);
    jLabel5.setText("You scored 0 correct answers and 0 wrong answers");
    cp.add(jLabel5);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public leveleasy1
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new leveleasy1();
    
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton2_ActionPerformed
  
  // Ende Methoden
} // end of class leveleasy1
    

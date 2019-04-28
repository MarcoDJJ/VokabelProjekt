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
  private JButton jButton3 = new JButton();
  private JTextField jTextField3 = new JTextField();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  // Ende Attribute
  
  
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
  
  
  points pointslevel1=new points(0, 0, 0);
  savefiles s= new savefiles(); 
 
  Timerclass timerlevel1 =new Timerclass(jTextField1,jTextField2,jButton5,jLabel1,jButton3,jTextField3);
  /*public void keyPressed(KeyEvent e) {
  
  int key = e.getKeyCode();
  
  if(key == KeyEvent.VK_D){
  
  stop();
  }
  }*/
  
  public leveleasy1( zufalleasyy zlevel1) { 
    // Frame-Initialisierung
    super();
    
  this.zlevel1=zlevel1;
    s.setVisible(false);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1046; 
    int frameHeight = 329;
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
    jLabel2.setText("English");
    cp.add(jLabel2);
    jLabel3.setBounds(0, 168, 65, 41);
    jLabel3.setText("Deutsch");
    cp.add(jLabel3);
    jButton1.setBounds(0, 40, 73, 33);
    jButton1.setText("Start");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    
    
    
    
    
    
    
    
    
    
    zlevel1.fuegevoccnhinzu(fd);
    zlevel1.fuegevoccnhinzu(fd1);
    zlevel1.fuegevoccnhinzu(fd2);
    zlevel1.fuegevoccnhinzu(fd3);
    zlevel1.fuegevoccnhinzu(fd4);
    zlevel1.fuegevoccnhinzu(fd5);
    zlevel1.fuegevoccnhinzu(fd6);
    zlevel1.fuegevoccnhinzu(fd7);
    zlevel1.fuegevoccnhinzu(fd8);
    zlevel1.fuegevoccnhinzu(fd9);
    zlevel1.fuegevoccnhinzu(fd10);
    zlevel1.fuegevoccnhinzu(fd11);
    zlevel1.fuegevoccnhinzu(fd12);
    zlevel1.fuegevoccnhinzu(fd13);
    zlevel1.fuegevoccnhinzu(fd14);
    zlevel1.fuegevoccnhinzu(fd15);
    zlevel1.fuegevoccnhinzu(fd16);
    zlevel1.fuegevoccnhinzu(fd17);
    zlevel1.fuegevoccnhinzu(fd18);
    zlevel1.fuegevoccnhinzu(fd19);
    zlevel1.fuegevoccnhinzu(fd20);
    zlevel1.fuegevoccnhinzu(fd21);
    zlevel1.fuegevoccnhinzu(fd22);
    zlevel1.fuegevoccnhinzu(fd23);
    zlevel1.fuegevoccnhinzu(fd24);
    zlevel1.fuegevoccnhinzu(fd25);
    zlevel1.fuegevoccnhinzu(fd26);
    zlevel1.fuegevoccnhinzu(fd27);
    zlevel1.fuegevoccnhinzu(fd28);   
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
    
    jButton5.addActionListener(new newbutton(jTextField1,jTextField3,jButton4,jButton3,jButton5,jLabel1,timerlevel1,jLabel5,pointslevel1,jButton1,zlevel1,fd,fd1,fd2,fd3,fd4,fd5,fd6,fd7,fd8,fd9,fd10,fd11,fd12,fd13,fd14,fd15,fd16,fd17,fd18,fd19,fd20,fd21,fd22,fd23,fd24,fd25,fd26,fd27,fd28,fd29));
    jButton1.addActionListener(new startbutton(jTextField1, timerlevel1, zlevel1,jButton1));
    jButton2.addActionListener(new verifybutton(zlevel1, jLabel4, jTextField1, jTextField2, pointslevel1, jLabel5, timerlevel1,jButton1,jButton2));
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
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        s.addsave(jTextField3.getText()+" =  "+ jLabel5.getText());
        
        jButton4.setVisible(true);
        jButton5.setVisible(true);
      }
    });
    cp.add(jButton3);
    jTextField3.setBounds(704, 200, 225, 41);
    cp.add(jTextField3);
    jButton4.setBounds(616, 152, 145, 33);
    jButton4.setText("go to your save files");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        
        s.setVisible(true);
        jButton4.setVisible(false);
        //jButton3.setVisible(false);
      }
    });
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
  // end of public leveleasy1
  
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
} // end of class leveleasy1
    

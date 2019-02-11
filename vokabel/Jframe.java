import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 25.01.2019
  * @author 
  */

public class Jframe extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JLabel jLabel2 = new JLabel();
  private JTextField jTextField2 = new JTextField();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField4 = new JTextField();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  // Ende Attribute
  vokabelnarray va= new vokabelnarray();
  int i=0; 
  
  public Jframe(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 570; 
    int frameHeight = 356;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(0, 184, 275, 33);
    jLabel1.setText("");
    cp.add(jLabel1);
    jTextField1.setBounds(88, 56, 129, 41);
    cp.add(jTextField1);
    jLabel2.setBounds(8, 56, 75, 41);
    jLabel2.setText("Deutsch");
    cp.add(jLabel2);
    jTextField2.setBounds(88, 112, 129, 41);
    cp.add(jTextField2);
    jLabel3.setBounds(8, 112, 83, 41);
    jLabel3.setText("English");
    cp.add(jLabel3);
    jButton1.setBounds(64, 8, 81, 33);
    jButton1.setText("Save");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(176, 8, 81, 33);
    jButton2.setText("New");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(352, 8, 81, 33);
    jButton3.setText("Show vocable");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(472, 8, 81, 33);
    jButton4.setText("Test vocable");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jTextField3.setBounds(384, 56, 113, 41);
    cp.add(jTextField3);
    jTextField4.setBounds(384, 112, 113, 41);
    cp.add(jTextField4);
    jLabel4.setBounds(376, 176, 155, 41);
    jLabel4.setText("");
    cp.add(jLabel4);
    jLabel5.setBounds(24, 248, 403, 65);
    jLabel5.setText("Save= this button saves the vocables; New= this button resets everything; Show vocable = this button shows you the vocable in German; Test vocable = this button tests if your answer is correct P.S.: press New and then Show Vocable for the next vocable.  ");
    cp.add(jLabel5);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Jframe
  
  // Anfang Methoden
  public void jButton1_ActionPerformed(ActionEvent evt) {
    vokabel v= new vokabel(jTextField2.getText(), jTextField1.getText());
    va.fuegevokabelnhinzu(v);
    //jLabel1.setText(va.vokabelnA.get(0) +"");
    
    //jLabel1.setText("English: "+ v.getEnglish()+"   Deutsch: "+v.getDeutsch());
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    jTextField2.setText(null);
    jTextField3.setText(null);
    jTextField1.setText(null);
    jTextField4.setText(null);
    jLabel1.setText(null);
    jLabel4.setText(null);
  } // end of jButton2_ActionPerformed
  
  public void jButton3_ActionPerformed(ActionEvent evt) {
    
    //vokabel n= new vokabel(va.getVokabelnA(i));
    jTextField3.setText(va.getVokabelnA(i).getDeutsch());
    
  } // end of jButton3_ActionPerformed
  
  public void jButton4_ActionPerformed(ActionEvent evt) {
    if(jTextField4.getText().equals(va.getVokabelnA(i).getEnglish())){
      jLabel4.setText("Gut gemacht!");
      i++;
    }
    else{
      jLabel4.setText("Falsch");
    } 
  } // end of jButton4_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    /*vokabel q = new vokabel(new, neu);
    vokabel w = new vokabel(geld, money);
    vokabel j= new vokabel(schlange, snake);
    vokabel t= new vokabel(kaufen, buy);
    va.fuegevokabelnhinzu(q); 
    va.fuegevokabelnhinzu(w);
    va.fuegevokabelnhinzu(j);
    va.fuegevokabelnhinzu(t);
    */
    new Jframe("Jframe");
      
    
  } // end of main
  
} // end of class Jframe

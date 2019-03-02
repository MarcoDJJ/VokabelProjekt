import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 02/03/2019
 * @author 
 */

public class personalized extends JFrame {
  // Anfang Attribute
  private JButton Save = new JButton();
  private JButton New = new JButton();
  vokabelnarray va= new vokabelnarray();
  int i=0; 
  
  private JLabel Deutsch = new JLabel();
  private JLabel English = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField4 = new JTextField();
  private JButton Show = new JButton();
  private JButton Test = new JButton();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  // Ende Attribute
  
    public personalized() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 542; 
    int frameHeight = 361;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("personalized");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    Save.setBounds(16, 8, 105, 33);
    Save.setText("Save");
    Save.setMargin(new Insets(2, 2, 2, 2));
      Save.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
      Save_ActionPerformed(evt);
    }
    });
    cp.add(Save);
    New.setBounds(136, 8, 105, 33);
    New.setText("New");
    New.setMargin(new Insets(2, 2, 2, 2));
      New.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
      New_ActionPerformed(evt);
    }
    });
    cp.add(New);
    Deutsch.setBounds(16, 56, 81, 41);
    Deutsch.setText("Deutsch");
    cp.add(Deutsch);
    English.setBounds(8, 136, 89, 41);
    English.setText("English");
    cp.add(English);
    jTextField1.setBounds(112, 56, 113, 41);
    cp.add(jTextField1);
    jTextField2.setBounds(120, 136, 97, 41);
    cp.add(jTextField2);
    jTextField3.setBounds(368, 64, 121, 33);
    cp.add(jTextField3);
    jTextField4.setBounds(384, 128, 113, 41);
    cp.add(jTextField4);
    Show.setBounds(328, 8, 73, 33);
    Show.setText("Show");
    Show.setMargin(new Insets(2, 2, 2, 2));
      Show.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
      Show_ActionPerformed(evt);
    }
    });
    cp.add(Show);
    Test.setBounds(424, 8, 89, 33);
    Test.setText("Test");
    Test.setMargin(new Insets(2, 2, 2, 2));
      Test.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
      Test_ActionPerformed(evt);
    }
    });
    cp.add(Test);
    jLabel3.setBounds(120, 208, 81, 33);
    jLabel3.setText("");
    cp.add(jLabel3);
    jLabel4.setBounds(376, 216, 113, 33);
    jLabel4.setText("");
    cp.add(jLabel4);
    // Ende Komponenten
    
  setVisible(true);
  } // end of public personalized
  
  // Anfang Methoden
  
    public static void main(String[] args) {
  new personalized();
  } // end of main
  
    public void Save_ActionPerformed(ActionEvent evt) {
    vokabel v= new vokabel(jTextField2.getText(), jTextField1.getText());
    va.fuegevokabelnhinzu(v);
  
  } // end of Save_ActionPerformed
  
    public void New_ActionPerformed(ActionEvent evt) {
    jTextField2.setText(null);
    jTextField3.setText(null);
    jTextField1.setText(null);
    jTextField4.setText(null);
    Deutsch.setText(null);
    jLabel4.setText(null);
  
  } // end of New_ActionPerformed
  
    public void Show_ActionPerformed(ActionEvent evt) {
    jTextField3.setText(va.getVokabelnA(i).getDeutsch());
  
  } // end of Show_ActionPerformed
  
    public void Test_ActionPerformed(ActionEvent evt) {
    if(jTextField4.getText().equals(va.getVokabelnA(i).getEnglish())){
      jLabel4.setText("Gut gemacht!");
      i++;
    }
    else{
      jLabel4.setText("Falsch");
    } 
  
  } // end of Test_ActionPerformed

// Ende Methoden
} // end of class personalized


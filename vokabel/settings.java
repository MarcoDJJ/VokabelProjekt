import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
* @version 1.0 vom 08/03/2019
 * @author 
  */
  
  public class settings extends JFrame{
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JSlider jSlider1 = new JSlider();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel22222 = new JLabel();
  settingstimer h=new settingstimer(jLabel22222);
  private JButton jButton2 = new JButton();
    //boolean close = false;
    // Ende Attribute
    
    public settings() { 
    // Frame-Initialisierung
    super();
    //this.close=f;
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 669; 
    int frameHeight = 300;
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
    
    jButton1.setBounds(16, 72, 105, 33);
        jButton1.setText("set timer");
        jButton1.setMargin(new Insets(2, 2, 2, 2));
        jButton1.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) { 
      jButton1_ActionPerformed(evt);
    h.setV(jSlider1.getValue());
    jLabel1.setText("the timer has been set to "+h.getV()+ " seconds");
    
    }
    });
    cp.add(jButton1);
    jSlider1.setBounds(8, 120, 393, 57);
    jSlider1.setMinorTickSpacing(10);
    jSlider1.setMajorTickSpacing(100);
    jSlider1.setPaintTicks(true);
    jSlider1.setPaintLabels(true);
    jSlider1.setMaximum(600);
    cp.add(jSlider1);
    jLabel1.setBounds(144, 64, 297, 49);
    jLabel1.setText("");
    cp.add(jLabel1);
      jButton2.setBounds(8, 208, 65, 33);
        jButton2.setText("close");
        jButton2.setMargin(new Insets(2, 2, 2, 2));
      jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
    
    }
    });
    cp.add(jButton2);
  // Ende Komponenten
    
    setVisible(true);
    
  } // end of public settings
   /*public boolean getClose() {
  return close;
  }
 
  public void setClose(boolean closeNeu) {
    close = closeNeu;
  }  */
    // Anfang Methoden
    
  public static void main(String[] args) {
    //boolean g=false;
    new settings();
    /*if(g.getClose()==true ){
    settings.setVisible(false);
     }*/
     
    } // end of main
      class settingstimer extends Timerclass{
      // Anfang Attribute1
    // Ende Attribute1
    public settingstimer(JLabel j){
      super(j);
      
      }
  // Anfang Komponenten1
  // Ende Komponenten1
    // Anfang Methoden1
    

  // Ende Methoden1
    }
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of jButton2_ActionPerformed

  // Ende Methoden
} // end of class settings


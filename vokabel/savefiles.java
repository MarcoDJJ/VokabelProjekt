import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;
import java.text.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.*;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.io.*;
import java.util.*;
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 24/03/2019
 * @author 
 */

public class savefiles extends JFrame implements Serializable{
  // Anfang Attribute
   JList jList1 = new JList();
     DefaultListModel jList1Model = new DefaultListModel();
     JScrollPane jList1ScrollPane = new JScrollPane(jList1);
  // Ende Attribute
  ArrayList<String> savefiless = new ArrayList<>();
  
  public savefiles() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 482; 
    int frameHeight = 358;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("savefiles");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jList1.setModel(jList1Model);
    jList1ScrollPane.setBounds(8, 0, 449, 297);
    cp.add(jList1ScrollPane);
    // Ende Komponenten
    
    setVisible(false);
  } // end of public savefiles
  public JList getJList(){
     return jList1;
    }
  public void setJList(JList jl){
    this.jList1=jl;
    }
  // Anfang Methoden
  public void addsave(String sss){
    jList1Model.addElement(sss);
    jList1.setModel(jList1Model);
  }
  public static void main(String[] args) {
    
  } // end of main
  
  public ArrayList<String> getSavefiless() {
    return savefiless;
  }
  
  // Ende Methoden
} // end of class savefiles


import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;
import java.text.*;

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

import java.lang.Object;
import javax.swing.AbstractListModel;
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
  
  
  public savefiles() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 841; 
    int frameHeight = 336;
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
    jList1ScrollPane.setBounds(0, 0, 825, 297);
    cp.add(jList1ScrollPane);
    // Ende Komponenten
    
    setVisible(false);
  } // end of public savefiles

  public void addelement(String sss){
    jList1Model.addElement(sss);
     }
  public void setgleichjlistmodel(DefaultListModel j){
    this.jList1Model=j;
    }
  
  public Object getjlist(){
    return jList1Model;
    
    }
  public void addjList1Model(DefaultListModel jList1Model){
    jList1.setModel(jList1Model); 
    
    }
  

  
  public static void main(String[] args) {
    
  } // end of main
  
  
  
  // Ende Methoden
} // end of class savefiles


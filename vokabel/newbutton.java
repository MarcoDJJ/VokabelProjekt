/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 24/03/2019
 * @author 
 */
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
public class newbutton implements ActionListener {
  zufalleasyy zlevel1= new zufalleasyy();
  
  JButton jButton1;
  points pointslevel1;
  JLabel jLabel5;
  Timerclass timerlevel1;
  JLabel jLabel1;
  JButton jButton5;
  JButton jButton3;
  JTextField jTextField1;
  JButton jButton4;
  JTextField jTextField3;
  int j;
  public newbutton(int j,JTextField jTextField1, JTextField jTextField3,JButton jButton4,JButton jButton3,JButton jButton5,JLabel jLabel1,Timerclass timerlevel1,JLabel jLabel5,points pointslevel1,JButton jButton1,zufalleasyy zlevel1){
    this.j=j;
    this.jTextField1=jTextField1;
    this.jButton3=jButton3;
    this.jLabel5=jLabel5;
    this.jButton4=jButton4;
    this.jTextField3=jTextField3;
    this.jButton5=jButton5;
    this.jLabel1=jLabel1;
    this.timerlevel1=timerlevel1;
    this.jLabel5=jLabel5;
    this.pointslevel1=pointslevel1;
    this.jButton1=jButton1;
    this.zlevel1=zlevel1;
    
    
  }
  public void actionPerformed(ActionEvent r){
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
  
  public static void main(String[] args) {
    
  } // end of main
  
} // end of class newbutton


/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20/05/2019
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
public class probe {
  zufalleasyy zlevel1=new zufalleasyy();
     ArrayList<vokabel>  z2=new ArrayList<>();
  int j=0;
   
    public probe(){
    if(j==0){
       try (FileInputStream fis = new FileInputStream ("vokabelneasy.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      z2= (ArrayList<vokabel>) ois.readObject();
      zlevel1.setVocc(z2);
           
      
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
      }
    for (int i=0;i<=30 ;i++ ) {
      System.out.println(zlevel1.voccmitint(i).getDeutsch()+ zlevel1.voccmitint(i).getEnglish());
    
    
      
     } // end of for
    
    }
  public static void main(String[] args) {
     probe p=new probe();
  } // end of main

} // end of class probe


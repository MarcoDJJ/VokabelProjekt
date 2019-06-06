/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 15/05/2019
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

public class readzufalleasyy {
    zufalleasyy zlevel1=new zufalleasyy();
     ArrayList<vokabel>  z2=new ArrayList<>();
  int j=0;
    public readzufalleasyy(zufalleasyy zlevel1, int j){
       this.zlevel1=zlevel1;
    this.j=j;
    //Das Programm entscheidet anhand des angegebenen Zahl, welche Datei gelesen werden soll
    if(j==0){
       try (FileInputStream fis = new FileInputStream ("vokabelneasy.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      z2= (ArrayList<vokabel>) ois.readObject();
      zlevel1.setVocc(z2);
           
      
    }                        
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Lesen von vokabelneasy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Lesen von vokabelneasy.ser: Ein- Ausgabefehler");
    }
    catch(ClassNotFoundException e)
    {
      System.out.println("Fehler beim Erzeugen des Objekts: Klasse nicht gefunden.");
    }
      }
    
     
     if(j==1){
       try (FileInputStream fis = new FileInputStream ("vokabelneasy1.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      z2= (ArrayList<vokabel>) ois.readObject();
      zlevel1.setVocc(z2);
           
      
    }                        
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Lesen von vokabelneasy1.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Lesen von vokabelneasy1.ser: Ein- Ausgabefehler");
    }
    catch(ClassNotFoundException e)
    {
      System.out.println("Fehler beim Erzeugen des Objekts: Klasse nicht gefunden.");
    }
      }
    
    if(j==2){
       try (FileInputStream fis = new FileInputStream ("vokabelnnormal1.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      z2= (ArrayList<vokabel>) ois.readObject();
      zlevel1.setVocc(z2);
           
      
    }                        
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Lesen von vokabelnnormal1.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Lesen von vokabelnnormal1.ser: Ein- Ausgabefehler");
    }
    catch(ClassNotFoundException e)
    {
      System.out.println("Fehler beim Erzeugen des Objekts: Klasse nicht gefunden.");
    }
      }                                                                 
    if(j==3){
       try (FileInputStream fis = new FileInputStream ("vokabelnnormal2.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      z2= (ArrayList<vokabel>) ois.readObject();
      zlevel1.setVocc(z2);
           
      
    }                        
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Lesen von vokabelnnormal2.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Lesen von vokabelnnormal2.ser: Ein- Ausgabefehler");
    }
    catch(ClassNotFoundException e)
    {
      System.out.println("Fehler beim Erzeugen des Objekts: Klasse nicht gefunden.");
    }
      }
    if(j==4){
       try (FileInputStream fis = new FileInputStream ("vokabelnnhard1.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      z2= (ArrayList<vokabel>) ois.readObject();
      zlevel1.setVocc(z2);
           
      
    }                        
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Lesen von vokabelnhard1.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Lesen von vokabelnhard1.ser: Ein- Ausgabefehler");
    }
    catch(ClassNotFoundException e)
    {
      System.out.println("Fehler beim Erzeugen des Objekts: Klasse nicht gefunden.");
    }
      }
    if(j==5){
       try (FileInputStream fis = new FileInputStream ("vokabelnhard2.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      z2= (ArrayList<vokabel>) ois.readObject();
      zlevel1.setVocc(z2);
           
      
    }                        
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Lesen von vokabelnhard2.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Lesen von vokabelnhard2.ser: Ein- Ausgabefehler");
    }
    catch(ClassNotFoundException e)
    {
      System.out.println("Fehler beim Erzeugen des Objekts: Klasse nicht gefunden.");
    }
      }
    
    
     
    
    
    
    
      }
  
  public static void main(String[] args) {
    
  } // end of main

} // end of class readzufalleasyy


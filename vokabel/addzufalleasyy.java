/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18/05/2019
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
public class addzufalleasyy implements Serializable {
  int i=0;
  
    zufalleasyy z2;
  public addzufalleasyy(int i, zufalleasyy z2){
    
    this.z2=z2;
    this.i=i;
    if(i==0){
      
    try (FileOutputStream fos = new FileOutputStream ("vokabelneasy.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos)) {
      
      
      oos.writeObject(z2.getVoccc());
      
      
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
    }
    }
    if(i==1){
      
    try (FileOutputStream fos = new FileOutputStream ("vokabelneasy1.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos)) {
      
      
      oos.writeObject(z2.getVoccc());
      
      
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
    }
    }
    if(i==2){
      
    try (FileOutputStream fos = new FileOutputStream ("vokabelnnormal1.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos)) {
      
      
      oos.writeObject(z2.getVoccc());
      
      
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
    }
    }
    if(i==3){
      
    try (FileOutputStream fos = new FileOutputStream ("vokabelnnormal2.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos)) {
      
      
      oos.writeObject(z2.getVoccc());
      
      
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
    }
    }
    if(i==4){
      
    try (FileOutputStream fos = new FileOutputStream ("vokabelnnhard1.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos)) {
      
      
      oos.writeObject(z2.getVoccc());
      
      
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
    }
    }
    if(i==5){
      
    try (FileOutputStream fos = new FileOutputStream ("vokabelnhard2.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos)) {
      
      
      oos.writeObject(z2.getVoccc());
      
      
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
    }
    }
    
    }
  public static void main(String[] args) {
  
    
  } // end of main

} // end of class addzufalleasyy


/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 13.05.2019
  * @author 
  */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
  import java.util.Random;
  import java.util.Scanner;
  import java.io.*;
public class probearray implements Serializable{
  
  public static void main(String[] args) {
    ArrayList<vokabel>  z2=new ArrayList<>();
    zufalleasyy z3= new zufalleasyy();
    try (FileInputStream fis = new FileInputStream ("vokabelneasy.ser");
    ObjectInputStream ois = new ObjectInputStream (fis)) {
      z2= (ArrayList<vokabel>) ois.readObject();
      z3.setVocc(z2);
      for (int i=0;i<=27;i++ ) {
         System.out.println(z3.voccmitint(i).getDeutsch());
      } // end of for         
      
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
} // end of main
  
 // end of class probearray

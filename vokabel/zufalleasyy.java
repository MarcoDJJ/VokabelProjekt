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
import java.util.*;
public class zufalleasyy implements Serializable {
  
  Random voc= new Random(); //Erzeugt einen neuen Zufallsgenerator. 
  ArrayList<vokabel> vocc = new ArrayList<>();   //eine Arrayliste, die alle Vokabeln enthält
  int y=1; //eine Zahl, die dann dazu dienen wird, Zufallszahlen zu geben

  public void fuegevoccnhinzu(vokabel neu){
    vocc.add(neu);
  }
  public vokabel getVocc() {      
    y= voc.nextInt(vocc.size()); //Wenn die Methode aufgerufen wird, wird Y auf eine Zufallszahl zwischen 0 und der Anzahl der Wörter in der Wortliste festgelegt
   
    return vocc.get(y); //Gibt ein zufälliges paar von Vokabeln zurück 
  }
  
  public vokabel ynow(){ //Wenn das Programm die aktuelle Vokabel kennen muss
    return vocc.get(y);
  }
    
  public vokabel voccmitint(int i){ //Wenn das Programm eine bestimmte Vokabel kennen will
    return vocc.get(i);
  }

  public int getK() {  //wenn das Programm den aktuellen Wert von y kennen will 
      return y;
  }
  
  public ArrayList<vokabel> getVoccc() {
    return vocc;
  }
  public void setVocc(ArrayList<vokabel> s){
    this.vocc=s;
  }
  
  public static void main(String[] args) {
   
    
    // Ende Methoden
    
  }
}

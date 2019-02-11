/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 21.01.2019
  * @author 
  */
import java.util.ArrayList;
public class vokabelnarray {
   ArrayList<vokabel> vokabelnA = new ArrayList<>();
  
  // Ende Attribute
  
  // Anfang Methoden
  public void fuegevokabelnhinzu(vokabel neu){
    vokabelnA.add(neu);
  }
  public int anzahlvokabeln(){
    return vokabelnA.size();
  } 
  
  public static void main(String[] args) {
    
  } // end of main
  public vokabel getVokabelnA(int index) {
    return vokabelnA.get(index);
  }

  // Ende Methoden
  
} // end of class vokabelnarray

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
  
  Random voc= new Random();
  int c=1;
  int y= voc.nextInt(c);
  int k=y;
  
  ArrayList<vokabel> vocc = new ArrayList<>();
  
    
    
 
  // Ende Attribute
  // Anfang Methoden
  public void fuegevoccnhinzu(vokabel neu){
    vocc.add(neu);
  }
  public vokabel getVocc() {      
    y= voc.nextInt(c++);
    this.k=y;
    return vocc.get(y);  
  }
  
  
  
  public vokabel ynow(){
    return vocc.get(k);
  }
  
   public vokabel voccmitint(int i){
      return vocc.get(i);
     }
  
  
  
  
  
  
  
  
  
  public int getK() {
    return k;
  }
  
  public ArrayList<vokabel> getVoccc() {
    return vocc;
  }
  
  /*public vokabelnarray getallvocc(){
  for (int r=0;r<=vocc.size() ;r++ ) {
  return vocc.get(r);
  } 
  
  }*/ 
  /*public boolean check(ArrayList z){
  for (int g=0;g<=z.size();g++ ) {
  if(z.get(g).equals(vocc.getallvocc())){
  return false;
  }
  }
  
  
  } */
  public void setVocc(ArrayList<vokabel> s){
    this.vocc=s;
  }
  
  public static void main(String[] args) {
    zufalleasyy z2= new zufalleasyy();
    vokabel fd = new vokabel("apple", "apfel");
    vokabel fd1 = new vokabel("pear", "birne");
    vokabel fd2 = new vokabel("water", "wasser");
    vokabel fd3 = new vokabel("watermelon", "wassermelone");
    vokabel fd4 = new vokabel("pepper", "pfeffer");
    vokabel fd5 = new vokabel("salt", "salz");
    vokabel fd6 = new vokabel("egg", "ei");
    vokabel fd7 = new vokabel("banane", "banane");
    vokabel fd8 = new vokabel("oil", "oel");
    vokabel fd9 = new vokabel("cheese", "kaese");
    vokabel fd10 = new vokabel("bread", "brot");
    vokabel fd11 = new vokabel("orange", "orange");
    vokabel fd12 = new vokabel("cherry", "kirsche");
    vokabel fd13 = new vokabel("beer", "bier");
    vokabel fd14 = new vokabel("wine", "wein");
    vokabel fd15 = new vokabel("rice", "rice");
    vokabel fd16 = new vokabel("juice", "saft");
    vokabel fd17 = new vokabel("milk", "milch");
    vokabel fd18 = new vokabel("meat", "fleisch");
    vokabel fd19 = new vokabel("tomato", "tomate");
    vokabel fd20 = new vokabel("potato", "kartoffel");
    vokabel fd21 = new vokabel("carrot", "karotte");
    vokabel fd22 = new vokabel("broccoli", "brokkoli");
    vokabel fd23 = new vokabel("cucumber", "gurke");
    vokabel fd24 = new vokabel("chicken", "huhn");
    vokabel fd25 = new vokabel("hamburger", "hamburger");
    vokabel fd26 = new vokabel("biscuits", "kaekse");
    vokabel fd27 = new vokabel("coffee", "kaffee");
    vokabel fd28 = new vokabel("tea", "tee");
    vokabel fd29 = new vokabel("soup", "suppe");
    
    z2.fuegevoccnhinzu(fd);
    z2.fuegevoccnhinzu(fd1);
    z2.fuegevoccnhinzu(fd2);
    z2.fuegevoccnhinzu(fd3);
    z2.fuegevoccnhinzu(fd4);
    z2.fuegevoccnhinzu(fd5);
    z2.fuegevoccnhinzu(fd6);
    z2.fuegevoccnhinzu(fd7);
    z2.fuegevoccnhinzu(fd8);
    z2.fuegevoccnhinzu(fd9);
    z2.fuegevoccnhinzu(fd10);
    z2.fuegevoccnhinzu(fd11);
    z2.fuegevoccnhinzu(fd12);
    z2.fuegevoccnhinzu(fd13);
    z2.fuegevoccnhinzu(fd14);
    z2.fuegevoccnhinzu(fd15);
    z2.fuegevoccnhinzu(fd16);
    z2.fuegevoccnhinzu(fd17);
    z2.fuegevoccnhinzu(fd18);
    z2.fuegevoccnhinzu(fd19);
    z2.fuegevoccnhinzu(fd20);
    z2.fuegevoccnhinzu(fd21);
    z2.fuegevoccnhinzu(fd22);
    z2.fuegevoccnhinzu(fd23);
    z2.fuegevoccnhinzu(fd24);
    z2.fuegevoccnhinzu(fd25);
    z2.fuegevoccnhinzu(fd26);
    z2.fuegevoccnhinzu(fd27);
    z2.fuegevoccnhinzu(fd28);
    try (FileOutputStream fos = new FileOutputStream ("vokabelneasy.ser");
    ObjectOutputStream oos = new ObjectOutputStream (fos)) {
      
      
      oos.writeObject (z2.getVoccc());
      
      
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Datei nicht gefunden");
    }
    catch(IOException e)
    {
      System.out.println("Fehler beim Schreiben von dummy.ser: Ein- Ausgabefehler");
    }
    
    
    // Ende Methoden
    
  }
}

 import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
  import java.util.Random;
  import java.util.Scanner;
public class zufalleasyy {

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
  
  public static void main(String[] args) {
    } 
  public int getK() {
  return k;
  }
  
  public ArrayList<vokabel> getVoccc() {
    return vocc;
  }
    
  // Ende Methoden
    
  }

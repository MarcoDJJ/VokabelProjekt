 import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class zufalleasyy {
  Random voc= new Random();
  int c=1;
  int y= voc.nextInt(c);
  int k=y;
  ArrayList<vokabelnarray> vocc = new ArrayList<>();
  public void fuegevoccnhinzu(vokabelnarray neu){
    vocc.add(neu);
  }
  public vokabelnarray getVocc() {      
    y= voc.nextInt(c++);
     this.k=y;
    return vocc.get(y);  
  }
  public vokabelnarray getVocck(){
     return vocc.get(k);
    }
  public void removeelement(){
  vocc.remove(k);
    }

   
  public vokabelnarray ynow(){
    
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
  // Ende Methoden
  
}

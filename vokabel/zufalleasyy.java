 import java.util.ArrayList;
import java.util.Random;
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

  public vokabelnarray ynow(){
    
    return vocc.get(k);
  }
  public static void main(String[] args) {
  } 
  // Ende Methoden
  
}

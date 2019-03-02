 import java.util.ArrayList;
import java.util.Random;
public class zufalleasyy {
   Random voc= new Random();
  int y= voc.nextInt(1);
  ArrayList<vokabelnarray> vocc = new ArrayList<>();
  public void fuegevoccnhinzu(vokabelnarray neu){
    vocc.add(neu);
  }
  public vokabelnarray getVocc() {
    return vocc.get(y);
  }

  // Ende Methoden
  
}

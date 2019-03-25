/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 06/03/2019
 * @author 
 */

public class points {
  // Anfang Attribute
  int positivepoints = 0;
  int negativepoints = 0;
  int totalpoints=0;
  // Ende Attribute
  public int addppoint(){
    return positivepoints++;
  }
  public int addnpoint(){
    return negativepoints++;
  }
  public int totalpoints(){
    return positivepoints-negativepoints;
  }
  public void setpp(int t){
    this.positivepoints=t;
  }
  public void setpn(int t){
    this.negativepoints=t;
  }
  public points(int p, int n, int t){
    this.positivepoints=p;
    this.negativepoints=n;
    this.totalpoints=t;
  }
  // Anfang Methoden
  public static void main(String[] args) {
    
  } // end of main
  public int getPositivepoints() {
    return positivepoints;
  }
  
  public int getNegativepoints() {
    return negativepoints;
  }
  
  // Ende Methoden
  
} // end of class points


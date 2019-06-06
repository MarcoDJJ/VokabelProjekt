import java.io.*;
import java.util.*;
import java.util.Random;
  // start attributes
  // Anfang Attribute
public class vokabel implements Serializable{
  
  String english;
  String deutsch;
  

  
  
  
  public vokabel(String english, String deutsch){
    
    this.english=english;
    this.deutsch=deutsch;
  }
  public String getEnglish() {
    return english;
  }
  public String getDeutsch() {
    return deutsch;
  }
  public void setDeutsch(String deutschNew) {
    this.deutsch = deutschNew;
  }
  public void setEnglish(String englishNew) {
    this.english = englishNew;
  }
  public static void main(String[] args) {
    
    
  } // end of main
  
}
  
  

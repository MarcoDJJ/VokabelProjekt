/**
 *
 * Description
 *
 * @version 1.0 from 16/01/2019
 * @author 
 */

public class vokabel {
  // start attributes
  String english;
  String deutsch;
  vokabelnarray Array;
  // end attributes
  
  public vokabel(String english, String deutsch){
    
    this.english=english;
    this.deutsch=deutsch;
  }
  // start methods
  public static void main(String[] args) {
    
  } // end of main
  public String getEnglish() {
    return english;
  }
  
  public void setEnglish(String englishNew) {
    english = englishNew;
  }
  
  public String getDeutsch() {
    return deutsch;
  }
  
  public void setDeutsch(String deutschNew) {
    deutsch = deutschNew;
  }
  
  // end methods
  
} // end of class vokabel


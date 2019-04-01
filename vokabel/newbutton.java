/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 24/03/2019
 * @author 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class newbutton implements ActionListener {
  zufalleasyy zlevel1= new zufalleasyy();
  vokabelnarray vlevel13 = new vokabelnarray();
  vokabelnarray vlevel14 = new vokabelnarray();
  vokabelnarray vlevel15 = new vokabelnarray();
  vokabelnarray vlevel16 = new vokabelnarray();
  vokabelnarray vlevel17 = new vokabelnarray();
  vokabelnarray vlevel18 = new vokabelnarray();
  vokabelnarray vlevel19 = new vokabelnarray();
  vokabelnarray vlevel20 = new vokabelnarray();
  vokabelnarray vlevel21 = new vokabelnarray();
  vokabelnarray vlevel22 = new vokabelnarray();
  vokabelnarray vlevel23 = new vokabelnarray();
  vokabelnarray vlevel24 = new vokabelnarray();
  vokabelnarray vlevel25 = new vokabelnarray();
  vokabelnarray vlevel26 = new vokabelnarray();
  vokabelnarray vlevel27 = new vokabelnarray();
  vokabelnarray vlevel28 = new vokabelnarray();
  vokabelnarray vlevel29 = new vokabelnarray();
  vokabelnarray vlevel30 = new vokabelnarray();
  vokabelnarray vlevel31 = new vokabelnarray();
  vokabelnarray vlevel32 = new vokabelnarray();
  vokabelnarray vlevel33 = new vokabelnarray();
  vokabelnarray vlevel34 = new vokabelnarray();
  vokabelnarray vlevel35 = new vokabelnarray();
  vokabelnarray vlevel36 = new vokabelnarray();
  vokabelnarray vlevel37 = new vokabelnarray();
  vokabelnarray vlevel38 = new vokabelnarray();
  vokabelnarray vlevel39 = new vokabelnarray();
  vokabelnarray vlevel40 = new vokabelnarray();
  vokabelnarray vlevel41 = new vokabelnarray();
  
  vokabel fd;
  vokabel fd1;
  vokabel fd2;
  vokabel fd3;
  vokabel fd4;
  vokabel fd5;
  vokabel fd6;
  vokabel fd7;
  vokabel fd8;
  vokabel fd9;
  vokabel fd10;
  vokabel fd11;
  vokabel fd12;
  vokabel fd13;
  vokabel fd14;
  vokabel fd15;
  vokabel fd16;
  vokabel fd17;
  vokabel fd18;
  vokabel fd19;
  vokabel fd20;
  vokabel fd21;
  vokabel fd22;
  vokabel fd23;
  vokabel fd24;
  vokabel fd25;
  vokabel fd26;
  vokabel fd27;
  vokabel fd28;
  vokabel fd29;
  JButton jButton1;
  points pointslevel1;
  JLabel jLabel5;
  Timerclass timerlevel1;
  JLabel jLabel1;
  JButton jButton5;
  JButton jButton3;
  JTextField jTextField1;
  JButton jButton4;
  JTextField jTextField3;
  public newbutton(JTextField jTextField1, JTextField jTextField3,JButton jButton4,JButton jButton3,JButton jButton5,JLabel jLabel1,Timerclass timerlevel1,JLabel jLabel5,points pointslevel1,JButton jButton1,zufalleasyy zlevel1,vokabel fd,vokabel fd1,vokabel fd2,vokabel fd3,vokabel fd4,vokabel fd5,vokabel fd6,vokabel fd7,vokabel fd8,vokabel fd9,vokabel fd10,vokabel fd11,vokabel fd12,vokabel fd13,vokabel fd14,vokabel fd15,vokabel fd16,vokabel fd17,vokabel fd18,vokabel fd19,vokabel fd20,vokabel fd21,vokabel fd22,vokabel fd23,vokabel fd24,vokabel fd25,vokabel fd26,vokabel fd27,vokabel fd28,vokabel fd29){
    this.jTextField1=jTextField1;
    this.jButton3=jButton3;
    this.jLabel5=jLabel5;
    this.jButton4=jButton4;
    this.jTextField3=jTextField3;
    this.jButton5=jButton5;
    this.jLabel1=jLabel1;
    this.timerlevel1=timerlevel1;
    this.jLabel5=jLabel5;
    this.pointslevel1=pointslevel1;
    this.jButton1=jButton1;
    this.zlevel1=zlevel1;
    this.fd=fd;
    this.fd1=fd1;
    this.fd2=fd2;
    this.fd3=fd3;
    this.fd4=fd4;
    this.fd5=fd5;
    this.fd6=fd6;
    this.fd7= fd7;
    this.fd8=fd8;
    this.fd9=fd9;
    this.fd10=fd10;
    this.fd11=fd11;
    this.fd12=fd12;
    this.fd13=fd13;
    this.fd14=fd14;
    this.fd15=fd15;
    this.fd16=fd16;
    this.fd17=fd17;
    this.fd18=fd18;
    this.fd19=fd19;
    this.fd20=fd20;
    this.fd21=fd21;
    this.fd22=fd22;    
    this.fd23=fd23;
    this.fd24=fd24;
    this.fd25=fd25;
    this.fd26=fd26;
    this.fd27=fd27;
    this.fd28=fd28;
    this.fd29=fd29;
  }
  public void actionPerformed(ActionEvent r){
    jButton5.setVisible(false);
    timerlevel1.setsp(0);
    jLabel1.setText("");
    jButton3.setVisible(false);
    jButton4.setVisible(false);
    jTextField1.setText(zlevel1.getVocc().getEnglish());
    
    jTextField3.setVisible(false);
    zlevel1.fuegevoccnhinzu(fd);
    zlevel1.fuegevoccnhinzu(fd1);
    zlevel1.fuegevoccnhinzu(fd2);
    zlevel1.fuegevoccnhinzu(fd3);
    zlevel1.fuegevoccnhinzu(fd4);
    zlevel1.fuegevoccnhinzu(fd5);
    zlevel1.fuegevoccnhinzu(fd6);
    zlevel1.fuegevoccnhinzu(fd7);
    zlevel1.fuegevoccnhinzu(fd8);
    zlevel1.fuegevoccnhinzu(fd9);
    zlevel1.fuegevoccnhinzu(fd10);
    zlevel1.fuegevoccnhinzu(fd11);
    zlevel1.fuegevoccnhinzu(fd12);
    zlevel1.fuegevoccnhinzu(fd13);
    zlevel1.fuegevoccnhinzu(fd14);
    zlevel1.fuegevoccnhinzu(fd15);
    zlevel1.fuegevoccnhinzu(fd16);
    zlevel1.fuegevoccnhinzu(fd17);
    zlevel1.fuegevoccnhinzu(fd18);
    zlevel1.fuegevoccnhinzu(fd19);
    zlevel1.fuegevoccnhinzu(fd20);
    zlevel1.fuegevoccnhinzu(fd21);
    zlevel1.fuegevoccnhinzu(fd22);
    zlevel1.fuegevoccnhinzu(fd23);
    zlevel1.fuegevoccnhinzu(fd24);
    zlevel1.fuegevoccnhinzu(fd25);
    zlevel1.fuegevoccnhinzu(fd26);
    zlevel1.fuegevoccnhinzu(fd27);
    zlevel1.fuegevoccnhinzu(fd28); 
    
    pointslevel1.setpp(0);
    pointslevel1.setpn(0);
    jLabel5.setText("You scored " +pointslevel1.getPositivepoints()+ " correct answers and " +pointslevel1.getNegativepoints()+" wrong answers");
    
  }
  
  public static void main(String[] args) {
    
  } // end of main
  
} // end of class newbutton


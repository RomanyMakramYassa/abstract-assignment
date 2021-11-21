/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouns;

/**
 *
 * @author roman
 */
public class Bouns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Abstractfactory t1=producer.gettype(false);
        System.out.println("the cs teching assistant");
        typeStaff s=t1.gettype("cs");
        s.printdepart();
        t1.getsalaary(1000);
        t1.getyearsofwork(3);
        
        System.out.println("the is teching assistant");
          typeStaff s2=t1.gettype("is");
          s2.printdepart();
          t1.getsalaary(1100);
          t1.getyearsofwork(5);
          System.out.println("the it teching assistant");
          typeStaff s3=t1.gettype("it");
          s3.printdepart();
          t1.getsalaary(1400);
          t1.getyearsofwork(6);
           System.out.println("===========================================================/n");
              Abstractfactory t2=producer.gettype(true);
               System.out.println("the cs doctor");
                typeStaff d=t2.gettype("cs");
                d.printdepart();
        t2.getsalaary(10000);
        t2.getyearsofwork(5);
        System.out.println("the is Doctor");
          typeStaff d2=t2.gettype("is");
          d2.printdepart();
          t2.getsalaary(11000);
          t2.getyearsofwork(6);
          System.out.println("the it doctor");
          typeStaff d3=t2.gettype("it");
          d3.printdepart();
          
          t2.getsalaary(14000);
          t2.getyearsofwork(10);
          
    }
    
}

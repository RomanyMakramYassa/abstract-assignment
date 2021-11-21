/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author roman
 */
public class Doctor implements Staff {
  int salaryofmanth  = 1000;
          int thisyear=2021;
    
    public void getSalary(int num){
    System.out.println(num*salaryofmanth);
    }
    public void getYearsOfWork(int num){
   System.out.println(thisyear-num);
    }   
    
}

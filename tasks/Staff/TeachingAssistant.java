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
public class TeachingAssistant implements Staff {
     
   int salaryofmanth  = 900;
          int thisyear=2021;
    
    public void getSalary(int num){
    System.out.print(num*salaryofmanth);
    }
    public void getYearsOfWork(int num){
   System.out.print(thisyear-num);
    }   
     
    
}

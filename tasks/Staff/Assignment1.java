/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;
import java.util.Scanner;
/**
 *
 * @author roman
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input =new Scanner (System.in);
        
        memberfactory getmember=new memberfactory();
    char x;
    do{
        System.out.println("Enter your member factory please  : ");
        String member=input.next();
          System.out.println("Enter number month please  : ");
          int month =input.nextInt();
          System.out.println("Enter the begining years please  : ");
          int start_year=input.nextInt();
        Staff s = getmember.getMemberFactory(member);
        s.getSalary(month);
        s.getYearsOfWork(start_year);
    
     System.out.println("you want to continuo press y ");
    x=input.next().charAt(0);
    }while(x=='y'||x=='Y');
            }
}

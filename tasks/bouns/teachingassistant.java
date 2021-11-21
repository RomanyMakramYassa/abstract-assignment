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
public class teachingassistant extends Abstractfactory{
      @Override
      public typeStaff gettype(String name)
    {
    if(name.equalsIgnoreCase("is"))
    {  return new is();}
    else if(name.equalsIgnoreCase("cs"))
    {return new cs();}
    else if(name.equalsIgnoreCase("it"))
    {return new it();}
    return null;
    }
//    public void getsalary(int salary){
//    System.out.println("the salary of teaching assistant is: "+salary);
//    }
      @Override
    public void getyearsofwork(int numberofyears){
     System.out.println("the number of years for the teacher assistant is: "+numberofyears);
    }

    @Override
    void getsalaary(int salary) {
         System.out.println("the salary of teaching assistant is: "+salary);
        //To change body of generated methods, choose Tools | Templates.
    }
    
}

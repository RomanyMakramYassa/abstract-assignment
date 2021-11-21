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
public class memberfactory {
     public Staff getMemberFactory (String member)
    {
        
       if(member==null)
          {
              return null ;
          }
       if(member.equalsIgnoreCase("Doctor"))
          {
             return new Doctor();
           
          }
       else if(member.equalsIgnoreCase("TeacchingAssistant"))        
           {
               return new TeachingAssistant();
           }
     else
           return null;
       
       
       
    }
    
}

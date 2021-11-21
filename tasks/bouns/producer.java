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
public class producer {
    public static Abstractfactory gettype(boolean n)
    {
        if(n)
        {
            return new doctor();
            
        }
        else
        {
            return new teachingassistant();
        }
    }
    
}

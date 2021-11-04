/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig3abstract;

/**
 *
 * @author roman
 */
public class ball implements tossable{
    private String brandname;
    public ball(String brandname)
    {
        this.brandname=brandname;
    }
    public String getbrandname()
    {
        return brandname;
    }
    abstract public void bounce();
    public void toss()
    {
    }
}

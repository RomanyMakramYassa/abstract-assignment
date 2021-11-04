/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assig3ab1;

/**
 *
 * @author roman
 */
public class mammal implements animal {
    private String name;
    int num=2;
    String eatf;
    public void setname(String m)
    {
        this.name=m;
    }
    
    public void eat(String e)
    {
        System.out.print("the eat of"+name+" is: "+e);
    }
    public void travel()
    {
    System.out.print(" walking");
    }
    public void setnumberofleges(int n)
    {
        this.num=n;
    }
    public int nuoleg()
    {
        return (num);
    }
    public void setfaveat(String e)
    {
        this.eatf=e;
    }
    public String faveat()
    {
        return eatf;
    }
    public void printmemal(){
    System.out.print("the name of memal is "+name+"the faveat is"+faveat()+"thenumber of legs: "+nuoleg());
    }
}

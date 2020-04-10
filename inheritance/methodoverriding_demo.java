//Write a java program to demonstrate method overriding in java.
package inheritance;

class overriding
{
    void getdata()
    {
        System.out.println("this is base class method....");
    }
}
class overriding1 extends overriding
{
    void getdata()
    {
        
        System.out.println("this is derived class method....");
    }
}
public class methodoverriding_demo 
{
    public static void main(String args[])
    {
        overriding o1;          //reference object is created so both base and derived class object can be created
        o1=new overriding();
        o1.getdata();
        o1=new overriding1();
        o1.getdata();
    }
    
}

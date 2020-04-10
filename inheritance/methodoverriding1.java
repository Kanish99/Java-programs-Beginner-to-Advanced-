//Write a java program to demonstrate method overriding in java.
package inheritance;

class method1
{
    method1()
    {
        System.out.println("this is method1 fn");
    }
    void getdata()
    {
        System.out.println("this is method1 fn...");
    }
}
class method2 extends method1
{
    method2()
    {
        System.out.println("this is method2 fn");
    }
    void getdata()
    {
        System.out.println("this is method2 fn...");
    }
}
class method3 extends method2
{
    method3()
    {
        System.out.println("this is method3 fn");
    }
    void getdata()
    {
        System.out.println("this is method3 fn...");
    }
}
public class methodoverriding1 
{
    public static void main(String args[])
    {
        method1 m;
        m=new method1();
        m.getdata();
        m=new method2();
        m.getdata();
        m=new method3();
        m.getdata();
    }
}

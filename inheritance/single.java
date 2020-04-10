//Write a java program to demonstrate single inheritance.
package inheritance;
import java.util.*;
class abc
{
    int a,b;
    Scanner s=new Scanner(System.in);
    void getdata()
    {
        System.out.println("enter the value of a:");
        a=s.nextInt();
        
        System.out.println("enter the value of b:");
        b=s.nextInt();
    }
    
    void putdata()
    {
        System.out.println("value of a is:"+a);
        System.out.println("value of b is:"+b);
    }
}
class xyz extends abc
{
    void addition()
    {
        int c;
        c=a+b;
        System.out.println("addition of two no is:"+c);
    }
}
public class single {
    public static void main(String args[])
    {
        xyz xx=new xyz();
        xx.getdata();
        xx.putdata();
        xx.addition();
    }
}

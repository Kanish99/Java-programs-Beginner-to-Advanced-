//Write a java program to demonstrate constructor overloading.
package classandobject2;
import java.util.*;
class cons1
{
    public cons1()
    {
        System.out.println("Kanish Shah");
    }
    public cons1(int a)
    {
        System.out.println("value of a is:"+a);
    }
    
    public cons1(int b,int c)
    {
        System.out.println("value of b is:"+b);
        System.out.println("value of c is:"+c);
    }
}
    
public class constructordemo 
{
    public static void main(String args[])
    {
        int d,e,f;
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter d::");
        d=s.nextInt();
        System.out.println("enter e::");
        e=s.nextInt();
        System.out.println("enter f::");
        f=s.nextInt();
        cons1 c=new cons1();
        cons1 c1=new cons1(d);
        cons1 c2=new cons1(e,f);
    }
}

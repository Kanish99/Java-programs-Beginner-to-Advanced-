////Write a java program to demonstrate hierarchial inheritance.
package inheritance;
import java.util.*;
class h1
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
class h2 extends h1
{
    int c;
    void getd()
    {
        c=a+b;
        System.out.println("value of c is::"+c);
    }
}
class h3 extends h1
{
    int d;
    void getd1()
    {
        d=a*b;
        System.out.println("value of d is::"+d);
    }
    
}
public class hierarchical_inheritane {
    public static void main(String args[])
    {
        h2 h=new h2();
        h.getdata();
        h.putdata();
        h.getd();
        h3 h4=new h3();
        h4.getdata();
        h4.putdata();
        h4.getd1();
    }
}

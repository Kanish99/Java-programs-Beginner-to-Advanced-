//Write a java program to perform different types of functions along with inheritance in java.
package inheritance;

import java.util.*;
class fn1
{
    Scanner s=new Scanner(System.in);
    int a,b;
    void getd()
    {
        System.out.println("enter a::");
        a=s.nextInt();
        System.out.println("enter b::");
        b=s.nextInt();
    }
    void putd()
    {
        System.out.println("a is::"+a);
        System.out.println("b is::"+b);
    }
}
class fn2 extends fn1
{
    void addition(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("value of addition is::"+c);
    }
    int subtraction(int a,int b)
    {
        int c=a-b;
        return c;
    }
    void multiplication()
    {
        int c,p,q;
        System.out.println("enter value of p:");
        p=s.nextInt();
        System.out.println("enter value of q:");
        q=s.nextInt();
        c =p*q;
        //System.out.println("Sub of two no is::"+c);
        System.out.println("value of multiplication is::"+c);
    }
    float division()
    {
        float d,e,c;
        System.out.println("enter d::");
        d=s.nextFloat();
        System.out.println("enter e::");
        e=s.nextFloat();
        c=d/e;
        return c;
       // System.out.println("value of division is::"+c);
    }
}
public class inhwithdifferentfns
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int m,n;
        System.out.println("enter m::");
        m=s.nextInt();
        System.out.println("enter n::");
        n=s.nextInt();
        fn2 f=new fn2();
        f.addition(m, n);
        System.out.println("subtraction of two no is::"+f.subtraction(m, n));
        f.multiplication();
        System.out.println("Div of two no is::"+f.division());
    }
}

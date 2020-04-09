//Write a java program to demonstate different categories of function i.e.
//1)with no argument with return value.
//2)with no argument and no return value.
//3)with argument and return value.
//4)with argument and no return value.
//using classes and objects.
package classandobject;

import java.util.*;
class abc2
{
    Scanner s=new Scanner(System.in);
    void addition(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("Addition of two no is::"+c);
    }
    int p,q;
    void subtraction()
    {
        int c;
        System.out.println("enter value of p:");
        p=s.nextInt();
        System.out.println("enter value of q:");
        q=s.nextInt();
        c =p-q;
        System.out.println("Sub of two no is::"+c);
    }
    int mul(int a,int b)
    {
        int c;
        c=a*b;
        return c; 
    }
    int f,g;
    float div()
    {
        float c;
        System.out.println("enter value of f:");
        f=s.nextInt();
        System.out.println("enter value of g:");
        g=s.nextInt();
        c =(float)f/g;
        return c;
    }
}
public class xyz2 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        abc2 A=new abc2();
        int m,n;
        System.out.println("enter m::");
        m=s.nextInt();
        System.out.println("enter n::");
        n=s.nextInt();
        A.addition(m,n);
        A.subtraction();
        System.out.println("Mul of two no is::"+A.mul(m, n));
        System.out.println("Div of two no is::"+A.div());
    }
}

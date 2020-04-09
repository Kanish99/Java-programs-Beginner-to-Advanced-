//Write a java program to find area of Rectangle,Square,Circle and Triangle using function overloading.
package classandobject;

import java.util.*;
class abc11
{
    void area(int len,int br)  //rectangle
    {
        int r;
        r=len*br;
        System.out.println("value of r is::"+r);
    }
    void area(float b,float h)
    {
        float t;
        t=(0.5f*b*h);
        System.out.println("value of t is::"+t);
    }
    void area(int r)  //square
    {
        int a=r*r;
        System.out.println("value of a is::"+a);
    }
    void area(float r)
    {
        float b=3.14f*r*r;
        System.out.println("value of b is::"+b);
    }
}
public class fnovr2 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        abc11 A=new abc11();
        int p,q;
        System.out.println("enter p::");
        p=s.nextInt();
        System.out.println("enter q::");
        q=s.nextInt();
        A.area(p, q);
        float m,n;
        System.out.println("enter m::");
        m=s.nextFloat();
        System.out.println("enter n::");
        n=s.nextFloat();
        A.area(m, n);
        int f;
        System.out.println("enter f::");
        f=s.nextInt();
        A.area(f);
        float g;
        System.out.println("enter g::");
        g=s.nextFloat();
        A.area(g);
    }
}

//Write a java program to demonstate constructor overloading.
package classandobject2;

import java.util.*;
class cons6
{
    int x,y,z;
    cons6()
    {
        System.out.println("hello");
    }
    cons6(int a)
    {
        x=a;
    }
    cons6(int b,int c)
    {
        y=b;
        z=c;
    }
    void addition(cons6 c1,cons6 c2)
    {
        int d=c1.x+c2.y+c2.z;
        System.out.println("value of d is::"+d);
    }
}
public class constructor6 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int g,h,i;
        System.out.println("enter g::");
        g=s.nextInt();
        System.out.println("enter h::");
        h=s.nextInt();
        System.out.println("enter i::");
        i=s.nextInt();
        cons6 c=new cons6();
        cons6 c1=new cons6(g);
        cons6 c2=new cons6(h,i);
        c1.addition(c1, c2);
        
        //c1.addition(cons c1);
        //c2.addition(cons c1,cons c2);
    }
}

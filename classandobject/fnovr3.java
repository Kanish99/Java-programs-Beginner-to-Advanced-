//Write a java program that can take either 2 integers or 2 floating point numbers and output the smallest
//number using the class,function overloading.
package classandobject;

import java.util.*;
class abc12
{
    int smallest(int p,int q)
    {
        if(p<q)
        {
            return p;
        }
        else
        {
            return q;
        }
        
    }
    float smallest(float m,float n)
    {
        if(m<n)
        {
            return m;
        }
        else
        {
            return n;
        }
        
    }
}
public class fnovr3 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        float c,d;
        abc12 A=new abc12();
        System.out.println("enter a::");
        a=s.nextInt();
        System.out.println("enter b::");
        b=s.nextInt();
        System.out.println("enter c::");
        c=s.nextFloat();
        System.out.println("enter d::");
        d=s.nextFloat();
       // System.out.println("smallest is::"+A.smallest(float c,float d));
        int ch;
        System.out.println("enter 1 for int");
        System.out.println("enter 2 for float");
        System.out.println("enter choice::");
        ch=s.nextInt();
        switch(ch)
        {
            case 1:
                 System.out.println("smallest is::"+A.smallest(a,b));
                 break;
            case 2:
                 System.out.println("smallest is::"+A.smallest(c,d));
                 break;    
            default:
                System.out.println("u entered wrong choice...");
                break;
        }
    }
}

//Write a java program to perform addition of two,three and four numbers using function overloading.
package classandobject;

import java.util.*;
class abc13
{
    int sum(int a,int b)
    {
        int c;
        c=a+b;
        return c;
    }
    int sum(int d,int e,int f)
    {
        int g;
        g=d+e+f;
        return g;
    }
    int sum(int h,int i,int j,int k)
    {
        int l;
        l=h+i+j+k;
        return l;
    }
}
public class fnovr4
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        abc13 A=new abc13();
        int m,n;
        System.out.println("enter m::");
        m=s.nextInt();
        System.out.println("enter n::");
        n=s.nextInt();
        int p,q,r;
        System.out.println("enter p::");
        p=s.nextInt();
        System.out.println("enter q::");
        q=s.nextInt();
        System.out.println("enter r::");
        r=s.nextInt();
        int t,w,y,x;
        System.out.println("enter t::");
        t=s.nextInt();
        System.out.println("enter w::");
        w=s.nextInt();
        System.out.println("enter x::");
        x=s.nextInt();
        System.out.println("enter y::");
        y=s.nextInt();
        int ch;
        System.out.println("enter 1 for addition of 2 nos.");
        System.out.println("enter 2 for addition of 3 nos.");
        System.out.println("enter 3 for addition of 4 nos.");
        System.out.println("enter choice...");
        ch=s.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("addition of two nos is::"+A.sum(m,n));
                break;
            case 2:
                System.out.println("addition of three nos is::"+A.sum(p,q,r));
                break;
            case 3:
                System.out.println("addition of four nos is::"+A.sum(t,w,x,y));
                break;    
            default:
                System.out.println("u entered wrong choice....");
                break;
        }
        
    }
}

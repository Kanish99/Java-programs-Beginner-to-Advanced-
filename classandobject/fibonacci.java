//Write a java program to find and print fibonacci series.
package classandobject;

import java.util.*;
class abc4
{
    void fibo(int a,int b,int no)
    {
        for(int i=0;i<no;i++)
        {
            int c=a+b;
            System.out.print(c+"-");
            a=b;
            b=c;
        }
        System.out.println();
    }
}
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        abc4 A=new abc4();
        int m,n,r;
        System.out.println("enter m::");
        m=s.nextInt();
        System.out.println("enter n::");
        n=s.nextInt();
        System.out.println("enter range::");
        r=s.nextInt();
        A.fibo(m, n,r);
        //System.out.print(m+"-"+n"-");
    }
}

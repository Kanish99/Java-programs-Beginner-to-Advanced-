//Write a java program to check whether entered number is Armstrong or not using class and object.
//153= 1^3 + 4^3 + 5^3
package classandobject;

import java.util.*;
class abc5
{
    
    int armstrong(int n)
    {
        int ans=0;
        for(int i=n;i>0;i=i/10)
        {
            int r=i%10;
            ans=ans+(r*r*r);
        }
        if(ans==n)
        {
            System.out.println("no is armstrong");
        }
        else
        {
            System.out.println("no is not armstrong");
        }
        return n;
    }
        
}
public class armstrong
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        abc5 A=new abc5();
        int a;
        System.out.println("enter a::");
        a=s.nextInt();
        System.out.println("the no is::"+A.armstrong(a));
    }
}

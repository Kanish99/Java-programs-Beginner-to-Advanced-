//Write a java program to check whether entered number is perfect or not using class and object.
package classandobject;

import java.util.*;
class abc8
{
    int per(int n)
    {
        int add=0,mul=1;
        for(int i=n;i>0;i=i/10)
        {
            int r=i%10;
            add=add+r;
            mul=mul*r;
        }
        if(add==mul)
        {
            return 1;     
        }    
        else
        {
            return 0;   
        }
        //return n;
    }
}
public class perfect
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a;
        abc8 A=new abc8();
        System.out.println("enter a::");
        a=s.nextInt();
        if(A.per(a)==1)
        {
            System.out.println("no is perfect");
        }
        else
        {
            System.out.println("no is not perfect");
        }
    }
}

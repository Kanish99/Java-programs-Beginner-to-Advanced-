//Write a java program to check whether entered number is Palindrome or not using class and object.
//Ex:- 121
package classandobject;

import java.util.*;
class abc6
{
    int palindrome(int n)
    {
        int ans=0;
        for(int i=n;i>0;i=i/10)
        {
            int r=i%10;
            ans=ans*10+r;
        }
        if(ans==n)
        {
            System.out.println("no is palindrome");
        }
        else
        {
            System.out.println("no is not palindrome");
        }
        return n;
    }
}
public class palindrome
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a;
        abc6 A=new abc6();
        System.out.println("enter a::");
        a=s.nextInt();
        System.out.println("the no is::"+A.palindrome(a));
    }
}

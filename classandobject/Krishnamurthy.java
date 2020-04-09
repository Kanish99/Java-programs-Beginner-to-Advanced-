//Write a java program to check whether the entered number is Krishnamurthy or not using class and object.
//Ex:- 145= 1! + 4! + 5!
package classandobject;

import java.util.*;
class abc7
{
    int krish(int n)
    {
        int ans=0;
        for(int i=n;i>0;i=i/10)
        {
            int r=i%10;
            int fact=1;
            for(int j=1;j<=r;j++)
            {
                fact=fact*j;
            }
            ans=ans+fact;
        }
        if(ans==n)
        {
            System.out.println("no is krishnamurthy");
        }
        else
        {
            System.out.println("no is not krishnamurthy");
        }
        return n;
    }
}
public class Krishnamurthy
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int b;
        abc7 A=new abc7();
        System.out.println("enter b::");
        b=s.nextInt();
        System.out.println("value is::"+A.krish(b));
    }
}

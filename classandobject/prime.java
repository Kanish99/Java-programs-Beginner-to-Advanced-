//Write a program to find whether number is prime or not using class and object.
package classandobject;

import java.util.*;
class abc9
{
    int pri(int n)
        {
            int count=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("no is prime....");
            }
            else
            {
                System.out.println("no is not prime....");
            }
            return n;
        }
}
public class prime 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a;
        abc9 A=new abc9();
        System.out.println("enter a::");
        a=s.nextInt();
        System.out.println("value is::"+A.pri(a));
    }
}

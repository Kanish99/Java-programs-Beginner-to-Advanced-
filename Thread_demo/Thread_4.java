//Write a java application program for generating four threads to perform following operations-
// i)Getting N numbers as input ii)Printing the numbers divisible by five iii)Printing prime numbers
// iv)Computing the average.

package Thread_demo;
import java.util.*;
class ABC extends Thread
{
    Scanner s=new Scanner(System.in);
    public void run()
    {
        int n;
        System.out.println("Enter n nos");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            //n=s.nextInt();
            System.out.println(i);
        }
    }
}
class ABC1 extends Thread
{
    public void run()
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5],i,count=0;
        System.out.println("Enter a nos");
        //a=s.nextInt();
        for(i=0;i<5;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<5;i++)
        {
            if(a[i]%5==0)
            {
                    count++;
            }                
        }
       if(count>0)
       {
           System.out.println("No is divisible by 5::"+count);
       }
    }
}
class ABC2 extends Thread
{
    public void run()
    {
        Scanner s=new Scanner(System.in);
        int b,cnt=0;
        System.out.println("enter b");
        b=s.nextInt();
        for(int i=2;i<=b/2;i++)
        {
            if(b%i==0)
            {
                cnt=1;
            }
        }
        if(cnt==0)
        {
            System.out.println("no is prime"+b);
        }
        else
        {
            System.out.println("no is not prime"+b);
        }
    }
}
class ABC3 extends Thread
{
    public void run()
    {
        Scanner s=new Scanner(System.in);
        int c,d,e,avg=0;
        System.out.println("enter the three numbers:");
        System.out.println("enter c::");
        c=s.nextInt();
        System.out.println("enter d::");
        d=s.nextInt();
        System.out.println("enter e::");
        e=s.nextInt();
        avg=(c+d+e)/3;
        System.out.println("Avg of 3 nos is::"+avg);
    }
}
public class Thread_4
{
    public static void main(String args[])
    {
        ABC aa=new ABC();
        ABC1 aa1=new ABC1();
        ABC2 aa2=new ABC2();
        ABC3 aa3=new ABC3();
        aa.start();
        try
        {
            aa.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        aa1.start();
         try
        {
            aa1.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        aa2.start();
         try
        {
            aa2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        aa3.start();
        try
        {
            aa3.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

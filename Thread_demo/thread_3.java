//Write a program to perform the concept of threading using Thread class in java.
package Thread_demo;

class A extends Thread
{
     @Override
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("value of i is:=====>"+i);
                Thread.sleep(2000);        
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
class B extends Thread
{
     @Override
    public void run()
    {
        try
        {
            for(int j=5;j<10;j++)
            {
                System.out.println("value of j is:=====>"+j);
                Thread.sleep(1000);         
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
class C extends Thread
{
     @Override
    public void run()
    {
        try
        {
            for(int k=10;k<15;k++)
            {
                System.out.println("value of k is:=====>"+k);
                Thread.sleep(1000);        
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
public class thread_3
{
    public static void main(String args[])
    {
        A a=new A();
        a.start();
        B b=new B();
        b.start();
        C c=new C();
        c.start();
    }
}

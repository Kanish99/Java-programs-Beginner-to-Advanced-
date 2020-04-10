//Write a program to to test runnable interface in java.

//Creation of 3 diff threads using runnable interface with 3 diff objects
//refer to multiplethreading_runnableinterfaceconcept where single thread is created and is executed by 3 diff objects
package Thread_demo;

class runnable11 implements Runnable
{
    Thread t;
    public runnable11()
    {
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("value of i is::"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class runnable12 implements Runnable
{
    Thread t;
    public runnable12()
    {
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run()
    {
        try
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("value of j is::"+j);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class runnable13 implements Runnable
{
    Thread t;
    public runnable13()
    {
        t=new Thread(this);
        t.start();
    }
    @Override
    public void run()
    {
        try
        {
            for(int k=0;k<5;k++)
            {
                System.out.println("value of k is::"+k);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class runnable_interface1 
{
    public static void main(String args[])
    {
        runnable11 rr=new runnable11();
        runnable12 rr1=new runnable12();
        runnable13 rr3=new runnable13();
    }
}

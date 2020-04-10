//Write a java program to perform the concept of thread priorities(with using sleep method).

//Implementation of sleep and setpriority and how sleep counter effects setpriority and nullify its effect
package Thread_demo;

class Th3 extends Thread
{
    public void run()
    {
        System.out.println("Thread 1");
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("A:"+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("End of thread is::");
        }
    }
}
class Th4 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2");
        try
        {
            for(int k=1;k<=5;k++)
            {
                System.out.println("B"+k);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("End of thread 2");
        }
    }
}

public class thread_priority1
{
    public static void main(String args[])
    {
        Th3 obj1=new Th3();
        Th4 obj2=new Th4();
        obj1.setPriority(1);
        obj1.getPriority();
        obj2.setPriority(10);
        obj2.getPriority();
        System.out.println("Starting thread1");
        obj1.start();
        System.out.println("Starting thread2");
        obj2.start();
    }
}

//Write a java program to perform the concept of thread priorities(without using sleep method).

//thread priorities prog
package Thread_demo;

class Th extends Thread
{
    public void run()
    {
        System.out.println("Thread 1");
        for(int i=1;i<=5;i++)
        {
            System.out.println("A:"+i);
        }
        System.out.println("End of thread is::");
    }
}
class Th1 extends Thread
{
    public void run()
    {
        System.out.println("Thread 2");
        for(int k=1;k<=5;k++)
        {
            System.out.println("B"+k);
        }
        System.out.println("End of thread 2");
    }
}
public class thread_priority
{
    public static void main(String args[])
    {
        Th obj1=new Th();
        Th1 obj2=new Th1();
        obj1.setPriority(10);
        obj1.getPriority();
        obj2.setPriority(1);
        obj2.getPriority();
        System.out.println("Starting thread1");
        obj1.start();
        System.out.println("Starting thread2");
        obj2.start();
    }
}

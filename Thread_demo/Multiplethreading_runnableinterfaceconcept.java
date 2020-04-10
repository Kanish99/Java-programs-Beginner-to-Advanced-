//Write a program to demonstrate Multiple threading in java using runnable interface.

//use of runnable interface in creating multiple threads(Multithreading concept)
//execution of single thread with its 3 diff objects
package Thread_demo;

class runnable_demo1 implements Runnable
{
    Thread t;
    public runnable_demo1()
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
                System.out.println("value of i is:=====>"+i);
                Thread.sleep(1000);        
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}

public class Multiplethreading_runnableinterfaceconcept 
{
    public static void main(String args[])
    {
        runnable_demo1 rr=new runnable_demo1();
        runnable_demo1 rr1=new runnable_demo1();
        runnable_demo1 rr2=new runnable_demo1();
    }
}

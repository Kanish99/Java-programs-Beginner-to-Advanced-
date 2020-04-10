//Write a java program to check and observe what happens when we start a thread twice.

//program to check what if we start same thread twice and check how it behaves
//program will generate exception by name "IllegalThreadStateException"
package Thread_demo;

class threadtwice extends Thread
{
    @Override
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("value of i is:=====>"+i);
                Thread.sleep(1000);        //Thread is base class and sleep is abstract method.sleep method creates by default exception so its is written in try catch block 
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class startingthreadtwice_demo
{
    public static void main(String args[])
    {
        threadtwice tt=new threadtwice();
        tt.start();
        tt.start();
    }
}

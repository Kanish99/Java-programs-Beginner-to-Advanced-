//Write a program to perform concept of threading using Thread class in java.
package Thread_demo;

class abc extends Thread
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
public class thread_1 {
    public static void main(String args[])
    {
        abc A=new abc();
        A.start();
    }
}

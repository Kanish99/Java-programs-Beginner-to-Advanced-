//Write a java program to check what happens when we call run method i.e.object_name.run();
//instead of object_name.start(); Test the run method.

//What happens when we call run method instead of start method??

//first refer to thread_3.java where object of thread is created
//Now difference between normal thread programs and this prog is that here normal object is created so the execution will be in 
//proper way but in previous prog object of thread is created so all threads will execute parallel that is
//reason why values were coming in random.So,this is difference between calling a thread by run method and calling a
//thread by start
package Thread_demo;

class AA extends Thread
{
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
class BB extends Thread
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
class CC extends Thread
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

public class callingrunmethod_demo {
    public static void main(String args[])
    {
        AA a=new AA();
        a.run();
        BB b=new BB();
        b.run();
        CC c=new CC();
        c.run();
    }
}

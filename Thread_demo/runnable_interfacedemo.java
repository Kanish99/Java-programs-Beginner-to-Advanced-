//Write a program to test runnable interface in java.

//Thread implementation using runnable interface:-
//As thread class and its properties is not present in runnable so inorder to access start we create thread 
//class inside runnable and its object so by that start can be implemented and thread can be created.
//user defined thread->thread->runnable interface.
//for ex to create desktop based applications we need applet where user defined class inherits applet and if 
//want to use thread so java doesnot support multiple inheritance,as thread and applet are inbuilt classes
//so soln of this problem is by using runnable interface.
package Thread_demo;

class runnable_demo implements Runnable
{
    Thread t;
    public runnable_demo()
    {
        t=new Thread(this);  //this is used to refer current class ie Thread
        t.start();           //start is a method of thread so it implements runnable abstract method 
                               //start that cannot be used so in order to solve the problem we create thread
    }
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
public class runnable_interfacedemo {
    public static void main(String args[])
    {
        runnable_demo rr=new runnable_demo();    
    }
}

















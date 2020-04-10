//Write a program to demonstrate Multiple threading in java using Thread class itself.

//use of Thread in creating multiple thread objects which is second method of creating multiple threads(Multiplethreading concept)
//the first one being creating 3 diff threads(refer to thread_3.java program)
package Thread_demo;
class multithreaded_demo extends Thread
{
     @Override
    public void run()
    {
        System.out.println("start method....");
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
        System.out.println("stop method.....");
    }

}
public class Multiplthreadconceptethreading_ 
{
    public static void main(String args[])      //creating 3 diff objects of single thread(while thread_3 prog we created individual objects of each thread)
    {
        multithreaded_demo mm=new multithreaded_demo();      
        mm.start();
        multithreaded_demo mm1=new multithreaded_demo();
        mm1.start();
        multithreaded_demo mm2=new multithreaded_demo();
        mm2.start();
    }
}

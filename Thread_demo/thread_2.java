//Write a program to perform the concept of threading using Thread class in java.
package Thread_demo;

class abc1 extends Thread    //Thread is main class where abc1 inherits it
{
    @Override
    public void run()           //void run is abstract method 
    {
        System.out.println("Kanish shah");
    }
}
public class thread_2
{
    public static void main(String args[])
    {
        abc1 aa=new abc1();    //Thread gets created
        aa.start();      //Thread goes into running state
    }
}

//Write a program for naming threads in java and test its function getName() and setName().
package Thread_demo;

class Naming_thread_using_currentthread extends Thread
{  
     public void run()
    {  
           //Thread.currentThread().setName("bhavesh jain");
           System.out.println(Thread.currentThread().getName());  //Thread.currentThread returns the current object and that current object.getName() returns named of thread bydefault   
    }  
    public static void main(String args[])
    {  
        Naming_thread_using_currentthread t1=new Naming_thread_using_currentthread();  
        Naming_thread_using_currentthread t2=new Naming_thread_using_currentthread();  
        t1.setName("jain");
        t2.setName("bhavesh");
        t1.start();  
        t2.start();  
    }  
}  
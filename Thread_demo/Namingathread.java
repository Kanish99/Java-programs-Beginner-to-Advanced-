//Write a program for naming threads in java and test its function getName() and setName().
package Thread_demo;

class Namingathread extends Thread
{  
  public void run()
  {  
     System.out.println("running...");  
  }  
     public static void main(String args[])
     {  
            Namingathread t1=new Namingathread();  
            Namingathread t2=new Namingathread();  
            System.out.println("Name of t1:"+t1.getName());  //this will return bydefault name of that thread
            System.out.println("Name of t2:"+t2.getName());  
   
            t1.start();  
            t2.start();  
  
            t1.setName("Kanish Shah");  //if u want name explicitly then use setName and use getName to return that name...
            System.out.println("After changing name of t1:"+t1.getName());  
    }  
}  

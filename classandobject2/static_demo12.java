//Write a java program to test static block and test its execution.

package classandobject2;

class st_demo
{
    static int a=10;
    static
    {
        System.out.println("bhavesh jain");
    }
    
    static
    {
        System.out.println("jain bhavesh");
    }
            
            
}
public class static_demo12 
{
    public static void main(String args[])
    {
        System.out.println("value of a is:"+st_demo.a);
    }
}

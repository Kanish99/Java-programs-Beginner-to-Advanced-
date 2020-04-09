//Write a java program to demonstate function overloading.
package classandobject;

class func_over
{
    void ab()
    {
        System.out.println("Bhavesh Jain");
    }
    void ab(int a)
    {
        System.out.println("value of a is:"+a);
    }
    void ab(int b,int c)
    {
        System.out.println("value of b is:"+b);
        System.out.println("value of c is:"+c);
    }
    
    
}
public class function_overloading {
    public static void main(String args[])
    {
        func_over ff=new func_over();
        ff.ab();
        ff.ab(10);
        ff.ab(20, 30);
        
        
    }
}

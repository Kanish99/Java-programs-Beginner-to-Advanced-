//Write a java program to demonstrate static variable.
package classandobject2;

class static_demo1
{
     static int a;
    int b;
    void getdata()
    {
        a++;
        b=a;
    }
    
    void putdata()
    {
        System.out.println("value of a is:"+a);
        System.out.println("value of b is:"+b);
    }
}
public class static_variable_demo {
    public static void main(String args[])
    {
        static_demo1 ss=new static_demo1();
        static_demo1 ss1=new static_demo1();
        static_demo1 ss2=new static_demo1();
        
        ss.getdata();
        ss.putdata();
        ss1.getdata();
        ss1.putdata();
        ss2.getdata();
        ss2.putdata();
        
        
    }
}

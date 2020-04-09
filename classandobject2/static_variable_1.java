//Write a java program to demonstrate static variable.
package classandobject2;
//Static variable starts with the last value which was once there in program
class static_demo2
{
    static int a;
    int b;
    void getdata()
    {
        ++a;          
        b=a;
    }
    void putdata()
    {
        System.out.println("a is::"+a);
        System.out.println("b is::"+b);
    }
}
public class static_variable_1 
{
    public static void main(String args[])
    {
        static_demo2 ss1=new static_demo2();
        static_demo2 ss2=new static_demo2();
        static_demo2 ss3=new static_demo2();
        ss1.getdata();
        ss1.putdata();
        ss2.getdata();
        ss2.putdata();
        ss3.getdata();
        ss3.putdata();
    }
}

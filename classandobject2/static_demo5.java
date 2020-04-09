//Write a java program to increment value of a variable by making it static.
package classandobject2;

class counter1
{
    static int count=0;
    counter1()
    {
        count++;
        System.out.println(count);
    }
}
public class static_demo5
{
    public static void main(String args[])
    {
        counter1 c1=new counter1();
        counter1 c2=new counter1();
        counter1 c3=new counter1();
    }
}

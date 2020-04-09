//Write a java program to increment value of a variable without static variable
package classandobject2;

class counter
{
    int count=0;
    counter()
    {
        count++;
        System.out.println(count);
    }
}
public class static_demo4 
{
    public static void main(String args[])
    {
        counter c1=new counter();
        counter c2=new counter();
        counter c3=new counter();
    }
}

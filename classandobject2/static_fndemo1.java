//Write a java program to perform addition and multiplication of 2 static variables by taking static data functions.
package classandobject2;

class static_class1
{
    static int a,b,c;
    static void ab()
    {
        a=10;
        b=20;
    }
    static void getd()
    {
        c=a+b;
    }
    static void getd1()
    {
        c=a*b;
        System.out.println("value of c is::"+c);
    }
    static void putd()
    {
        System.out.println("value of is::"+c);
    }
}
public class static_fndemo1 
{
    public static void main(String args[])
    {
        static_class1.ab();
        static_class1.getd();
        static_class1.putd();
        static_class1.getd1();
    }
}

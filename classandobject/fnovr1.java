//Write a java program to perform the function overloading. 
package classandobject;

class abc10
{
    void getd()
    {
        System.out.println("Java_demo");
    }
    void getd(int a)
    {
        System.out.println("value of a is:"+a);
    }
    void getd(int b,int c)
    {
        System.out.println("value of b is:"+b);
        System.out.println("value of c is:"+c);
    }
}    

public class fnovr1
{
    public static void main(String args[])
    {
        abc10 A=new abc10();
        A.getd();
        A.getd(10);
        A.getd(20,30);
    }
}

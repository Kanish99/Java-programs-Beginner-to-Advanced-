//Write a java program to demonstrate super keyword.
package inheritance;
class A
{
    int x;
    A()
    {
        //this();
        System.out.println("Hello world");
    }
    A(int a)
    {
        //this();
        x=a;
        System.out.println("x is::"+x);
    }
}
class B extends A
{
    int b,c;
    B()
    {
        //this();
        System.out.println("Kanish Shah");
    }
    B(int d,int e)
    {
        //this();
        super(10);
        
        b=d;
        c=e;
        System.out.println("b is::"+b);
        System.out.println("c is::"+c);
    }
}
class C extends B
{
    int y,z,i;
    C()
    {
        System.out.println("I m an engineer");
    }
    C(int f,int g,int h)
    {
        super(50,60);
        y=f;
        z=g;
        i=h;
        System.out.println("f is::"+f);
        System.out.println("z is::"+z);
        System.out.println("i is::"+i);
    }
}
public class superkey3 
{
    public static void main(String args[])
    {
        C c=new C();
        C c1=new C(20,30,40);
    }
}

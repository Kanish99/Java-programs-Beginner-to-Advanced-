//Write a java program to demonstrate super keyword.
/*  super keyword is used to call base class method and base class constructor  */
package inheritance;

class single2
{
    int x;
    
    single2(int a)
    {
        x=a;
        System.out.println("x is::"+x);
    }
    single2()
    {
        System.out.println("Helloworld");
    }
}
class single3 extends single2
{
    int b,c;
    single3()
    {
       // super(40);
        System.out.println("Kanish Shah");
    }
    single3(int d,int e)
    {
       super(40);            //used super keyword to call base class constructor.
        b=d;                  //here super keyword is used bcoz while creating obj of derived class we were not able to call parametrized cons of base class so inorder to call it we
                              //write super keyword with one arg in derived parametrized cons of derived class   
        c=e;
        System.out.println("b is::"+b);
        System.out.println("c is::"+c);
    }
}
public class superkey_demo 
{
    public static void main(String args[])
    {
        single3 s=new single3();
        single3 s1=new single3(10,20);
    }
}

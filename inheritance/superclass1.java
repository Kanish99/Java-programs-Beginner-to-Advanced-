//Write a java program to demonstrate super keyword.
//use of superclass to call superclass method and cons also
//used only in inheritance
package inheritance;

class single_2
{
    int x;
    single_2()
    {
        System.out.println("Hello");
    }
    single_2(int a)
    {
        x=a;
    }
    void putdata_single_2()
    {
        System.out.println("x is::"+x);
    }
}
class single_3 extends single_2
{
    int b,c;
    single_3()
    {
        System.out.println("Kanish Shah");
    }
    single_3(int d,int e)
    {
       super(40);            //used super keyword to call base class constructor.
        b=d;                  //here super keyword is used bcoz while creating obj of derived class we were not able to call parametrized cons of base class so inorder to call it we write super keyword with one arg in derived parametrized cons of derived class   
        c=e;
    }
    void putdata_single_3()
    {
        super.putdata_single_2();            //super used to call superclass method
        System.out.println("b is::"+b);
        System.out.println("c is::"+c);  
    }
}

public class superclass1
{
    public static void main(String args[])
    {
        single_3 s=new single_3();
        single_3 s1=new single_3(10,20);
        s1.putdata_single_3();
    }
}

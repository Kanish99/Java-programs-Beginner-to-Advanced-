//Write a java program to demonstrate this keyword.
package classandobject2;

class this_demo2
{
    int id;
    char name;
    this_demo2()
    {
        System.out.println("Default constructor");
    }
    public this_demo2(int a)
    {
        this();
        System.out.println("value of a is::"+a);
    }
    this_demo2(int id,char name)
    {
        this.id=id;
        this.name=name;
    }
     void display()
    {
        this.getdata();          
        System.out.println("Value of id is:"+id);
        System.out.println("Value of name is:"+name);
    }
     void getdata()
    {
        System.out.println("Kanish Shah");
    }
}
public class thisdemo1
{
    public static void main(String args[])
    {
        this_demo t1=new this_demo(10);
        this_demo2 t=new this_demo2(12,'m');
        t.display();
    }
}

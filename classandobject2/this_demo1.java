//Write a java program to demonstrate this keyword.

/*
use of this keyword
1.to compare local and global variable
2.to call current class object constructor
3.to call current class object method

*/
package classandobject2;
class this_demo
{
    int id;
    String name;
    public this_demo()
    {
        System.out.println("Defualt Constructor");
    }
    public this_demo(int a)
    {
        this();                      //to call current class object method
        System.out.println("Value of a is:"+a);
    }
    public this_demo(int id,String name)
    {
        this(10);                     
        this.id=id;                 //to compare local and global variable
        this.name=name;
        //this();
    }
    
    void display()
    {
        this.getdata();          // to call current class object method
        System.out.println("Value of id is:"+id);
        System.out.println("Value of name is:"+name);
    }
    
    void getdata()
    {
        System.out.println("getdata method");
    }
}
public class this_demo1 {
    public static void main(String args[])
    {
        //this_demo tt=new this_demo();
        this_demo t=new this_demo(12, "bhavesh");
        t.display();
    }
}

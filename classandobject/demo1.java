//Create a class ABC and declare two data members.Create a function getdata() and print some message
//in that fuction.Create an object of class ABC and use it to call members and functions of class.
package classandobject;
class ABC
{
        int a,b;
        void getdata()
        {
            System.out.println("Kanish Shah");
        }   
}
public class demo1
{
    public static void main(String args[])
    {
        ABC bb=new ABC();
        bb.getdata();
        System.out.println("Value of a is :"+bb.a);
        System.out.println("Value of b is :"+bb.b);
    }
}

//Create a class abc and intialize two data members.Create a function getdata() and print some message
//in that fuction.Create an object of class abc and use it to call members and functions of class.
package classandobject;

class abc
{
    int a=10,b=20;
    void getdata()
    {
        System.out.println("Bhavesh Jain");
    }
}

public class demo {
    public static void main(String args[])
    {
        abc A=new abc();
        A.getdata();
        System.out.println("Value of a is :"+A.a);
        System.out.println("Value of b is :"+A.b);
        
    }
}


//Create a class addition and declare two data members a and b.Create a user-defined data function
//getdata() for entering dynamic values and another data function putdata() for printing the values.
//Create a function addition() to perform addition of two numbers and print the sum.
//Create an object of class and use it to call the functions of class.
package classandobject;
import java.util.*;
class Addition
{
    int a,b;
    Scanner s=new Scanner(System.in);
    void getdata()
    {
        System.out.println("enter value of a:");
        a=s.nextInt();
        System.out.println("enter value of b:");
        b=s.nextInt();
    }
    
    void putdata()
    {
        System.out.println("value of a is::"+a);
        System.out.println("value of b is::"+b);
    }
    void addition()
    {
        int c;
        c=a+b;
        System.out.println("value of c is::"+c);
    }
}
public class abc1 
{
    public static void main(String args[])
    {
       // Scanner s= new Scanner(System.in);
        Addition A =new Addition();
        A.getdata();
        A.putdata();
        A.addition();
    }
}
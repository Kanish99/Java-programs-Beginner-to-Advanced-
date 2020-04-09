//Create a class complex that has 2 data members a and b.Create a user-defined data function
//getdata() to enter user-defined values a and b and another data function to print a and b
//in the form a+ib.Create a class add to perform addition of two a and two b using call by reference.


package classandobject;
import java.util.*;
class complex
{
    int a,b;
    Scanner s=new Scanner(System.in);
    void getd()
    {
        System.out.println("enter a::");
        a=s.nextInt();
        System.out.println("enter b::");
        b=s.nextInt();
    }
    void putd()
    {
        System.out.println(a+ "+i"+ b);
    }
    void add(complex A,complex B)
    {
        System.out.println("After call by refrence is::");
        a=A.a+B.a;
        b=A.b+B.b;
    }
}
public class callbyref2
{
    public static void main(String args[])
    {
        complex A=new complex();
        complex B=new complex();
        complex C=new complex();
        
        A.getd();
        A.putd();
        
        B.getd();
        B.putd();
        
        C.add(A,B);
        C.putd();
        
    }
}

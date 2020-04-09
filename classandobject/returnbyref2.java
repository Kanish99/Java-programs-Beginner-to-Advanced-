//Create a class complex that has 2 data members a and b.Create a user-defined data function
//getdata() to enter user-defined values a and b and another data function to print a and b
//in the form a+ib.Create a class add to perform addition of two a and two b using return by reference.

package classandobject;
import java.util.*;
class abc19
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
    abc19 add(abc19 A,abc19 B)
    {
        abc19 d=new abc19();
        System.out.println("After call by reference is::");
        d.a=A.a+B.a;
        d.b=A.b+B.b;
        return d;
    }
}
public class returnbyref2
{
    public static void main(String args[])
    {
        abc19 A=new abc19();
        abc19 B=new abc19();
        abc19 C=new abc19();
        abc19 r=new abc19();
        
        A.getd();
        A.putd();
        
        B.getd();
        B.putd();
        
        r=C.add(A, B);
        r.putd();
        
    }
}

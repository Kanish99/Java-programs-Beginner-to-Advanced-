//Create a class time that has 3 data members hr,min,sec.Create a user-defined fn getd() to enter
//hr,min,sec from user and take another user-defined data function to print them.Create a data function
//addtion() to add two times with the help of return by reference.
package classandobject;

import java.util.*;
class abc18
{
    Scanner s=new Scanner(System.in);
       int hr,min,sec;
    void getd()
    {
        System.out.println("enter hr::");
        hr=s.nextInt();
        System.out.println("enter min::");
        min=s.nextInt();
        System.out.println("enter sec::");
        sec=s.nextInt();
    }
    void putd()
    {
        System.out.println(hr+":"+min+":"+sec);
        
    }
    abc18 addition(abc18 A,abc18 B)
    {
        System.out.println("after return by refrence is::");
        abc18 d=new abc18();
        d.sec=A.sec+B.sec; 
        d.min=A.min+B.min+d.sec/60;
        d.hr=A.hr+B.hr+d.min/60;
        d.sec=d.sec%60;
        d.min=d.min%60;
        return d;
    }
 
}
public class returnbyref1
{
    public static void main(String args[])
    {
        abc18 A=new abc18();
        abc18 B=new abc18();
        abc18 C=new abc18();
        abc18 r=new abc18();
        A.getd();
        A.putd();
        
        B.getd();
        B.putd();
        
        r=C.addition(A,B);
        r.putd();
  
    }
}

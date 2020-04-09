//Create a class time that has 3 data members hr,min,sec.Create a user-defined fn getd() to enter
//hr,min,sec from user and take another user-defined data function to print them.Create a data function
//addtion() to add two times with the help of call by reference.
package classandobject;

import java.util.*;
class time
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
    void addition(time A,time B)
    {
        System.out.println("after call by refrence is::");
        sec=A.sec+B.sec; 
        min=A.min+B.min+sec/60;
        hr=A.hr+B.hr+min/60;
        sec=sec%60;
        min=min%60;
    }
}
public class callbyref1 
{
    public static void main(String args[])
    {
        time A=new time();
        time B=new time();
        time C=new time();
        
        A.getd();
        A.putd();
        
        B.getd();
        B.putd();
        
        C.addition(A,B);
        C.putd();
    }
}

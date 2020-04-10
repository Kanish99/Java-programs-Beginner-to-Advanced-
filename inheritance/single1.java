//Write a java program to demonstrate single inheritance.
package inheritance;

import java.util.*;
class si
{
    Scanner s=new Scanner(System.in);
    int a,b;
    void getd()
    {
        System.out.println("enter a::");
        a=s.nextInt();
        System.out.println("enter b::");
        b=s.nextInt();
    }
    void putd()
    {
        System.out.println("a is::"+a);
        System.out.println("b is::"+b);
    }
}
class si1 extends si
{
    int c;
    void addition()
    {
        c=a+b;
        System.out.println("c is::"+c);
    }            
}
public class single1 
{
    public static void main(String args[])
    {
        si1 i=new si1();
        i.getd();
        i.putd();
        i.addition();
    }
}

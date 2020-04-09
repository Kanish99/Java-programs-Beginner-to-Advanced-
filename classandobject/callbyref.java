//Write a java program to demonstrate call by refrence.
package classandobject;

import java.util.*;
class abc14
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
    void sum(abc14 A,abc14 B)
    {
        System.out.println("after call by refrence is...");
        a=A.a+B.a;
        b=A.b+B.b;
    }
}
public class callbyref
{
    public static void main(String args[])
    {
        abc14 A=new abc14();
        abc14 B=new abc14();
        abc14 C=new abc14();
        
        A.getd();
        A.putd();
        
        B.getd();
        B.putd();
        
        C.sum(A,B);
        C.putd();
    }
}

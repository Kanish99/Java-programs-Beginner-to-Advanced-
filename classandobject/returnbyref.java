//Write a java program to demonstrate return by reference.
package classandobject;

import java.util.*;
class abc17
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
    abc17 sum(abc17 A,abc17 B)
    {
        abc17 d=new abc17();
        System.out.println("after call by refrence is...");
        d.a=A.a+B.a;
        d.b=A.b+B.b;
        return d;
    }
}
public class returnbyref
{
    public static void main(String args[])
    {
        abc17 A=new abc17();
        abc17 B=new abc17();
        abc17 C=new abc17();
        
        A.getd();
        A.putd();
        
        B.getd();
        B.putd();
        
        abc17 r=new abc17();
        r=C.sum(A,B);
        r.putd();
    }
}

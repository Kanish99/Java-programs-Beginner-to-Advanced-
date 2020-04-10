
package inheritance;

import java.util.*;
class abc1
{
    Scanner s=new Scanner(System.in);
    int a;
    void getd()
    {
        System.out.println("enter value of a::");
        a=s.nextInt();
    }
    void putd()
    {
        System.out.println("value of a is::"+a);
    }
}
class abc2 extends abc1
{
    Scanner s=new Scanner(System.in);
    int b;
    void getdata()
    {
        System.out.println("enter value of b::");
        b=s.nextInt();
    }
    void putdata()
    {
        System.out.println("value of a is::"+b);
    }
}    
class abc3 extends abc2
{
    int c;
    void addition()
    {
        c=a+b;
        System.out.println("additio of 2 nos is::"+c);
    }
}
public class multilevelinheritance 
{
    public static void main(String args[])
    {
        abc3 a=new abc3();
        a.getd();
        a.putd();
        a.getdata();
        a.putdata();
        a.addition();
    }
}

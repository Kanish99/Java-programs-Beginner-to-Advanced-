//Write a class called arithmetic having two integer and one character data members.It performs
//the operation on its integermembers indicated by character member(+,-,*,/) for example *
//indicates multiplication on data members as d1*d2.Write a class with all necessary constructors
//and methods to perform the operation and print the operation performed in the format
//Ans=d1 op d2.Write your class using main().
package classandobject2;

import java.util.*;
class arithmetic
{
    int a,b,d;
    char c; 
    public arithmetic(int x,int y,char z)
    {
        a=x;
        b=y;
        c=z;
    }
    int operation()
    {
        switch(c)
        {
            case '+':
                    d=a+b;
                    break;
            case '-':
                    d=a-b;
                    break;
            case '*':
                    d=a*b;
                    break;
            case '/':
                    d=a/b;
                    break;
        }
        return d;
    }
    
}
public class constructor2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        arithmetic aa=new arithmetic(10, 20, '+');
        arithmetic bb=new arithmetic(10, 20, '-');
        arithmetic cc=new arithmetic(10, 20, '*');
        arithmetic dd=new arithmetic(10, 20, '/');
        System.out.println(""+aa.operation());
        System.out.println(""+bb.operation());
        System.out.println(""+cc.operation());
        System.out.println(""+dd.operation());
    }
}

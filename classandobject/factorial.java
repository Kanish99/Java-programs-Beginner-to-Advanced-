//Write a java program to find factorial of a given number.
package classandobject;
import java.util.*; 
class abc3
{
    Scanner s=new Scanner(System.in);
    int fact(int n)
    {
        int r=1;
        for(int i=1;i<=n;i++)
        {
            r=r*i;
        }
        return r;    
    }
}
public class factorial
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        abc3 A=new abc3();
        int a;
        System.out.println("enter a::");
        a=s.nextInt();
        System.out.println("value of factorial is::"+A.fact(a));
    }
}

//Write a java program to demonstrate final keyword.
//use of final keyword in class,method and variables....
package inheritance;

final class final1
{
    //final int a;
    final void getdata()
    {
        System.out.println("hello");
    }
    
}
//class final2 extends final1
//{
  //  void getdata()
    //{
  //      System.out.println("hello world");
    //}
//}

public class useoffinalkeyword 
{
    public static void main(String args[])
    {
        int i;
        final1 f;
        final int a=5;
        for(i=0;i<3;i++)
        {
        //    a++;
        }
        System.out.println("a is::"+a);
        f=new final1();
        f.getdata();
       // f=new final2();
        f.getdata();
    }
}

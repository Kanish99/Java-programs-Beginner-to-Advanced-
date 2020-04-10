//Write a java program to prove that java doesnot support multiple inheritance.
package inheritance;

class multiple1
{
    void getdata()
    {
        System.out.println("this is multiple1 method");
    }
}
class multiple2 
{
    void getdata()
    {
        System.out.println("this is multiple2 method");
    }
}
/*class multiple3 extends multiple1,multiple2      //multiple is not possible as syntax error comes...
{
    void getdata()
    {
        System.out.println("this is multiple3 method");
    }
}*/
public class multipleprove 
{
    public static void main(String args[])
    {
        multiple2 m1=new multiple2();
        m1.getdata();
        m1.getdata();
     //   multiple3 m2=new multiple3();
       // m2.getdata();
       // m2.getdata3();
    }
}

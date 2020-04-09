//Write a java program to demonstate static variable along with this concept.
package classandobject2;

class static_demo3
{
    int rollno;
    String name;
    static String college="Indus";
    static_demo3(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }
}
public class static_variable_3 
{
    public static void main(String args[])
    {
        static_demo3 s1=new static_demo3(53,"Kanish");
       static_demo3 s2=new static_demo3(54,"Kushal");
        s1.display();
        s2.display();
    }
}

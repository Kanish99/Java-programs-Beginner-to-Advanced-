//Write a java program to perform static function using classes and objects.
package classandobject2;
class static_class
{
    static void ab()
    {
        System.out.println("Bhavesh Jain");
    }
    public static void kanish()
    {
        System.out.println("kanish Shah");
    }
}
public class stati_function_demo {
    static public void main(String a[])
    {
        static_class.ab();
        static_class.kanish();
        kanish();
    }
    
    public static void kanish()
    {
        System.out.println("xyz");
    }
}

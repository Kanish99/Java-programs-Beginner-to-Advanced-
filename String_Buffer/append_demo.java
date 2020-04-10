//Write a java program to test "append" StringBuffer function.

//The append() method concatenates the given argument with this string.
package String_Buffer;
public class append_demo
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hello ");  
        sb.append("Java");//now original string is changed  
        System.out.println(sb);//prints Hello Java  
    }
}

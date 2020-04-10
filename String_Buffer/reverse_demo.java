//Write a java program to test "reverse" StringBuffer function.

//The reverse() method of StringBuilder class reverses the current string.
package String_Buffer;
public class reverse_demo
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hello");  
        sb.reverse();  
        System.out.println(sb);//prints olleH  
    }
}

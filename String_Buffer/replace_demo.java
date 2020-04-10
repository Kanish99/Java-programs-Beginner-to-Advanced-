//Write a java program to test "replace" StringBuffer function.

//The replace() method replaces the given string from the specified beginIndex and endIndex.
package String_Buffer;
public class replace_demo 
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hello");  
        sb.replace(1,3,"Java");  
        System.out.println(sb);//prints HJavalo  
    }
}

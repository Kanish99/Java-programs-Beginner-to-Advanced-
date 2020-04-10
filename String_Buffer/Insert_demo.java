//Write a java program to test "insert" StringBuffer function.

//The insert() method inserts the given string with this string at the given position.
package String_Buffer;

public class Insert_demo
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hello ");  
        sb.insert(1,"Java");//now original string is changed  
        System.out.println(sb);//prints HJavaello  
    }
}

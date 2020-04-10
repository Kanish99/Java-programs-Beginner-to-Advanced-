//Write a java program to test "delete" StringBuffer function.

//The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
package String_Buffer;
public class delete_demo 
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hello");  
        sb.delete(1,3);  
        System.out.println(sb);//prints Hlo 
    }
}

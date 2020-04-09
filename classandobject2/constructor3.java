//Create a class called math techniques that supports the following constant and methods :
//i)Pi- 3.145159 ii) Area of rectangle that is passed a height and a width;
//iii)Perimeter of rectangle that is passed a height and width.
//iv)Area of circle that is passed a radius.
//v)Perimeter of circle that is passed a radius.
//Create a separate class to test out the math technique class(Make use of constructor overloading).
package classandobject2;
import java.util.*;
class maths_techniques
{
    float pi,ht,wid,r;
    maths_techniques(float h,float w)
    {
        ht=h;
        wid=w;
    }
    maths_techniques(float radius)
    {
        r=radius;
        pi=3.1459f;
    }
    void rect()
    { 
        float rect;
        rect=ht*wid;
        System.out.println("area of rect is::"+rect);
    }
    void per_rect()
    {
        float per;
        per=(2*ht+2*wid);
        System.out.println("perimeter of rect is::"+per);
    }
    void circle()
    {
        
        float area_circle;
        area_circle=(pi*r*r);
        System.out.println("area of circle is::"+area_circle);
    }
    void per_circle()
    {
        float per1;
        per1=(2*pi*r);
        System.out.println("perimeter of circle is::"+per1);
    }
}    
public class constructor3 
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float d,e,f;
        System.out.println("enter d");
        d=s.nextFloat();
        System.out.println("enter e");
        e=s.nextFloat();
        System.out.println("enter f");
        f=s.nextFloat();
       // maths_techniques M=new maths_techniques(d);
        maths_techniques N=new maths_techniques(e,f);
        N.rect();
        N.per_rect();
        maths_techniques M=new maths_techniques(d);
        M.circle();
        M.per_circle();
    }    
}

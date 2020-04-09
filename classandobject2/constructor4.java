//Define the Rectangle class that contains:
//Two double fields x and y that specify center of rectangle,the data field width and height,
//A no-arg constructor that creates default rectangle with (0,0) for (x,y) and 1 for both width 
//and height.
//A parametrized constructor creates a rectangle with the specified x,y,width and height.
//A method getArea() that returns area of rectangle.
//A method getPerimeter() that returns perimeter of rectangle.
//A method contains(double x,double y) that returns true if the specified point (x,y) is inside
//this rectangle.
//Write a test program that creates two rectangle objects.One with default values and other with
//user specified values.Test all the methods of the class for both the objects.
package classandobject2;

import java.util.*;
class rectangle
{
    double x,y;
    double width,height;
    rectangle()
    {
        x=0;
        y=0;
        width=1;
        height=1;
    }
    rectangle(double a,double b,double w,double h)
    {
        x=a;
        y=b;
        width=w;
        height=h;
    }
    double getArea()
    {
        double area;
        area=(width*height);
        System.out.println("area of rect is::");
        return area;
    }
    double getperimeter()
    {
        double perimeter;
        perimeter=(2*width+2*height);
        System.out.println("perimeter is::");
        return perimeter;
        //System.out.println("perimeter is::");
    }
    void method(double x,double y)
    {
        if(x<width && y<height)
        {
            System.out.println("pt is inside");
        }
        else if(x==width && y==height)
        {
            System.out.println("pt lies on circumference");
        }
        else
        {
            System.out.println("pt is outside");
        }
    }
}    
public class constructor4
{
    public static void main(String args[])
    {
        Scanner s=new Scanner (System.in);
        double d,e,n=0,m=0;
        System.out.println("enter d::");
        d=s.nextInt();
        System.out.println("enter e::");
        e=s.nextInt();
        rectangle r1=new rectangle();
        rectangle r2=new rectangle(10, 20, 30, 40);
        System.out.println(""+r1.getArea());
        System.out.println(""+r1.getperimeter());
        
        r1.method(10,20);
    }
}

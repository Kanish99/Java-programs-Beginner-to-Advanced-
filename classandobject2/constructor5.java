//Define a class coordinate to represent 3 dimensional cartesian coordinates (x,y and z).
//Define the following methods:
//-constructor
//-display, to print values of members.
//-add_coordinates,to add three such coordinate objects to produce resultant coordinate object
//-main to show use of above methods.
package classandobject2;

import java.util.*;
class coordinate
{
    int x,y,z;
    public coordinate()
    {
        
    }
    coordinate(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
    }
    void display()
    {
        System.out.println("x is::"+x);
        System.out.println("y is::"+y);
        System.out.println("z is::"+z);
    }
    void addcoordinates(coordinate c1,coordinate c2,coordinate c3)
    {
        x=c1.x+c2.x+c3.x;
        y=c1.y+c2.y+c3.y;
        z=c1.z+c2.z+c3.z;
    }
}
public class constructor5
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        coordinate c1=new coordinate(10,20,30);
        coordinate c2=new coordinate(40,50,60);
        coordinate c3=new coordinate(20,40,10);
        coordinate c4=new coordinate();
        c4.addcoordinates(c1, c2, c3);
        c4.display();
    }
}

abstract class Shape
{
abstract double area();
}
class Triangle extends Shape
{
int x,y;
Triangle(int a,int b)
{
x=a;
y=b;
}
double area()
{
return (x*y)/2;
}
}
class Rectangle extends Shape
{
int x,y;
Rectangle(int a,int b)
{
x=a;
y=b;
}
double area()
{
return (x*y);
}
}
class Abstract
{
public static void main(String args[])
{
Triangle t=new Triangle(4,5);
Rectangle r=new Rectangle(4,5);
System.out.println("Area of TRIANGLE="+t.area());
System.out.println("Area of RECTANGLE="+r.area());
}
}


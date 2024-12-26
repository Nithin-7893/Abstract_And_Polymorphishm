class Addition
{
int a=20;
void sum()
{
System.out.println("50+50=100");
}
}
class Add extends Addition
{
int a=40;
void sum()
{
System.out.println("sum of 500+500=1000");
}
}
class Polymorphism
{
public static void main(String x[])
{
Addition a=new Add();
a.sum();
System.out.println("the value of a="+a.a);
}
}
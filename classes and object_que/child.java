class Parent
{
int a ;
int b;
Parent(int a ,int b)
{
this.a = a;
this.b = b;
int z = a+b;
System.out.println("the super class method");
System.out.println("the sum is "+z);
}

}
class child extends Parent
{

child(int c ,int d)
{
super(c,d);
}
public static void main(String[] args) {
child obj = new child(1,2);
}
}
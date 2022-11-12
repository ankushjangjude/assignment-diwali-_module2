class staticmethod22
{
static int a = 12;
int b = 42;
public static void main(String[] args) {
System.out.println("static variable "+a);
System.out.println("non static variable"+b); // error static methods cannot access non static
//variables
}
}
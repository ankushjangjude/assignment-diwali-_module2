import java.io.*;
class demo18
{
    int number;
   demo18()
   {
       System.out.println("the default constructor");
   }
   demo18(int x)
   {
       this();
       System.out.println(x);
   }
   demo18(int x,int y)
   {
       this(x*y);
       System.out.println(x+y);
   }

    public static void main(String[] args) {
       demo18 obj= new demo18(4,5);

    }
}
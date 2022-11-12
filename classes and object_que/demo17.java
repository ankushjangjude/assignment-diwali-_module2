import java.io.*;
class demo17
{
    int number;
   demo17()
   {
       System.out.println("the default constructor");
   }
   demo17(int x)
   {
       this();
       System.out.println(x);
   }
   demo17(int x,int y)
   {
       this(x*y);
       System.out.println(x+y);
   }

    public static void main(String[] args) {
       demo17 obj= new demo17(4,5);

    }
}
public class demo25
 {
 static
 {
 System.out.println("First static block"); }

 public void  demo25()
 {
 System.out.println("Constructor");
 }

 public static String staticString = "Static Variable";

 static
 {
 System.out.println("Second static block and "+ staticString);
 }
 static
 {
staticMethod();
 System.out.println("Third static block");
 }
 public static void staticMethod()
 {
System.out.println("Static method");
}

 public static void staticMethod2()
 {
 System.out.println("Static method2");
 } public static void main(String[] args)
 { demo25 obj = new demo25();
 obj.staticMethod2();
 }
 }
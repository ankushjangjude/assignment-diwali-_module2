public class Test23
{
 int x = 17;
 public static void main(String...a)
 {
 //System.out.println(x); Error : non-static variable x cannot be referenced from a
//static context
 // non static variable can be called only after making objects
 Test23 ob = new Test23();
 System.out.println(ob.x);
 }
 }
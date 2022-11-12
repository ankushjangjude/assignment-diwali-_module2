class sample20
{
public static void main(String[] args) {
char[] chr ={'s','a','m','p','l','e'};
String s = new String(chr);
String e = new String("hello");
char[] chr1 = {'a','n','s','h'};
String x = new String(chr1,0,2);
System.out.println(x);
System.out.println(e);
System.out.println(s);
}
}
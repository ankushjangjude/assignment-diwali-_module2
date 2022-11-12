import java.util.*;

public class Q23Array {
    public static void main(String args[]) {
      // Instantiating and initializing ArrayList
      ArrayList<String> cities = new ArrayList<>();
      cities.add("ram");
      cities.add("lakhan");
      cities.add("sita");
      cities.add("lakshman");

      // ArrayList to String array conversion using toArray()
      String citinames[]=cities.toArray(new String[cities.size()]);

      // Printing elements using for-each loop
      for(String str : citinames) {
        System.out.println(str);      
      }
    }
}
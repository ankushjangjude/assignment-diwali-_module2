import java.util.*;

public class LongestPre
{
	public String longestCommonPrefix(String[] a)
	{
		int size = a.length;
		if (size == 0)
			return "";

		if (size == 1)
			return a[0];

		Arrays.sort(a);
		int end = Math.min(a[0].length(), a[size-1].length());

		
		int i = 0;
		while (i < end && a[0].charAt(i) == a[size-1].charAt(i) )
			i++;

		String pre = a[0].substring(0, i);
		return pre;
	}

	public static void main(String[] args)
	{
		LongestPre obj = new LongestPre();
		String[] input = {"Hello", "Helloeveryone", "HelloGroup3", "HelloSaksham"};
		System.out.println( "The longest Common Prefix is : " +
								obj.longestCommonPrefix(input));
	}
}
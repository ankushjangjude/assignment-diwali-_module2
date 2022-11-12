class Pattern24
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{	
			for(int j=1, p=i, a=4; j<=i; j++, p=p+a, a--)
			{
				System.out.print(p+" ");
	        }
			System.out.println();
			
		}
	}
}

class Pattern10
{
	public static void main(String[] args)
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}
}

/*  1
    3  2
	6 5 4
	10 9 8 7
	*/

class p4_test
{
	public static void main(String[] args) 
	{
		int n=4;
		int k=1;
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<=i;j++)
			{
		   System.out.print("");
		   k++;
		}
		int l=k-1;
		for(int j=0;j<=i;j++)
			{
		   System.out.print(l--);
		}
		System.out.println();
		}
	}
}

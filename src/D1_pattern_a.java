/* A B C D 
   A B C
   A B 
   A
  */
class  D1_pattern_a
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i+j<=n-1)
				{
			System.out.print(ch++);
			    }
			}
			ch='A';
		System.out.println();
		}
	}
}

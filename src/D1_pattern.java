/*A 
  A B
  A B C
  A B C D
  */
class  D1_pattern
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i>=j)
				{
			System.out.print(ch++);
			    }
			}
			ch='A';
		System.out.println();
		}
	}
}

class pattern17 
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)

			{
			if(i==j)
				{
                      System.out.print(1);
			     }
				 else if(i>j)
				{
				 
				 System.out.print("*");
				 }
			
			     else
				{
				 System.out.print(ch++);
				 }
			}
		ch='a';	
		System.out.println();
		}
	}
}

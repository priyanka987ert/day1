class pattern16_doubt			 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i==j)
				{
				System.out.print(1);
			
			     }
				 else if(i==0||i==n-1||j==0||j==n-1)
				{
				 System.out.print(0);
				}
				else
				{
				
				System.out.print(" ");
				}
			
			}
		
		
		System.out.println();
		}
	}
}

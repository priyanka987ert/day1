class pattern18 
{
	public static void main(String[] args) 
	{
        int n=9;
		int k=1;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			ch='a';
		   for(int j=0;j<n;j++)
			{
		   if(i+j==n-1)
				{
			   System.out.print("/");
				}
			   else if(i+j<n-1)
					{
			   System.out.print(k++%9);
			        }
					else
					{
						System.out.print(ch++);
					}
		   
		        }
				
             System.out.println();
		   
		   }
		
		}
	}



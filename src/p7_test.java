/*    * * * *
      *     *
	  *   * *
	  * * * *
	          *

			  */


class p7_test
{
	public static void main(String[] args) 
	{
	  int n=4;
	  for(int i=0;i<n;i++)
		{
	  for(int j=0;j<n;j++)
			{
	  //if(i==0||i==n-1||j==0||j==n-1||i==n/2&&j==n/2)
	  if(i==0&&j<=3||j==0&&i<=3||i==3&&j<=3)
				{
	        System.out.print("*");
	           }

			   else
				{
			   System.out.print(" ");
			   }
		  }
		  System.out.println();
	  }
	  for()
	}
}

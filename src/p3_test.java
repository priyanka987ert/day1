/*  * * * * *
      * * *
	    *
      * * *
	* * * * *
	*/


class p3_test 
{
	public static void main(String[] args) 
	{
		int n=5;
		int sp=0;
		int ch=5;
		for(int i=0;i<n;i++)
		{
		for (int j=0;j<sp;j++ )
		{ 
			System.out.print(" ");
		}
		for (int j=0;j<ch;j++ )
		{ 
			System.out.print("*");
		}
		
		System.out.println();
		if(i<n/2)
		{
		sp++;
		ch=ch-2;
		}
		else
		{
		sp--;
		ch=ch+2;
		}
	}}
}

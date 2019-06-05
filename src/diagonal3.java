class diagonal3
{
public static void main(String args[])
{
int n=10; 
int k=1;
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
System.out.println(0);
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
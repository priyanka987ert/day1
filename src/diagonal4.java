class diagonal4
{
public static void main(String args[])
{
int n=4; 
char ch='a';
for(int i=0;i<n;i++)
{

ch='a';
for(int j=0;j<n;j++)
{
if(i==j)
{
System.out.print(1);
}
else if(i>j)
{
System.out.println("*");
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
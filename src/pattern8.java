class pattern8
{

public static void main(String[] args)
{
int k=1;
for(int i=0;i<4;i++)
{

for(int j=0;j<4;j++)
{

if(k==10)
{
k=1;
}
System.out.print(k++);
}

System.out.println();
}
}
}
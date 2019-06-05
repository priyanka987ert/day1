class pattern9
{
public static void main(String[] args)
{
int lines=4;
int k=0;
for(int i=0;i<lines;i++)
{

for(int j=0;j<lines;j++)
{
System.out.print(k++%9+1);
}

System.out.println();


}
}
}
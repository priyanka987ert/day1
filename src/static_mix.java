class static_mix
{
static int i;
static
{
System.out.println("from sib1");
i=10;

}
static
{
System.out.println("from sib2");
i=20;

}
public static void main(String args[])
{
System.out.println("from main()");
System.out.println(i);


}

}
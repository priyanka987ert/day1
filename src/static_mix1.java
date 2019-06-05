class static_mix1
{

static void test()
{
System.out.println("from test");
System.out.println(i);
}

static 
{
System.out.println("i am static block");
//System.out.println(i);
}
static int i;
public static void main(String args[])
{
System.out.println("from main()"+i);
i=10;
test();

}

}
class static_method_mix
{
static int i;
static void test()
{
System.out.println("from test");
i=10;
System.out.println("===============================");

}

public static void main(String args[])
{
System.out.println("from main()");
test();
System.out.println(i);
System.out.println("===============================");
}
static
{
 i=10;
System.out.println("from sib local is:"  +i);
System.out.println("from sib global is:"  +static_method_mix.i);
test();
System.out.println("===============================");

}

static
{
 int i=50;
System.out.println("from sib local is:"  +i);
System.out.println("from sib global is:"  +static_method_mix.i);
test();
System.out.println("===============================");

}
}
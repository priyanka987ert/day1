class exec_pro_2
{

static int i;
public static void test()
{
System.out.println("from test   :"+i);
System.out.println("from test   :"+exec_pro_2.i);
}
public static void main(String[] args)
{
System.out.println("hi");
}
}
class x
{
public static void main(String[] args)
{
//System.out.println("from main   :"+i);
//test();
System.out.println("from main   :"+exec_pro_1.i);
exec_pro_1.test();



}
}


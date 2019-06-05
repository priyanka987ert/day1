class specifier_overriding
{
private void test()
{
System.out.println("from super specifier_overriding test()");
}
}

class p2 extends specifier_overriding
{
 void test()
{
System.out.println("from sub p2 test()");
}
public static void main(String args[])
{
System.out.println("i am main");

}
}
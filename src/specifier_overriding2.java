class specifier_overriding2
{
 protected void test()
{
System.out.println("from super specifier_overriding test()");
}
}

class p2 extends specifier_overriding2
{
 public void test()
{
System.out.println("from sub p2 test()");
}

}
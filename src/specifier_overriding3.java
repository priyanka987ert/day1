class specifier_overriding3
{
 protected void test()
{
System.out.println("from super specifier_overriding test()");
}
}

class p2 extends specifier_overriding3
{
  void test()
{
System.out.println("from sub p2 test()");
}

}
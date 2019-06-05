class specifier_overriding1
{
 void test()
{
System.out.println("from super specifier_overriding test()");
}
}

class p2 extends specifier_overriding1
{
 void test()
{
System.out.println("from sub p2 test()");
}

}
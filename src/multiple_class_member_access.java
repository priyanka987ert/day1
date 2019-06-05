class multiple_class_member_access1
{
static int i;
static void test()
{
System.out.println("from test:"+i);
System.out.println("from test:"+multiple_class_member_access1.i);
}
}


class multiple_class_member_access1
{
public static void main(String args[])
{
System.out.println("i am class multiple_class_main_access1 test method");
System.out.println(multiple_class_member_access1.i);


}
}


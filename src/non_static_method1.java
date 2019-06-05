class non_static_method1
{

int a;
void test()
{
System.out.println("i am non static method");

System.out.println(a);
System.out.println(this.a);

}

public static void main(String[] args)
{

non_static_method1 obj=new non_static_method1();
obj.test();
System.out.println(obj);
}

}
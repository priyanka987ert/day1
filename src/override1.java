class override1
{
void test()
{

System.out.println("test() from class A");
}
}
class B extends override1
{
void test()
{

System.out.println("test() from class B");
}
}
class p1
{
public static void main(String[] args)

{
override1 obj=new override1();
obj.test();

B obj1=new B();
obj1.test();

override1 obj2=new B();
obj2.test();

}
}
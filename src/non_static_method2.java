class non_static_method2
{

int a;
void test()
{
int a=100;
System.out.println("i am non static method");

System.out.println(a);
System.out.println(this.a);


}

public static void main(String[] args)
{

non_static_method2 obj=new non_static_method2();
System.out.println(obj.test());
System.out.println(obj);
}

}
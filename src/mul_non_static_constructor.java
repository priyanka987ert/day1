class mul_non_static_constructor
{
int i;
mul_non_static_constructor()
{
System.out.println("from p6() constructor which is executed third========");
System.out.println(i);
i=10;
}

{
System.out.println("Iam static block which is executed first======");
System.out.println(i);
i=20;
}

{
System.out.println("Iam static block which is executed second======");
System.out.println(i);
i=23;

}

public static void main(String args[])
{
mul_non_static_constructor m1=new mul_non_static_constructor();
System.out.println(m1.i);
System.out.println("========================");

}

}
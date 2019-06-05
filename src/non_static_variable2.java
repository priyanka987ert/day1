class non_static_variable2
{

int i;
boolean b=true;
public static void main(String[] args)
{

non_static_variable2 var=new non_static_variable2();
System.out.println("ob1 i:"+var.i);
System.out.println("ob1 b:"+var.b);

System.out.println("==============================");


non_static_variable2 var2=new non_static_variable2();
System.out.println("ob2 i:"+var.i);
System.out.println("ob2 b:"+var.b);

System.out.println("==============================");
}

}
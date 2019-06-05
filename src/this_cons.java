class this_cons
{
this_cons()
{
System.out.println("this_cons()");
}

this_cons(int i)
{
this(10.0f);
System.out.println("this_cons(int)");
}


this_cons(float j)
{
this(20,30.5f);

System.out.println("this_cons(int)");
}
this();
this_cons(int i,float j)
{

System.out.println("this_cons(int)");
}

public static void main(String[] args)
{
this_cons n1=new this_cons(10);

}
}
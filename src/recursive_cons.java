class recursive_cons
{
int i;

recursive_cons(int i)
{
this();
this.i=i;
}

recursive_cons()
{
this(10);
System.out.println("hi");
}

public static void main(String args[])
{

recursive_cons n1=new recursive_cons();
System.out.println("main");
}

}
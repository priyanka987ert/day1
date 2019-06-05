class non_static_constructor
{

non_static_constructor()
{
System.out.println("i am constructor  which is executed second========");
}

{
System.out.println("i am non static block which is executed first");
}
public static void main(String[] args)
{

non_static_constructor ci=new non_static_constructor();
}
}
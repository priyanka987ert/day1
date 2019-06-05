class static_block5
{
static int i;

static{
int i=20;
System.out.println("hi sib 1");
System.out.println(i);
i=10;
static_block5.i=20;
System.out.println(i);
System.out.println(static_block5.i);
}
public static void main(String[] args)

{

System.out.println(i);
System.out.println(static_block5.i);
}
}
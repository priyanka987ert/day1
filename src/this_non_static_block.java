class this_non_static_block
{
int i;
{
System.out.println(i);
System.out.println(this);
System.out.println(this.i);
i=10;
System.out.println(i);
System.out.println("I AM STATIC BLOCK");
System.out.println("=====================");
}

{
System.out.println("I AM ALSO STATIC BLOCK");
}
public static void main(String[] args)
{
this_non_static_block n1=new this_non_static_block();


}

}
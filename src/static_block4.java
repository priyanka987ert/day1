class static_block4
{

static int i;
static{
System.out.println("hi static block1");
System.out.println(i);
i=10;
System.out.println(i);



}

public static void main(String args[])
{
System.out.println("hi main block");
System.out.println(i);

}


static 
{
   
System.out.println("hi static block2");


}


}
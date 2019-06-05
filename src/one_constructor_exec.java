class one_constructor_exec
{
int i;
one_constructor_exec(int i)
{
this.i=i;
System.out.println("i am parametirized constructor");
}

one_constructor_exec()
{

System.out.println("i am no_arg constructor");
}
public static void main(String[] args)
{
one_constructor_exec m1=new one_constructor_exec(10);
System.out.println("param cons executed");
System.out.println(m1.i);


}

}
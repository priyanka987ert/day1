class specifier_overriding5
{
 public static int rita()
{
System.out.println("i am static member of rita of super class");
return 0;
}

 public int sita()
{
System.out.println("i am non_static member of sita of super class");
return 0;
}
}

class p2 extends specifier_overriding5
{
 
 public static int rita()
{
System.out.println("i am static member of rita of sub class");
return 0;
}

 public int sita()
{
System.out.println("i am non_static member of sita of sub class");
return 0;
}
}
class p
{

public static void main(String args[])
{
specifier_overriding5 obj=new specifier_overriding5();
obj.rita();
obj.sita();
System.out.println("===================");


p2 obj1=new p2();
obj1.rita();
obj1.sita();
System.out.println("===================");


specifier_overriding5 obj2=new p2();
obj2.rita();
obj2.sita();
System.out.println("===================");

}

}
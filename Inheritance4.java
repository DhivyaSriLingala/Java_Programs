class A
{
    int a;
    A()
    {
        a=10;
        System.out.println("In Class A Constructor");
    }
    A(int val)
    {
        a=val;
    }
}
class B extends A
{
    int b;
    B()
    {
        b=20;
        System.out.println("In Class B Constructor");
    }
    B(int val)
    {
        super(val*2);
        b=val;
        System.out.println("a is "+a +" " +"b is " +b);
    }
}
class C
{
    public static void main(String args[])
    {
        B b2=new B(50);
        System.out.println(b2.a+" "+b2.b);
    }
}

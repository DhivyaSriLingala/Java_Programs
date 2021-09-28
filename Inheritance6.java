class A
{
    int a;
    A(int val,int val2)
    {
        a=val+val2;
    }
    A(int val)
    {
        this(val,val*2);
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
        super(50);
        b=20;
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

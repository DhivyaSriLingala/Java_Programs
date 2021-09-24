class  A
{
    int m,n;
    void display1()
    {
        System.out.println("m and n:"+m+""+n);
    }
}
class B extends A
{
    int c;
    void display2()
    {
        System.out.println("c:"+c);
    }
    void sum()
    {
        System.out.println("m+n+c="+(m+n+c));
    }
}
class InheritanceDemo
{
    public static void main(String args[])
    {
        B s2=new B();
        s2.m=7;
        s2.n=8;
        s2.c=9;
        s2.display1();
        s2.display2();
        System.out.println("Sum of m,n and c in object is:");
        s2.sum();
    }
}

class Sample
{
    Sample()
    {
        System.out.println("Default Constructor");
    }
    Sample(String Str)
    {
        this();
        System.out.println("One Argument constructor"+Str);
    }
    Sample(String str,int no)
    {
        this();
        System.out.println("Two Argument constructor"+Str+no);
    }
}
class Main
{
    public static void main(String args[])
    {
        Sample a1=new Sample();
        Sample a2=new Sample("java");
    }
}

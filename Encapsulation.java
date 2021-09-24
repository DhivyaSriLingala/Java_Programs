class First 
{
    private int a=10;
    public int b=20;
    int sum()
    {
        return a+b;
    }
    int geta()
    {
        return a;
    }
}
class Main
{
    public static void main(String args[])
    {
        First fob=new First();
        System.out.println(fob.geta());
        System.out.println(fob.sum());
    }
}

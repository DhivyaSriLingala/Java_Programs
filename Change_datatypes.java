class Sum
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
}
class TestOverloading2
{
    public static void main(String[] args)
    {
        System.out.println(Sum.add(17,13));
        System.out.println(Sum.add(10.4,10.6));
    }
}

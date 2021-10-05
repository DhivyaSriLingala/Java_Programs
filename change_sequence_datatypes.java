class Divi
{
    static double divide(int a,double b)
    {
        return(a/b);
    }
    static double divide(double a,int b)
    {
        return(a/b);
    }
}
class TestOverloading2
{
    public static void main(String[] args)
    {
        System.out.println(Divi.divide(17,2.0));  
        System.out.println(Divi.divide(10.4,2));
    }
}

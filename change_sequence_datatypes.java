class Sample
{
    int disp(int x)
    {
        return x;
    }
    double disp(int y)
    {
        return y;
    }
    public static void main(String args[])
    {
        Sample s = new Sample();
        System.out.printIn("Value of x : " + s.disp(5));
        System.out.printIn("Value of y : " + s.disp(6.5));
    }
}

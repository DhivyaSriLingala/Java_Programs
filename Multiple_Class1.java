class MainClass
{
    public static void main(String args[])
    {
        subClass sc=new subClass();
        sc.disp();
    }
}
class subClass
{
    String msg="Hello Welcome to the classes";
    void disp()
    {
        System.out.println(msg);
    }
}

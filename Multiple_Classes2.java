public class MainClass
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
        subClass1 sc1=new subClass1();
        sc1.disp();
    }
}
class subClass1
{
    String msg="of java";
    void disp()
    {
        System.out.println(msg);
    }
}
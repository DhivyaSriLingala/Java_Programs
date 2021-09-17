class MainClass
{
    public static void main(String args[])
    {
        subClass sc1=new subClass();
        subClass sc2=new subClass();
        subClass sc3=new subClass();
        sc1.disp("Sai Kiran");
        sc2.disp("Nandan");
        sc3.disp("Vamsi");
        System.out.println(sc1.myname+","+sc2.myname+","+sc3.myname);
    }
}
class subClass
{
    String msg="Hello";
    String myname;
    void disp(String name)
    {
        myname=name;
        System.out.println(msg+name);
    }
}

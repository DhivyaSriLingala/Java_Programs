class Constructor
{
    Constructor()
    {
        System.out.println("This Is Default Constructor");
    }
    Constructor(int a)
    {
        System.out.println("This is Constructr with One Argument"+a);
    }
}
class Main
{
    public static void main(String args[])
    {
        Constructor c1=new Constructor();
        Constructor c2=new Constructor(100);
    }
}


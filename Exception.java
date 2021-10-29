import java.io.*;
class Ex1
{
    public static void main(String args[])
    {
        try
        {
            throw new FileNotFoundException();
        }
        catch(Exception e)
        {
            System.out.println("Handle in Main");
        }
        System.out.println("in Main");
    }
}

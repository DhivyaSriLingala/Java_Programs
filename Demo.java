public class Demo
{
    public static void main(String args[]) {
        try{
            int x=0;
            int y=50/x;
            System.out.println("y  ="+y);
        }
        catch(ArithmeticException e){
            System.out.println("Division by Zero");
        }
        System.out.println("After catch statement");
    }
}

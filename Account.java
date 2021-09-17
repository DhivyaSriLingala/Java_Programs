public class Account
{
    double balance;
    void addBalance(double value)
    {
        balance=balance+value;
    }
    double getBalance()
    {
        return balance;
    }
    public static void main(String args[])
    {
        Account acc=new Account();
        acc.addBalance(1000);
        acc.addBalance(acc.getBalance()*2);
        System.out.println(acc.getBalance());
    }
}
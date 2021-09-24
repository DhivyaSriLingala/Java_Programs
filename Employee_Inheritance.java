class  Employee
{
    int Salary;
    Employee()
    {
        Salary=1000;
    }
}
class Programmer extends Employee
{
    int bonus=0;
    Programmer(int sal,int bon)
    {
        Salary=sal;
        bonus=bon;
    }
}
class Main
{
    public static void main(String args[])
    {
        Programmer pg=new Programmer(2000,200);
        System.out.println(pg.Salary);
        System.out.println(pg.bonus);
    }
}

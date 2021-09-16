class PrimeorNot
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
int count=0;
for(int i=2;i<=Math.sqrt(num);i++)
{
if(num%i==0)
count++;
}
if(count==0)
System.out.println("is prime number");
else
System.out.println("is not prime number");
}
}
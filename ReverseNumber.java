class ReverseNumber
{
public static void main(String args[])
{
int number=Integer.parseInt(args[0]);
int digit,reverse=0;
while(number!=0)
{
digit=number%10;
reverse=reverse*10+digit;
number/=10;
}
System.out.println(reverse);
}
}
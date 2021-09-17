import java.util.Scanner;
class occurence
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int len=str.length();
int count=0;
for(int i=0;i<len;i++)
{
if(str.charAt(i)=='\s')
count++;
}
System.out.println(count+1);
}

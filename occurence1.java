import java.util.Scanner;
class occurence1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
str=str.trim();
int len=str.length();
int count=0;
for(int i=0;i<len;i++)
{
if(str.charAt(i)=='\s' && str.charAt(i-1)!='\s')
count++;
}
System.out.println(count+1);
}

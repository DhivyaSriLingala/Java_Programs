import java.io.BufferedReader;
import java.io.InputStreamReader;
class Temp3
{
public static void main(String args[])
{
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
int num=Integer.parseInt(args[0]);
int count=0;
for(int i=2;i<=Math.sqrt(num);i++)
{
if(num%i==0)
count++;
}
if(count==0)

}
}
















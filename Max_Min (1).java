public class Max_Min
{
public static void main(String args[])
{
int arr[]=new int[10];
int len=args.length;
for(int i=0;i<len;i++)
arr[i]=Integer.parseInt(args[i]);
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;
for(int i=0;i<len;i++)
{
if(arr[i]>max)
max=arr[i];
if(arr[i]<min)
min=arr[i];
}
System.out.println("Maximum of the given Array:"+max);
System.out.println("Maximum of the given Array:"+min);
}
}
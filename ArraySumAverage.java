class ArraySumAverage
{
public static void main(String args[])
{
int arr[]=new int[10];
int len=args.length;
for(int i=0;i<len;i++)
arr[i]=Integer.parseInt(args[i]);
int sum=0;
int avg=0;
for(int i=0;i<len;i++)
sum=sum+arr[i];
avg=(sum/(float)len);
System.out.println("Sum of the given Array:"+sum);
System.out.println("Average of the given Array:"+avg);
}
}
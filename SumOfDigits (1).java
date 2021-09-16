class SumOfDigits
{  
public static void main(String args[])  
{  
int number=Integer.parseInt(args[0]);
int digit, sum = 0;  
while(number > 0)  
{      
digit = number % 10;  
sum = sum + digit;    
number = number / 10;  
}
System.out.println(sum);  
}  
}  
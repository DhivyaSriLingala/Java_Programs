class Palindrome
{  
public static void main(String args[])
{  
int reverse,sum=0,temp;    
int number=Integer.parseInt(args[0]);
temp=number;    
while(number>0)
{    
reverse=number%10;
sum=(sum*10)+reverse;    
number=number/10;    
}    
if(temp==sum)    
System.out.println("Is a palindrome");    
else    
System.out.println("Not a palindrome");    
}  
}  
class PrimeNumbers
{
   public static void main (String args[])
   {		
       String  primeNumbers = "";
       for (int i = 1; i <= 100; i++)         
       { 		  	  
          int count=0; 	  
          for(int num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		count = count + 1;
	     }
	  }
	  if (count ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println(primeNumbers);
   }
}
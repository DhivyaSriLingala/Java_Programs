class charAscii
{
	public static void main(String args[])
	{
	    char c1='0';
	    if(c1>'a' && c1<'Z')
		{
		    System.out.println("Alphabet");
		}
	    else if(c1>0)
		{
		    System.out.println("Digit");
		}
	    else
		{
		    System.out.println("Special Character");
		}
	}
}
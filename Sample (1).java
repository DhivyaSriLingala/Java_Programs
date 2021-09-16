class Sample
{
	public static void main(String args[])
	{
	    char c1='A';
	    char c2='s';
	    if(c1<'a')
	    {
		int i1=c1+32;
		c1=(char)i1;
	    }
	    if(c2<'a')
	    {
		int i1=c1+32;
		c1=(char)i1;
	    }
	    if(c1<c2)
		System.out.println(c1+","+c2);
	    else
		System.out.println(c2+","+c1);
	}
}
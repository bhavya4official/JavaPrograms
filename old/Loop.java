
class Loop
{
	static public void main (String... as)
	{
	long start =System.currentTimeMillis();
	for(int a=1;a<=10;a++)
	{
	System.out.println("Hello");
	}
	long end =System.currentTimeMillis();
	System.out.println("processing Time Is : "+(end-start));	
	}
} 
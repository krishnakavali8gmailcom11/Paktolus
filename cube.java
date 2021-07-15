/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{

  class Solution
  {
    public int countTriples (int n)
    {
      int count = 0;
        label:for (int i = 1; i <= n; i++)
	{
	  int acube = i * i * i;
	  for (int j = 1; j <= n; j++)
	    {
	      int bcube = j * j * j;
	      if (acube + bcube > n * n)
		continue label;
	      int ccube = (int) (Math.cbrt (acube + bcube));
	      if (ccube * ccube != acube + bcube)
		  continue;
	        count++;
	    }
	}
      return count;
    }
  }
  public static void main (String[]args)
  {
    System.out.println ("Hello World");
  }
}

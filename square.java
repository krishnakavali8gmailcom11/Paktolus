/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
    
    
    
    
    class Solution{
    public int countTriples(int n){
        int count = 0;
        label: for(int i=1;i<=n;i++){
            int asq = i*i;
        for(int j=1;j<=n;j++){
            int bsq = j*j;
            if(asq+bsq>n*n) continue label;
            int croot = (int)(Math.sqrt(asq+bsq));
            if(croot*croot!=asq+bsq) continue;
            count++;
        }
        }
        return count;
    }
}
	public static void main(String[] args) {
	
		int n=20;
	}
}

package debugging;

public class Debugger3 {

	public static void main(String[] args) {
	int a=6;
	int b=9;
	int c=76; 
	int sum=add(a,b);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(sum);

	}
	public static int add(int e, int f)
	{
		int sum1=e+f;
		return sum1;	
	}

}

import java.util.Scanner;

class LastDigit {
	static int fib[] = new int[60];
	static void fib()
	{
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<=59;i++)
			fib[i] = (fib[i-1] + fib[i-2])%10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("hi");
		int n = sc.nextInt();
		fib();
		System.out.println(fib[n%60]);
	}
}

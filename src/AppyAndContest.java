import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AppyAndContest {
	static long gcd(long a , long b)
	{
		if(a == 0)
			return b;
		return gcd(b%a, a);
	}
	static long lcm(long a , long b) 
    { 
        return (a*b)/gcd(a, b); 
    } 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			long n = Long.parseLong(arr[0]);
			long a = Long.parseLong(arr[1]);
			long b = Long.parseLong(arr[2]);
			long k = Long.parseLong(arr[3]);
			//System.out.println(gcd(a, b));
			long lcm = lcm(a, b);
//			System.out.println(lcm);
			long both = n / lcm;
			long first = n/a - both;
			long second = n/b - both;
//			System.out.println(first+" "+second+" "+both);
			if(first+second >= k)
				System.out.println("Win");
			else
				System.out.println("Lose");
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DailyTrain {
	public static long combinations(long n, long r) {
		long numerator = 1, denominator = 1;
		if (r > n - r) {
			r = n - r;
		}
		for (long i = 1L; i <= r; ++i) {
			denominator *= i;
		}
		for (long i = n - r + 1L; i <= n; ++i) {
			numerator *= i;
		}
		return numerator / denominator;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		int x = Integer.parseInt(arr[0]);
		int n = Integer.parseInt(arr[1]);
		long count = 0;
		while(n-->0)
		{
			String string = br.readLine();
			int k = 53;
			for(int i=1;i<=36;i=i+4)
			{
				int c = 0;
				for(int j=i;j<i+4;j++)
				{
					if(string.charAt(j-1) == '0')
						c++;
				}
				for(int j=1;j<=2;j++)
				{
					//System.out.println(k);
					if(string.charAt(k) == '0')
						c++;
					k--;
				}
//				System.out.println("C:"+c);
				if(c >= x)
				{
					count+= combinations(c , x);
//					System.out.println(i+" "+c);
				}
			}
			//System.out.println(count);
		}
		System.out.println(count);
	}
}

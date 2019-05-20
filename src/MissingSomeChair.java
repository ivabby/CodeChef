import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

class MissingSomeChair {
	static long mod = (long) (Math.pow(10, 9) + 7);
	static long power(long x , long y)
	{
		if(y == 0)
			return 1;
		long temp = power(x, y/2);
		if(y%2 == 0)
			return (temp*temp)%mod;
		else
			return (temp*temp*x)%mod;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			long value = power(2 , n) - 1;
			out.write(value+"\n");
			out.flush();
		}
	}
}
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

class Equality {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String arr[] = br.readLine().split(" ");
			BigInteger count = BigInteger.valueOf(0);
			BigInteger a[] = new BigInteger[n];
			for(int i=0;i<n;i++)
			{
				a[i] = BigInteger.valueOf(Long.parseLong(arr[i]));
				count = count.add(a[i]);
 			}
			count = count.divide(BigInteger.valueOf(n-1));
			for(int i=0;i<n;i++)
			{
				out.write(count.subtract(a[i])+" ");
			}
			out.flush();
			System.out.println();
		}
	}
}

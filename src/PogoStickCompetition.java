import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class PogoStickCompetition {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = scanner.nextInt();
		while(t-->0)
		{
//			String arr[] = br.readLine().split(" ");
			int n = scanner.nextInt();
			int k = scanner.nextInt();
//			arr = br.readLine().split(" ");
			long a[] = new long[n];
			long max = Long.MIN_VALUE;
			for(int i=0;i<n;i++)
			{
				a[i] = scanner.nextLong();
				//System.out.print(a[i]+" ");
			}
//			System.out.println();
//			for(int i=n-1;i>=n-k;i--)
//			{
//				a[i] = scanner.nextLong();
//				max = Math.max(max, a[i]);
//			}
			for(int i=n-k-1;i>=0;i--)
			{
				a[i] = a[i] + a[i+k];
				//System.out.println(a[i]);
//				max = Math.max(max, a[i]);
			}
			Arrays.sort(a);
			System.out.println(a[n-1]);
		}
	}
}

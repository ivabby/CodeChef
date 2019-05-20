import java.io.*;
import java.util.Arrays;

class Bhallaladeva {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String arr[] = br.readLine().split(" ");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = Integer.parseInt(arr[i]);
		Arrays.sort(a);
		int q = Integer.parseInt(br.readLine());
		while(q-->0)
		{
			int k = Integer.parseInt(br.readLine());
			long c = 0;
			int last = n;
			for(int i=0;i<last;i++)
			{
				c = c + a[i];
				last = last - k;
			}
			out.write(c+"\n");
			out.flush();
		}
	}
}

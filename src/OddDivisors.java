import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

class OddDivisors {
	public static void main(String[] args) throws InterruptedException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int a[] = new int[100001];
		a[0] = 0;
		for(int i=1;i<a.length;i++)
		{
			for(int j=1;j<=i;j+=2)
				if(i%j == 0 && j%2!=0)
					a[i]+=j;
			//System.out.println(a[i]);
			//a[i] = a[i] + a[i-1];
			//System.out.println(i);
			System.out.println(a[i]);
//			System.out.println();
			Thread.sleep(1000);
		}
		//System.out.println("hi");
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int l = Integer.parseInt(arr[0]);
			int r = Integer.parseInt(arr[1]);
			long c = a[r] - a[l-1];
//			for(int i=l;i<=r;i++)
//				c = c + a[i];
			out.write(c+"\n");
			out.flush();
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class MaximizeDisjointPair {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int d = Integer.parseInt(arr[1]);
			arr = br.readLine().split(" ");
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = Integer.parseInt(arr[i]);
			Arrays.sort(a);
			long count = 0;
			for(int i=n-1;i>=1;i--)
			{
				if(a[i] - a[i-1] < d)
				{
					count+=a[i] + a[i-1];
					i--;
				}
			}
			System.out.println(count);
		}
	}
}

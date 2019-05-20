import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DeputyChef {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			int b[] = new int[n];
			String arr[] = br.readLine().split(" ");
			for(int i=0;i<n;i++)
				a[i] = Integer.parseInt(arr[i]);
			arr = br.readLine().split(" ");
			for(int i=0;i<n;i++)
				b[i] = Integer.parseInt(arr[i]);
			int max = -1;
			for(int i=0;i<n;i++)
			{
				if(i == 0)
				{
					if(a[i+1]>=b[i] || a[n-1]>=b[i] || a[i+1]+a[n-1]>=b[i])
						continue;
					else
						max = Math.max(max , b[i]);
				}
				else if(i == n-1)
				{
					if(a[0]>=b[i] || a[i-1]>=b[i] || a[0]+a[i-1]>=b[i])
						continue;
					else
						max = Math.max(max, b[i]);
				}
				else {
					if(a[i-1]>=b[i] || a[i+1]>=b[i] || a[i+1]+a[i-1]>=b[i])
						continue;
					else
						max = Math.max(max, b[i]);
				}
			}
			System.out.println(max);
		}
	}
}

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

class PoloThePengiunAndTheTest {
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int w = Integer.parseInt(arr[1]);
			int l[] = new int[n];
			int tt[] = new int[n];
			for(int i=0;i<n;i++)
			{
				arr = br.readLine().split(" ");
				l[i] = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
				tt[i] = Integer.parseInt(arr[2]);
			}
			long max = 0;
			int dp[][] = new int[n+1][w+1];
			for(int i=1;i<=n;i++)
			{
				for(int j=0;j<=w;j++)
				{
					if(j < tt[i-1])
						dp[i][j] = dp[i-1][j];
					else {
						dp[i][j] = Math.max(dp[i-1][j-tt[i-1]] + l[i-1], dp[i-1][j]);
					}
				}
			}
			System.out.println(dp[n][w]);
		}
	}
}

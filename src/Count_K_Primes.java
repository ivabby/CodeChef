import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Count_K_Primes {
	static int n = 100005;
	static int mark[];
	static boolean[] b;
	static void seive()
	{
		mark = new int[n];
		b = new boolean[n];
		Arrays.fill(b, true);
		for(int i=2;i<n;i++)
		{
			if(b[i])
			{
				mark[i]=1;
				for(int j=i*2;j<n;j=j+i)
				{
					mark[j]++;
					b[j] = false;
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		seive();
		int dp[][] = new int[100005][6];
		for(int k=1;k<=5;k++){
	        for(int i=1;i<=100000;i++){
                if(mark[i]==k)
                    dp[i][k]=dp[i-1][k]+1;
                else
                dp[i][k]=dp[i-1][k];
            }
        }
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int k = Integer.parseInt(arr[2]);
			int count = 0;
			System.out.println(dp[b][k] - dp[a-1][k]);
		}
	}
}

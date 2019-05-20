import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class PizzaDelievery {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String arr[] = br.readLine().split(" ");
			int h[] = new int[n];
			int k[] = new int[n];
			int max = 0;
			for(int i=0;i<n;i++)
			{
				h[i] = Integer.parseInt(arr[i]);
				max = Math.max(max, h[i]*2);
			}
			arr = br.readLine().split(" ");
			for(int i=0;i<n;i++)
			{
				k[i] = Integer.parseInt(arr[i]);
			}
			int dp[] = new int[max + 1];
            Arrays.fill(dp, Integer.MAX_VALUE - 1);
            dp[0] = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= max; j++) {
                    if (j >= k[i]) {
                        dp[j] = Math.min(dp[j], 1 + dp[j - k[i]]);
                    }
                }
            }
            int ans = 0;
            for (int i = 0; i < h.length; i++) {
                ans += dp[2 * h[i]];
            }
			System.out.println(ans);
		}
	}
}

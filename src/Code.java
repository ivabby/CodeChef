import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Code {
	static void xor(int n , int k , int a[] , int ans)
	{
		for(int i=1;i<=k;i++)
		{
			for(int j=0;j<n;j++)
				ans = ans ^ a[j];
		}
		System.out.println(ans);
	}
	static void or(int n , int k , int a[] , int ans)
	{
		for(int i=1;i<=k;i++)
		{
			for(int j=0;j<n;j++)
				ans = ans | a[j];
		}
		System.out.println(ans);
	}
	static void and(int n , int k , int a[] , int ans)
	{
		for(int i=1;i<=k;i++)
		{
			for(int j=0;j<n;j++)
				ans = ans & a[j];
		}
		System.out.println(ans);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String a[] = br.readLine().split(" ");
			int n = Integer.parseInt(a[0]);
			int k = Integer.parseInt(a[1]);
			int ans = Integer.parseInt(a[2]);
			int arr[] = new int[n];
			a = br.readLine().split(" ");
			for(int i=0;i<n;i++)
				arr[i] = Integer.parseInt(a[i]);
			String operator = br.readLine();
			if(operator.equals("XOR"))
			{
				k = k % 2;
				xor(n, k, arr, ans);
			}
			else if(operator.equals("AND"))
			{
				k = Math.min(k, 1);
				and(n, k, arr, ans);
			}
			else
			{
				k = Math.min(k, 1);
				or(n, k, arr, ans);
			}
		}
	}
}

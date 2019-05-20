import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class DelieveryBoy {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int t[][] = new int[n][n];
		int d[][] = new int[n][n];
		for(int i=0;i<n;i++)
		{
			String s[] = br.readLine().split(" ");
			for(int j=0;j<n;j++)
			{
				t[i][j] = Integer.parseInt(s[j]);
				d[i][j] = t[i][j];
			}
		}
		for(int k=0;k<n;k++)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(d[i][k] + d[k][j] < d[i][j])
						d[i][j] = d[i][k] + d[k][j];
				}
			}
		}
		int m = Integer.parseInt(br.readLine());
		for(int i=0;i<m;i++)
		{
			String s[] = br.readLine().split(" ");
			int src = Integer.parseInt(s[0]);
			int g = Integer.parseInt(s[1]);
			int des = Integer.parseInt(s[2]);
			int value = d[src][g] + d[g][des];
			System.out.println(value+" "+(value - d[src][des]));
		}
	}
}

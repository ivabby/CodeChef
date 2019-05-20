import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AverageNumber {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String ar[] = br.readLine().split(" ");
			int n = Integer.parseInt(ar[0]);
			int k = Integer.parseInt(ar[1]);
			int v = Integer.parseInt(ar[2]);
			ar = br.readLine().split(" ");
			long sum = 0;
			for(int i=0;i<n;i++)
				sum+=Integer.parseInt(ar[i]);
			long den = n+k;
			den = den * v;
			if(den > sum)
			{
				den = den - sum;
				if(den % k == 0)
					System.out.println(den / k);
				else
					System.out.println("-1");
			}
			else {
				System.out.println("-1");
			}
		}
	}	
}

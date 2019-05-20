import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CheatingOnQueue {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int k = Integer.parseInt(arr[1]);
			int a[] = new int[n];
			arr = br.readLine().split(" ");
			for(int i=0;i<n;i++)
				a[i] = Integer.parseInt(arr[i]);
			
			int pos = -1;
			for(int i=0;i<n;i++)
			{
				if(a[i] <= k)
				{
					int count = 1;
					long sum = a[i]/count;
					for(int j=i+1;j<n;j++)
					{
						count++;
						sum = sum + (long)Math.floor((double)a[j]/(double)count);
					}
					if(sum <= k)
					{
						pos = i+1;
						break;
					}
				}
			}
			System.out.println((pos == -1)?(n+1):pos);
		}
	}
}

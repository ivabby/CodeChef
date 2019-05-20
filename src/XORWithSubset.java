import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class XORWithSubset {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String a[] = br.readLine().split(" ");
			int n = Integer.parseInt(a[0]);
			int k = Integer.parseInt(a[1]);
			a = br.readLine().split(" ");
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = Integer.parseInt(a[i]);
			
			int max = k;
			for(int i=0;i<n;i++)
			{
				for(int j=i;j<n;j++)
				{
					for()
				}
			}
		}
	}
}

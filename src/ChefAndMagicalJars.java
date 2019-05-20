import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

class ChefAndMagicalJars {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String arr[] = br.readLine().split(" ");
			int a[] = new int[n];
			long count = 0;
			for(int i=0;i<n;i++)
			{
				a[i]= Integer.parseInt(arr[i]);
				count+=a[i] - 1;
			}
			System.out.println(count+1);
		}
	}
}

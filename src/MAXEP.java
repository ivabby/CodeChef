import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

class MAXEP {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int c = Integer.parseInt(arr[1]);
		int first = 1;
		int last = n;
		int a[] = new int[150001];
		for(int i=1;i<=n;i++)
			a[i] = -1;
		int mid = (first+last)/2;
		int value = 0;
		while(a[mid] == -1)
		{
			if(value == 0)
				System.out.println("1 "+mid);
			else 
			{
				System.out.println("2");
				System.out.println("1 "+mid);
			}
			value = Integer.parseInt(br.readLine());
			if(value == 0)
			{
				first = mid;
				a[mid] = 0;
			}
			else
			{
				last = mid;
				a[mid] = 1;
			}
			mid = (first+last)/2;
		}
		if(value == 1)
			System.out.println("2");
		if(a[mid] == 0 && a[mid+1] == 1)
			mid++;
		if(mid == n-1 && a[mid] == 0)
			mid++;
		System.out.println("3 "+(mid));
	}
}
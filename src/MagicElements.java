import java.util.*;

class MagicElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			long k = scanner.nextLong();
			long a[] = new long[n];
			long sum = 0;
			for(int i=0;i<n;i++)
			{
				a[i] = scanner.nextLong();
				sum+=a[i];
			}
			long count = 0;
			for(int i=0;i<n;i++)
			{
				if(a[i]+k > sum-a[i])
					count++;
			}
			System.out.println(count);
		}
	}
}
import java.util.Scanner;

class MinimumSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			long a[] = new long[n];
			for(int i=0;i<n;i++)
				a[i] = scanner.nextLong();
			long sum = 0;
			for(int i=0;i<31;i++)
			{
				long c1 = 0 , c2 = 0;
				for(int j=0;j<n;j++)
				{
					if(((a[j] >> i) & 1) == 1)
						c1++;
					else
						c2++;
				}
				if(c1>c2)
					sum = sum + (long)Math.pow(2 , i);
			}
			long s = 0;
			for(int i=0;i<n;i++)
				s = s + (sum^a[i]);
			System.out.println(s);
		}
	}
}

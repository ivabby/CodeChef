import java.util.Scanner;

class MaximAndDividers {
	static boolean find(long n)
	{
		while(n!=0)
		{
			long m = n%10;
			if(m == 4 || m == 7)
				return true;
			n = n/10;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			long n = scanner.nextLong();
			long count = 0;
			for(int i=1;i*i<=n;i++)
			{
				if(n%i != 0)
					continue;
				if(find(i))
					count++;
				long y = n/i;
				if(i != y)
				{
					if(find(y))
						count++;
				}
			}
			System.out.println(count);
		}
	}	
}

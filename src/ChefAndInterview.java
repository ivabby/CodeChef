import java.util.Scanner;

class ChefAndInterview {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			if(n == 1)
				System.out.println("1");
			else
			{
				int sq = (int)Math.sqrt(n);
				long count = 0;
				if(sq*sq == n)
				{
					count = sq;
					sq--;
				}
				for(int i=1;i<=sq;i++)
				{
					if(n%i == 0)
					{
						count = count + i + n/i;
					}
				}
				System.out.println(count);
			}
		}
	}
}
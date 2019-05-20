import java.util.Scanner;

class ChefAndEquality {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			int c[] = new int[100001];
			long max = 0;
			for(int i=0;i<n;i++)
			{
				int a = scanner.nextInt();
				c[a]++;
				if(c[a] > max)
					max = c[a];
			}
			System.out.println(n-max);
		}
	}
}

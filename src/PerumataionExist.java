import java.util.Scanner;

class PerumataionExist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			boolean flag = true;
			for(int i=1;i<n;i++)
			{
				if(a[i]-a[i-1] > 1)
				{
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
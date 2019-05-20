import java.util.Scanner;

class ChefLearningAlgorithm {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			int a[][] = new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
					a[i][j] = scanner.nextInt();
			}
			boolean flag = true;
			for(int i=0;i<n;i++)
			{
				boolean f = false;
				for(int j=0;j<n;j++)
				{
					if(a[i][j] == 0)
					{
						f = true;
						break;
					}
				}
				if(!f)
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				for(int j=0;j<n;j++)
				{
					boolean f = false;
					for(int i=0;i<n;i++)
					{
						if(a[i][j] == 0)
						{
							f = true;
							break;
						}
					}
					if(!f)
					{
						flag = false;
						break;
					}
				}
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

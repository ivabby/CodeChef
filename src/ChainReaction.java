import java.io.*;
import java.util.*;
class ChainReaction {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int r = scanner.nextInt();
			int c = scanner.nextInt();
			int a[][] = new int[r][c];
			for(int i=0;i<r;i++)
				for(int j=0;j<c;j++)
					a[i][j] = scanner.nextInt();
			
			boolean flag = true;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					int count = 4;
					if(i==0)
						count--;
					if(j==0)
						count--;
					if(i==r-1)
						count--;
					if(j==c-1)
						count--;
					if(count <= a[i][j])
					{
						flag = false;
						break;
					}
					//System.out.println(i+" "+j+" "+count);
				}
			}
			if(flag)
				System.out.println("Stable");
			else
				System.out.println("Unstable");
		}
	}

}

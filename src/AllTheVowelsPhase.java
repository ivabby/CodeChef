import java.util.*;
public class AllTheVowelsPhase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		boolean flag = true;
		int r = 0 , c = 0;
		for(int i=5;i<=100;i++)
		{
			if(k%i == 0)
			{
				flag = false;
				r = Math.max(i , k/i);
				c = Math.min(i , k/i);
				break;
			}
		}
//		System.out.println(r+" "+c);
		if(flag || (r<5 || c<5))
			System.out.println("-1");
		else
		{
			boolean v[][] = new boolean[r][c];
			char ch[][] = new char[r][c];
			int j = 0,m=0;
			for(int i=0;i<r;i++)
			{
				m=j;
				ch[i][j] = 'a';
				v[i][j] = true;
				
				j = (j+1)%c;
				ch[i][j] = 'e';
				v[i][j] = true;
				
				j = (j+1)%c;
				ch[i][j] = 'i';
				v[i][j] = true;
				
				j = (j+1)%c;
				ch[i][j] = 'o';
				v[i][j] = true;
				
				j = (j+1)%c;
				ch[i][j] = 'u';
				v[i][j] = true;
				
				j = (m+1)%c;
 			}
			for(int i=0;i<r;i++)
			{
				for(j=0;j<c;j++)
				{
					if(v[i][j])
						System.out.print(ch[i][j]);
					else
						System.out.print("b");
				}
//				System.out.println();
			}
		}
	}
}
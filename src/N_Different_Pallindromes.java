import java.util.*;

class N_Different_Pallindromes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			while(n>0)
			{
				for(int i=0;i<Math.min(26, n);i++)
					System.out.print((char)(i+97));
				n=n-26;
			}
			System.out.println();
		}
	}
}
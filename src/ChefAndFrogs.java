import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ChefAndFrogs {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		int p = Integer.parseInt(s[2]);
		int a[] = new int[n];
		s = br.readLine().split(" ");
		for(int i=0;i<n;i++)
			a[i] = Integer.parseInt(s[i]);
		while(p-->0)
		{
			s = br.readLine().split(" ");
			int l = Integer.parseInt(s[0]);
			int r = Integer.parseInt(s[1]);
			boolean flag = true;
			int size = r - l + 1;
			int b[] = new int[size];
			for(int i=0;i<size;i++)
				b[i] = a[l+i-1];
			Arrays.sort(b);
			for(int i=0;i<size;i++)
				System.out.print(b[i]+" ");
			for(int i=1;i<size;i++)
			{
//				System.out.print(b[i]+" ");
				if(b[i] - b[i-1] > k)
				{
					flag = false;
					break;
				}
			}
			System.out.println();
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}

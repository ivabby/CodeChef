import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefAndModuloGame {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String string[] = br.readLine().split(" ");
			int n = Integer.parseInt(string[0]);
			int p = Integer.parseInt(string[1]);
			int value = 0;
			int count = 0;
			if(n%2 != 0)
				n++;
			int a[] = new int[n+1];
			for(int i=n/2-1;i<p;i++)
			{
				for(int j=n/2-1;j<p;j++)
				{
					for(int k=n/2-1;k<p;k++)
					{
						int v = n%i;
						v = v%j;
						v = v%k;
						v = v%n;
//						System.out.print(v+" ");
//						if(v == value)
//							count++;
//						else if(v > value)
//						{
//							count = 1;
//							value = v;
//						}
//						if(i!=1 && j!=1 && k==1)
//							count++;
						if(v == n/2-1)
							System.out.println(i+" "+j+" "+k);
						a[v] = a[v] + 1;
					}
				}
			}
//			System.out.println(count);
			System.out.println();
			int v = -1 , max = 0;
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
				if(v < i && a[i]!=0)
				{
					max = a[i];
					v = i;
				}
				if(a[i] == 0)
					break;
			}
			int pos=0;
			if(n%2 == 0)
				pos = n/2-1;
			else
				pos = (n+1)/2 - 1;
//			System.out.println();
//			System.out.println(v+" "+max+" "+a[pos]);
			System.out.println(a[pos]);
		}
	}
}

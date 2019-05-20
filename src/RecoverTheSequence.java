import java.util.Scanner;

class RecoverTheSequence {
	static boolean check(int v1, int v2, int v3, int v4, int a[])
	{
		int count = 0;
		if(a[0]!=v1)
			count++;
		if(a[1]!=v2)
			count++;
		if(a[2]!=v3)
			count++;
		if(a[3]!=v4)
			count++;
		if(count == 1)
			return true;
		return false;
	}
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
			//System.out.println("hi");
			int d1 = a[1]-a[0];
			int d2 = a[2]-a[1];
			int d3 = a[3]-a[2];
			int diff = 0;
			while(true)
			{
			if(d1!=d2 && d2!=d3 && d3!=d1)
			{
				int v1 = a[0];
				int v2 = v1 + d1;
				int v3 = v2 + d1;
				int v4 = v3 + d1;
				if(check(v1, v2, v3, v4, a))
				{
					diff = d1;
					break;
				}
				v2 = v1 + d2;
				v3 = v2 + d2;
				v4 = v3 + d2;
				if(check(v1, v2, v3, v4, a))
				{
					diff = d2;
					break;
				}
				else
				{
					diff = d3;
					break;
				}
			}
			break;
			}
			if(d2 == d3)
			{
				a[0] = a[1] - d2;
				diff = d2;
			}
			else if(d1 == d2)
			{
				diff = d1;
			}
			
			System.out.print(a[0]+" ");
			for(int i=1;i<n;i++)
			{
				a[i] = a[i-1] + diff;
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
}

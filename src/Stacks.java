import java.util.Scanner;

class Stacks {
	static int binary(int a[],int size, int v)
	{
		int first = 0, last = size-1;
		while(first<=last)
		{
			int mid = (first+last)/2;
			if(a[mid] <= v)
				first = mid + 1;
			else
				last = mid - 1;
		}
		return first;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			int size = 0;
			int a[] = new int[n];
			for(int i=0;i<n;i++)
			{
				int v = scanner.nextInt();
				int index = binary(a, size, v);
				if(index>=size)
				{
					a[size] = v;
					size++;
				}
				else {
					a[index] = v;
				}
			}
			System.out.print(size+" ");
			for(int i=0;i<size;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
	}
}

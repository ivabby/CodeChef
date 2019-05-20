import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class DoublyIncreasingPath {
	static void traverse(int arr[] , ArrayList<Integer> a[])
	{
		boolean visited[] = new boolean[arr.length];
		boolean explored[] = new boolean[arr.length];
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			max = Math.max(max, dfs(arr, a, 0 , i , 1 , explored));
			System.out.println(max+" "+i+" "+a[i]);
		}
		System.out.println(max);
	}
	static int dfs(int arr[] , ArrayList<Integer> a[] , int max , int i , int value , boolean explored[])
	{
		if(explored[i])
			return 0;
		explored[i] = true;
		ArrayList<Integer> b = a[i];
		//Collections.sort(b);
		int path = value;
		int m = path;
		for(Integer integer : b)
		{
			int diff = arr[integer] - arr[i];
			if(i == 0)
				System.out.println(diff+" "+i+" "+arr[i]+" "+arr[integer]);
			if(diff > max)
			{
				path = path + 1;
				m = Math.max(m , dfs(arr, a, diff, integer, path , explored));
				System.out.println(m);
//				m = Math.max(m , path);
			}
		}
		explored[i] = false;
		return m;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int arr[] = new int[n];
			ArrayList<Integer> a[] = new ArrayList[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = scanner.nextInt();
				a[i] = new ArrayList<>();
			}
			for(int i=0;i<m;i++)
			{
				int val1 = scanner.nextInt() - 1;
				int val2 = scanner.nextInt() - 1;
				a[val1].add(val2);
				a[val2].add(val1);
			}
			traverse(arr,a);
		}
	}
}

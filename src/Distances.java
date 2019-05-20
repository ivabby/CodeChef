import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

class Distances {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String arr[] = br.readLine().split(" ");
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = Integer.parseInt(arr[i]);
			int b[] = new int[n];
			arr = br.readLine().split(" ");
			boolean flag = true;
			for(int i=1;i<n;i++)
			{
				if(a[i] != Integer.parseInt(arr[i-1]))
				{
					flag = false;
					break;
				}
//				System.out.println(a[i]+" "+arr[n-i-1]);
			}
			if(flag)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}

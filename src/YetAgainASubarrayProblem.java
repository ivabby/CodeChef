import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class YetAgainASubarrayProblem {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int k = Integer.parseInt(arr[1]);
			int a[] = new int[n];
			long count = 0;
			arr = br.readLine().split(" ");
			for(int i=0;i<n;i++)
				a[i] = Integer.parseInt(arr[i]);
			
			for(int i=0;i<n;i++)
			{
				ArrayList<Integer> b = new ArrayList<>();
				int c[] = new int[2001];
				c[a[i]]++;
				for(int j=i;j<n;j++)
				{
					if(i==j)
					{
						
					}
					else
						c[a[j]]++;
					b.add(a[j]);
					int d = 0;
					ArrayList<Integer> arrayList = new ArrayList<>();
					arrayList.addAll(b);
					Collections.sort(arrayList);
					System.out.println(arrayList);
					int value = arrayList.get((k%arrayList.size() == 0)?0:k%arrayList.size()-1);
					int cc = c[value];
					if(c[cc] != 0)
					{
						System.out.println(value+" "+cc);
						count++;
					}
				}
				//System.out.println();
				//System.out.println();
			}
			System.out.println(count);
		}
	}
}

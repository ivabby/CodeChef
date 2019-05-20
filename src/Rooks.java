import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

class Rooks {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int k = Integer.parseInt(arr[1]);
			HashSet<Integer> row = new HashSet<>();
			HashSet<Integer> column = new HashSet<>();
			for(int i=0;i<k;i++)
			{
				arr = br.readLine().split(" ");
				row.add(Integer.parseInt(arr[0]));
				column.add(Integer.parseInt(arr[1]));
			}
			
			ArrayList<Integer> rr = new ArrayList<>();
			ArrayList<Integer> cc = new ArrayList<>();
			int j=1;
			System.out.print(n-row.size()+" ");
			for(int i=1;i<=n;i++)
			{
				if(!row.contains(i))
				{
					row.add(i);
					rr.add(i);
					for(;j<=n;j++)
					{
						if(!column.contains(j))
						{
							cc.add(j);
							System.out.print(i+" "+j+" ");
							column.add(j);
							break;
						}
					}
				}
			}
//			System.out.print(rr.size()+" ");
//			for(int i=0;i<rr.size();i++)
//				System.out.print(rr.get(i)+" "+cc.get(i)+" ");
			System.out.println();
		}
	}
}

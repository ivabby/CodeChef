import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BuyingNewTablet {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String ar[] = br.readLine().split(" ");
			int n = Integer.parseInt(ar[0]);
			int b = Integer.parseInt(ar[1]);
			long max = 0;
			for(int i=0;i<n;i++)
			{
				ar = br.readLine().split(" ");
				int w = Integer.parseInt(ar[0]);
				int h = Integer.parseInt(ar[1]);
				int p = Integer.parseInt(ar[2]);
				long c = (long)w*(long)h;
				if(p<=b)
					max = Math.max(max, c);
			}
			if(max == 0)
				System.out.println("no tablet");
			else
				System.out.println(max);
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HelloHello {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			double d = Double.parseDouble(arr[0]);
			long u = Long.parseLong(arr[1]);
			int n = Integer.parseInt(arr[2]);
			double oc = d * (double)u;
			double max = Double.MIN_VALUE;
			int value = 0;
			//boolean flag = false;
			for(int i=1;i<=n;i++)
			{
				arr = br.readLine().split(" ");
				int m = Integer.parseInt(arr[0]);
				double r = Double.parseDouble(arr[1]);
				long c = Long.parseLong(arr[2]);
				double nc = (double)c/(double)m + (u*r);
				double diff = oc - nc;
				if(diff > max)
				{
					max = diff;
					value = i;
				}
			}
			System.out.println(value);
		}
	}	
}

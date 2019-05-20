import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class PiedPiperVSHooli {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			long a = Long.parseLong(arr[1]);
			long b = Long.parseLong(arr[2]);
			long x = Long.parseLong(arr[3]);
			long y = Long.parseLong(arr[4]);
			long z = Long.parseLong(arr[5]);
			
			long value = z - b;
			long round = (value%y == 0 ? value/y: value/y+1)-1;
//			int round = (int)Math.floor((double)value/(double)y);
			a = a + round*x;
			b = b + round*y;
			arr = br.readLine().split(" ");
			ArrayList<Long> c = new ArrayList<>();
			for(int i=0;i<n;i++)
				c.add(Long.parseLong(arr[i]));
			
			long i = 0;
			boolean flag = true;
			while(a < z)
			{
				long max = Collections.max(c);
				if(max <= 0)
				{
					flag = false;
					break;
				}
				a = a + max;
				c.remove((long) max);
				if(max/2 != 0)
					c.add(max/2);
				i++;
			}
			if(flag && a>=z)
				out.write(i+"\n");
			else
				out.write("RIP\n");
			out.flush();
		}
	}
}

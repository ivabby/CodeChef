import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class ChefAndStones {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			long n1 = Long.parseLong(arr[0]);
			long n2 = Long.parseLong(arr[1]);
			long m = Long.parseLong(arr[2]);
			m = (m*(m+1))/2;
			long min = Math.min(m , Math.min(n1 , n2));
			long sum = Math.abs(min - n1) + Math.abs(min - n2);
			out.write(sum+"\n");
			out.flush();
		}
	}
}

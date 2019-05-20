import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArrayGotMoves {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			long sum = 0;
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int k = Integer.parseInt(arr[1]);
			sum = (long)((long)k*(long)(k+1))/2 + (n-k);
			System.out.println(sum);
		}
	}
}

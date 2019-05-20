import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TojoProbability {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			double count = n + m - 1;
			System.out.printf("%6f\n", count);
		}
	}
}

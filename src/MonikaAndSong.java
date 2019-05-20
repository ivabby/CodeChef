import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class MonikaAndSong {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		//System.out.println();
		long max = 0;
		for(int i=0;i<n;i++)
		{
			//arr = br.readLine().trim().split(" ");
			long min = Long.MAX_VALUE;
			for(int j=0;j<m;j++)
				min = Math.min(min, scanner.nextLong());
			//System.out.println(min);
			max = Math.max(min , max);
		}
		System.out.println(max);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CHFINTRO {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int r = Integer.parseInt(arr[1]);
		while(n-->0)
		{
			int R = Integer.parseInt(br.readLine());
			if(R < r)
				System.out.println("Bad boi");
			else
				System.out.println("Good boi");
		}
	}
}

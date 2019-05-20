import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AdaSchool {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String a[] = br.readLine().split(" ");
			int n = Integer.parseInt(a[0]);
			int m = Integer.parseInt(a[1]);
			if(n%2!=0 && m%2!=0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}

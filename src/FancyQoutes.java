import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class FancyQoutes {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s = " " + br.readLine()+" ";
			if(s.contains(" not "))
				System.out.println("Real Fancy");
			else
				System.out.println("regularly fancy");
		}
	}
}

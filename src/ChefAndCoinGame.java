import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefAndCoinGame {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			if(n%6 == 0)
				System.out.println("Misha");
			else
				System.out.println("Chef");
		}
	}
}

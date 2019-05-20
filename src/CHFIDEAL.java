import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

class CHFIDEAL {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x =  ThreadLocalRandom.current().nextInt(1, 4);
		System.out.println(x);
		int y = Integer.parseInt(br.readLine());
		if(x!=1 && y!=1)
			System.out.println("1");
		else if(x!=2 && y!=2)
			System.out.println("2");
		else
			System.out.println("3");
	}
}

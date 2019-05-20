import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefAndXORNumber {
	static boolean powerOf2(long number)
	{
		if(number != 0 && (number&(number-1)) == 0)
			return true;
		else
			return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			long number = Integer.parseInt(br.readLine());
			if(number == 1)
			{
				System.out.println("2");
				continue;
			}
			if(powerOf2(number+1) && (number+1)%2 == 0)
			{
				System.out.println((number)/2);
			}
			else
				System.out.println("-1");
		}
	}
}

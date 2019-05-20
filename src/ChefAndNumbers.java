import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class ChefAndNumbers {
	static int digit(int n)
	{
		int sum = 0;
		while(n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m = n;
		int value = 1;
		while(m!=0)
		{
			value = value * 10;
			m = m/10;
		}
		value = value / 10;
		System.out.println(value);
		long count = 0;
		for(int i=1;i<n;i++)
		{
			int c1 = digit(i);
			int c2 = digit(c1);
			if(i+c1+c2 == n)
				count++;
		}
		out.write(count+"\n");
		out.flush();
	}
}

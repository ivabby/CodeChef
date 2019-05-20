import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TrickyDeal {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int a = Integer.parseInt(br.readLine());
			int i = 0 , j = 0;
			long max = 0 , total = 0;
			while(true)
			{
				i++;
				total+= a - Math.pow(2, i-1);
				if(total < 0)
					break;
				if(max < total)
				{
					max = total;
					j = i;
				}
			}
			System.out.println(i-1+" "+j);
		}
	}
}

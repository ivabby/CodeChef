import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefAndNumberGame {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String arr[] = br.readLine().split(" ");
			long pos = 0 , neg = 0;
			long count1 = 0 , count2 = 0;
			for(int i=0;i<n;i++)
			{
				int value = Integer.parseInt(arr[i]);
				if(value > 0)
				{
					pos+=value;
					count1++;
				}
				else
				{
					neg+=value;
					count2++;
				}
			}
			if(count2 == 0)
				count2 = count1;
			if(count1 == 0)
				count1 = count2;
			if(count1>count2)
				System.out.println(count1+" "+count2);
			else
				System.out.println(count2+" "+count1);
		}
	}
}

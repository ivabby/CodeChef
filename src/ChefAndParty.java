import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class ChefAndParty {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String ar[] = br.readLine().split(" ");
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = Integer.parseInt(ar[i]);
			Arrays.sort(a);
			int count = 0;
			int people = 0;
			for(int i=0;i<n;i++)
			{
				if(people < a[i])
					break;
				count++;
				people++;
			}
			System.out.println(count);
		}
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class LuckyNumberGame {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int a = Integer.parseInt(s[1]);
			int b = Integer.parseInt(s[2]);
			long arr[] = new long[n];
			String string[] = br.readLine().split(" ");
			int bob = 0 , alice = 0 , common = 0;
			for(int i=0;i<n;i++)
			{
				arr[i] = Long.parseLong(string[i]);
				if(arr[i]%a == 0 && arr[i]%b == 0)
					common++;
				else if(arr[i]%a == 0)
					bob++;
				else if(arr[i]%b == 0)
					alice++;
			}
			System.out.println(common+" "+bob+" "+alice);
			if(a == b)
				System.out.println("BOB");
			else {
				if(common == 0)
				{
					if(bob > alice)
						System.out.println("BOB");
					else
						System.out.println("ALICE");
				}
				else
				{
					if(alice == 0 && (bob>0 || common>0))
						System.out.println("BOB");
					else if(bob == 0 && (alice>0 || common>0))
						System.out.println("ALICE");
					else if(alice == 0 && bob == 0)
						System.out.println("ALICE");
					else if(bob+common > alice)
						System.out.println("BOB");
					else
						System.out.println("ALICE");
				}
			}
		}
	}
}

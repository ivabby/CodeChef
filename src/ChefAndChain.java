import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefAndChain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int c1 = 0 , c2 = 0;
			String st = br.readLine();
			for(int i=0;i<st.length();i++)
			{
				char ch = st.charAt(i);
				if(i%2 == 0)
				{
					if(ch != '-')
						c1++;
					if(ch != '+')
						c2++;
				}
				else {
					if(ch != '+')
						c1++;
					if(ch != '-')
						c2++;
				}
			}
			System.out.println(Math.min(c1, c2));
		}
	}
}

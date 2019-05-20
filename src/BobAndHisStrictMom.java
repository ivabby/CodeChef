import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class BobAndHisStrictMom {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			String string = br.readLine();
			char ch[] = string.toCharArray();
			char a[] = string.toCharArray();
			int one = 0 , zero = 0;
			for(int i=0;i<n;i++)
			{
				if(ch[i] == '1')
					one++;
				else
					zero++;
			}
			int c1 = 0 , c2 = 0;
			for(int i=0;i<ch.length;i++)
			{
				if(i%2 == 0)
				{
					if(c1 != one)
					{
						ch[i] = '1';
						c1++;
					}
					else {
						ch[i] = '0';
					}
				}	
				else
				{
					if(c2 != zero)
					{
						ch[i] = '0';
						c2++;
					}
					else {
						ch[i] = '1';
					}
				}
			}
			long count = 0;
			for(int i=0;i<n;i++)
			{
				//System.out.println(a[i]+" "+ch[i]);
				if(a[i] != ch[i])
					count++;
			}
//			System.out.println();
			System.out.println(count/2);
		}
	}	
}

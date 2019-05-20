import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

class TheNightsWatch {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n=0;
			try {
			n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			char ch[] = s.toCharArray();
			long count = 0;
			long zero = 0;
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i] == '1')
					continue;
				if(ch[i] == '0')
					zero++;
				if(i==0 && i+1<n && ch[i+1]=='0')
				{
					ch[i] = 1;
					count++;
				}
				else {
					if(i+1<n && i-1>=0 && ch[i+1]=='0' && ch[i-1]=='0')
					{
						ch[i] = 1;
						count++;
					}
					else if(i==n-1 && ch[i-1]=='0')
					{
						ch[i] = 1;
						count++;
					}
				}
//				System.out.println((i+1)+" "+count);
			}
			if(zero == n)
			{
				if(n%2==0)
					System.out.println(n/2);
				else
					System.out.println((n+1)/2);
			}
			else
			System.out.println(count);
			}catch (Exception e) {
				System.out.println((n%2==0)?n/2:(n+1)/2);
				// TODO: handle exception
			}
		}
	}
}

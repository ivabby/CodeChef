import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefAndGirlFriend {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String t1 = br.readLine();
			String t2 = br.readLine();
			int d = Integer.parseInt(br.readLine());
			int c1 = Integer.parseInt(t1.substring(0 , 2)) * 60 + Integer.parseInt(t1.substring(3));
			int c2 = Integer.parseInt(t2.substring(0 , 2)) * 60 + Integer.parseInt(t2.substring(3));
//			System.out.print((double)c1-c2+dis+" ");
			//dis = dis * 2;
			int diff = c1 - c2;
			if(2*d <= diff)
			{
				System.out.println((double)(diff+d)+" "+(double)diff);
			}
			else {
				double d1 = diff/2.0;
				double diff1 = d;
				System.out.println((double)(diff+d)+" "+(double)(diff1+d1));
			}
		}
	}
}

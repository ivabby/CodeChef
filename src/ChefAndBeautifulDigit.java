import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;

class ChefAndBeautifulDigit {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int d = Integer.parseInt(arr[1]);
			String n = arr[0];
			String s1 = "";
			int max = 0;
			for(int i=1;i<=9;i++)
			{
				if(i == d)
					break;
				//System.out.println(i);
				if(n.contains(i + ""))
				{
					int first = n.indexOf(i + "");
					int last = n.lastIndexOf(i + "");
					for(int j=max;j<=last;j++)
					{
						//System.out.println(n.charAt(j) == i);
						if(Integer.parseInt(n.charAt(j)+"") == i)
							s1+=Integer.toString(i);
					}
					max = Math.max(max, last);
					//System.out.println(first+" "+last+" "+max+" "+s1);
				}
			}
			System.out.print(s1);
			int count = s1.length();
			while(count<=n.length())
			{
				System.out.print(d);
				count++;
			}
			System.out.println();
		}
	}
}

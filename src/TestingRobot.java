import java.io.*;
import java.util.HashSet;

class TestingRobot {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			HashSet<Integer> hSet = new HashSet<>();
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int x = Integer.parseInt(arr[1]);
			String s = br.readLine();
			long c = 1;
			hSet.add(x);
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i) == 'L')
					x--;
				else
					x++;
				if(!hSet.contains(x))
				{
					hSet.add(x);
					c++;
				}
			}
			out.write(c+"\n");
			out.flush();
		}
	}
}

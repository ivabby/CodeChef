import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HelpingLira {
	static double find(int x1,int y1,int x2,int y2)
	{
		System.out.println(Math.sqrt(Math.sqrt(x2-x1) + Math.sqrt(y2-y1)));
		return Math.sqrt(Math.sqrt(x2-x1) + Math.sqrt(y2-y1));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int min = 1000000000 , max = 0;
		int c1 = 0 , c2 = 0;
		for(int i=1;i<=t;i++)
		{
			String arr[] = br.readLine().split(" ");
			int x1 = Integer.parseInt(arr[0]);
			int y1 = Integer.parseInt(arr[1]);
			int x2 = Integer.parseInt(arr[2]);
			int y2 = Integer.parseInt(arr[3]);
			int x3 = Integer.parseInt(arr[4]);
			int y3 = Integer.parseInt(arr[5]);
			int area = Math.abs(x1*y2 + x2*y3 + x3*y1 - x1*y3 - x3*y2 - x2*y1);
			if(area <= min)
			{
				min = (int)area;
				c1 = i;
			}
			if(area >= max)
			{
				max = (int)area;
				c2 = i;
			}
		}
		System.out.println(c1+" "+c2);
	}

}

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

class GiftRift {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String arr[] = br.readLine().split(" ");
		int r = Integer.parseInt(arr[0]);
		int c = Integer.parseInt(arr[1]);
		int a[][] = new int[r+1][c+1];
		int row[][] = new int[r+1][c+1];
		for(int i=1;i<=r;i++)
		{
			arr = br.readLine().split(" ");
			int min = Integer.MAX_VALUE;
			for(int j=1;j<=c;j++)
			{
				a[i][j] = Integer.parseInt(arr[j-1]);
				min = Math.min(min , a[i][j]);
			}
			for(int j=1;j<=c;j++)
			{
				if(a[i][j] == min)
					row[i][j] = min;
			}
		}
		boolean flag = false;
		for(int i=1;i<=r && !flag;i++)
		{
			for(int j=1;j<=c && !flag;j++)
			{
				if(row[i][j] != 0)
				{
					int max = Integer.MIN_VALUE;
					for(int k=1;k<=r;k++)
						max = Math.max(max , a[k][j]);
					if(max == row[i][j])
					{
						out.write(max+"\n");
						flag = true;
					}
				}
			}
		}
		if(!flag)
			out.write("GUESS\n");
		out.flush();
	}
}

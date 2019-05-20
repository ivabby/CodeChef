import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

class AndrewAndMeatballs {
	static ArrayList<Integer> arrayList = new ArrayList<>();
	static void seive()
	{
		boolean value[] = new boolean[1000];
		Arrays.fill(value, true);
		for(int i=2;i<value.length;i++)
		{
			if(value[i] == true)
			{
				//arrayList.add(i);
				for(int j=i+i;j<value.length;j+=i)
				{
					value[j] = false;
					if(!arrayList.contains(j))
						arrayList.add(j);
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		//seive();
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			int n = Integer.parseInt(arr[0]);
			int k = Integer.parseInt(arr[1]);
			if(n == 1 && k == 1)
				out.write("1");
			else if(n/2 >= k)
			{
				int j=2;
				for(int i=0;i<k;i++,j+=2)
					out.write(j+" ");
			}
			else {
				out.write("-1");
			}
			out.write("\n");
			out.flush();
		}
	}
}

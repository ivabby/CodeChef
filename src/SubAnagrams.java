import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;

class SubAnagrams {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int count[][] = new int[n][26];
		for(int i=0;i<n;i++)
		{
			String string = br.readLine();
			for(int j=0;j<string.length();j++)
			{
				int index = string.charAt(j) - 'a';
				count[i][index]++;
			}
		}
		String st = "";
		for(int i=0;i<26;i++)
		{
			boolean flag = true;
			if(count[0][i] == 0)
				continue;
			int min = count[0][i];
			for(int j=1;j<n;j++)
			{
				min = Math.min(min , count[j][i]);
			}
			if(flag)
				while(min-->0)
				st = st + (char)(97+i);
		}
		if(st.equals(""))
			st = "no such string";
		out.write(st);
		out.flush();
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class ChefGotReciepe {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			ArrayList<String> a = new ArrayList<>();
			ArrayList<Integer> b = new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				String string = br.readLine();
				String st = "";
				if(string.contains("a"))
					st = st + "a";
				if(string.contains("e"))
					st = st + "e";
				if(string.contains("i"))
					st = st + "i";
				if(string.contains("o"))
					st = st + "o";
				if(string.contains("u"))
					st = st + "u";
				if(!st.equals(""))
				{
					if(!a.contains(st))
					{
						a.add(st);
						b.add(1);
					}
					else {
						int index = a.indexOf(st);
						int count = b.get(index);
						b.remove(index);
						b.add(index, count+1);
					}
				}
			}
			long count = 0;
			for(int i=0;i<a.size();i++)
			{
				long c = 0;
				for(int j=i+1;j<a.size();j++)
				{
					String s = a.get(i) + a.get(j);
					if(s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o") && s.contains("u"))
						c = c + b.get(j);
				}
				if(c > 0)
				{
					if(a.get(i).equals("aeiou"))
					{
						long v = b.get(i) - 1;
						long size = c + 1;
						while(v > 0)
						{
							c = c + size;
							size++;
							v--;
						}
						count = count + c;
					}
					else {
						count = count + c*b.get(i);
					}
				}
				else if(a.get(i).equals("aeiou"))
				{
					long v = b.get(i);
					v = (v*(v-1))/2;
					count = count + v;
				}
				//System.out.println(a.get(i)+" "+c+" "+count);
			}
			System.out.println(count);
		}
	}
}

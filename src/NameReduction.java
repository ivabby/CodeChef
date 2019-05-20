import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class NameReduction {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String p[] = br.readLine().split(" ");
			String s = p[0] + p[1];
			int parent[] = new int[26];
			for(int i=0;i<s.length();i++)
				parent[s.charAt(i)-'a']++;
			int children[] = new int[26];
			int n = Integer.parseInt(br.readLine());
			while(n-->0)
			{
				s = br.readLine();
				for(int i=0;i<s.length();i++)
					children[s.charAt(i)-'a']++;
			}
			boolean flag = true;
			for(int i=0;i<26;i++)
				if(children[i] > parent[i])
				{
					flag = false;
					break;
				}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

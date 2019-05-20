import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GranamaReciepe {
	static String correct(String a , String b)
	{
		int c1[] = new int[26];
		int c2[] = new int[26];
		for(int i=0;i<a.length();i++)
			c1[a.charAt(i) - 'a']++;
		for(int i=0;i<b.length();i++)
			c2[b.charAt(i) - 'a']++;
		String res = "YES";
		for(int i=0;i<26;i++)
			if(c1[i] != c2[i])
			{
				res = "NO";
				break;
			}
		return res;
	}
	static String wrong(String a , String b)
	{
		boolean c1[] = new boolean[26];
		boolean c2[] = new boolean[26];
		for(int i=0;i<a.length();i++)
			c1[a.charAt(i) - 'a'] = true;
		for(int i=0;i<b.length();i++)
			c2[b.charAt(i) - 'a'] = true;
		String ans = "YES";
		for(int i=0;i<26;i++)
			if(c1[i] != c2[i])
			{
				ans = "NO";
				break;
			}
		return ans;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String arr[] = br.readLine().split(" ");
			String a = arr[0];
			String b = arr[1];
			if(correct(a, b).equals(wrong(a, b)))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

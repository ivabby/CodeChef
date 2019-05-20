import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LackOfLogic {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String string = br.readLine();
			int a[] = new int[26];
			for(int i=0;i<string.length();i++)
			{
				char ch = string.charAt(i);
				if(Character.isLowerCase(ch))
					a[ch-'a']++;
				else if(Character.isUpperCase(ch))
					a[ch-'A']++;
			}
			boolean flag = true;
			for(int i=0;i<26;i++)
				if(a[i] == 0)
				{
					flag = false;
					System.out.print((char)(i+'a'));
				}
			if(flag)
				System.out.print("~");
			System.out.println();
		}
	}
}

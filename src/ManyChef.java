import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ManyChef {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String string = br.readLine();
			String a = "";
			char ch[] = string.toCharArray();
			//System.out.println(string.length());
			for(int i=string.length()-1;i>=0;)
			{
				boolean flag = false;
				if(i>=3 && (ch[i] == '?' || ch[i] == 'F'))
				{
					//System.out.println(ch[i]+" "+ch[i+1]+" "+ch[i+2]+" "+ch[i+3]);
					if((ch[i-3] == '?' || ch[i-3] == 'C') && (ch[i-2] == '?' || ch[i-2] == 'H') && (ch[i-1] == '?' || ch[i-1] == 'E') &&
							(ch[i] == '?' || ch[i] == 'F'))
						flag = true;
				}
				
				if(flag)
				{
					i = i - 4;
					a = "CHEF" + a;
				}
				else {
					if(ch[i] == '?')
						a = "A" + a;
					else
						a = ch[i] + a;
					i--;
				}
			}
			System.out.println(a);
		}
	}
}

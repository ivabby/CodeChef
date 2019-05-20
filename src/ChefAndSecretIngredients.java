import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChefAndSecretIngredients {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
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
			int value = 0;
			for(int i=0;i<26;i++)
			{
				boolean flag = true;
				for(int j=0;j<n;j++)
					if(count[j][i] == 0)
					{
						flag = false;
						break;
					}
				if(flag && count[0][i]!=0)
					value++;
//				System.out.println((char)(i+97)+" "+count[0][i]);
			}
			System.out.println(value);
		}
	}
}

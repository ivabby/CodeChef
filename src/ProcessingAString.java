import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ProcessingAString {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String string = br.readLine();
			long count = 0;
			for(int i=0;i<string.length();i++)
			{
				char ch = string.charAt(i);
				if(Character.isDigit(ch))
					count = count + Integer.parseInt(ch+"");
			}
			System.out.println(count);
		}
	}
}
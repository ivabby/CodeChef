import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ArtOfBalance {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String string = br.readLine();
			int count[] = new int[26];
			for(int i=0;i<string.length();i++)
				count[string.charAt(i) - 'A']++;
			
			ArrayList<Integer> arrayList = new ArrayList<>();
			for(int i=0;i<26;i++)
			{
//				System.out.println(count[i]);
				if(count[i]!=0)
					arrayList.add(count[i]);
			}
			Collections.sort(arrayList);
			Collections.reverse(arrayList);
			long min = Long.MAX_VALUE;
			int n = string.length();
			int m = arrayList.size();
			for(int i=1;i<=Math.min(n, 26);i++)
			{
				if(n%i != 0)
					continue;
				int a = 0 , b = 0;
				for(int j=0;j<Math.min(m , i);j++)
				{
					int diff = arrayList.get(j) - n/i;
					if(diff > 0)
						a+=diff;
					else if(diff < 0)
						b-=diff;
				}
				min = Math.min(min , Math.max(a , b));
			}
			System.out.println(min);
		}
	}
}

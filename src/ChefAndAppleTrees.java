import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class ChefAndAppleTrees {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			int n = Integer.parseInt(br.readLine());
			HashSet<Integer> set = new HashSet<>();
			String st[] = br.readLine().split(" ");
			for(int i=0;i<n;i++)
			{
				int a = Integer.parseInt(st[i]);
				set.add(a);
			}
//			System.out.println(set);
			System.out.println(set.size());
		}
	}
}

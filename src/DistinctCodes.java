import java.util.HashSet;
import java.util.Scanner;

class DistinctCodes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			HashSet<String> hSet = new HashSet<>();
			String string = scanner.next();
			char ch[] = string.toCharArray();
			for(int i=1;i<string.length();i++)
			{
				String ss = (ch[i-1] + "") + (ch[i] + "");
				//System.out.println(ss);
				hSet.add(ss);
			}
			System.out.println(hSet.size());
		}
	}
}
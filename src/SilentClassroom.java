import java.util.Scanner;

public class SilentClassroom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c[] = new int[26];
		for(int i=0;i<n;i++)
		{
			String string = scanner.next();
			//System.out.println(string);
			c[string.charAt(0) - 'a']++;
		}
		boolean flag = false;
		long min = 0;
		for(int i=0;i<26;i++)
		{
			if(c[i]>1)
			{
				flag = true;
				int a = c[i]/2;
				int b = c[i] - a;
				min = min + (long)((a*(a-1))/2) + (long)((b*(b-1))/2); 
			}
		}
		if(flag)
			System.out.println(min);
		else
			System.out.println("0");
	}
}
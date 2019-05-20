import java.util.ArrayList;
import java.util.Scanner;

class Event {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		ArrayList<String> a = new ArrayList<>();
		a.add("monday");
		a.add("tuesday");
		a.add("wednesday");
		a.add("thursday");
		a.add("firday");
		a.add("saturday");
		a.add("sunday");
		while(t-->0)
		{
			String s = scanner.next();
			String e = scanner.next();
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			int start = a.indexOf(s)+1;
			int end = a.indexOf(e)+1;
			int diff=Math.abs(end-start+1);
			if(start>end)
			{
				diff = (7-start) + (end) + 1;
				int d = end/7+1;
				end = (int) (end + Math.pow(7, d));
			}
			System.out.println(start+" "+end);
			System.out.println(diff);
			int count = 0;
			while(end<=r)
			{
				System.out.println(end-start+1);
				if(end-start+1>=l && end-start+1<=r)
					count++;
				end+=7;
			}
			if(count==0)
				System.out.println("impossible");
			else if(count == 1)
				System.out.println(diff);
			else
				System.out.println("many");
		}
	}
}

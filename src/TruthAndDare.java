import java.util.HashSet;
import java.util.Scanner;

class TruthAndDare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int tr = scanner.nextInt();
			HashSet<Integer> a1 = new HashSet<>();
			while(tr-->0)
				a1.add(scanner.nextInt());
			int dr = scanner.nextInt();
			HashSet<Integer> a2 = new HashSet<>();
			while(dr-->0)
				a2.add(scanner.nextInt());
			String ans = "yes";
			int ts = scanner.nextInt();
			while(ts-->0)
			{
				if(!a1.contains(scanner.nextInt()))
					ans = "no";
			}
			int ds = scanner.nextInt();
			while(ds-->0)
			{
				if(!a2.contains(scanner.nextInt()))
					ans = "no";
			}
			System.out.println(ans);
		}
	}
}

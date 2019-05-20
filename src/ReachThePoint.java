import java.util.Scanner;

class ReachThePoint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			long x = Math.abs(scanner.nextLong());
			long y = Math.abs(scanner.nextLong());
			long min = Math.min(x , y);
			long max = Math.max(x , y);
//			System.out.println(x+" "+y);
			long count = max*2;
			if((max - min)%2 == 0)
			{
				System.out.println(count);
			}
			else
			{
				if(x < y)
					System.out.println(count - 1);
				else
					System.out.println(count + 1);
			}
		}
	}
}

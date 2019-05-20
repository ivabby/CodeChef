import java.util.Scanner;

class WatsonAndDigitSums {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0) {
			int d = scanner.nextInt();
			System.out.println(d%9+1);
		}
	}
}

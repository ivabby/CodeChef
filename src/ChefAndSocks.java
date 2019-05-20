import java.util.Scanner;

class ChefAndSocks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int jacketCost = scanner.nextInt();
		int sockCost = scanner.nextInt();
		int money = scanner.nextInt();
		money = money - jacketCost;
		int value = money/sockCost;
		if(value%2 == 0)
			System.out.println("Lucky Chef");
		else
			System.out.println("Unlucky Chef");
	}
}
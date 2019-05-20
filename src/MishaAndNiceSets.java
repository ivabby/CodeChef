import java.io.*;
import java.util.*;
class MishaAndNiceSets {
	static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			long l = scanner.nextLong();
			long r = scanner.nextLong();
			long g = scanner.nextLong();
			long count = r/g - (l-1)/g;
			if(count == 1 && (g<l))
				count = 0;
			System.out.println(count);
		}
	}
}

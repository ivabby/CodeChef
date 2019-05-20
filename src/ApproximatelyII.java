import java.util.HashMap;
import java.util.Scanner;

class ApproximatelyII {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			long a[] = new long[n];
			for(int i=0;i<n;i++)
				a[i] = scanner.nextLong();
			HashMap<Integer, Integer> hMap = new HashMap<>();
			int min = Integer.MAX_VALUE;
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					int value = (int) Math.abs(a[i] + a[j] - k);
					if(!hMap.containsKey(value))
						hMap.put(value , 1);
					else
						hMap.put(value , hMap.get(value)+1);
					min = Math.min(min , value);
				}
			}
			System.out.println(min+" "+hMap.get(min));
		}
	}
}
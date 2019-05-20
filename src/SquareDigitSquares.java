import java.util.ArrayList;
import java.util.Scanner;

class SquareDigitSquares {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Long> arrayList = new ArrayList<>();
		for(int i=0;i<=100000;i++)
		{
			long v = (long)i*(long)i;
			boolean flag = true;
			while(v!=0)
			{
				long r = v%10;
				if(r==0 || r==1 || r==4 || r==9)
				{
					v = v/10;
				}
				else {
					flag = false;
					break;
				}
			}
			//System.out.println(flag);
			if(flag)
				arrayList.add((long) ((long)i*(long)i));
		}
//		System.out.println(arrayList);
		int t = scanner.nextInt();
		while(t-->0)
		{
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long count = 0;
			for(int i=0;i<arrayList.size();i++)
			{
				long value = arrayList.get(i);
				if(value>=a && value<=b)
					count++;
			}
			System.out.println(count);
		}
	}
}
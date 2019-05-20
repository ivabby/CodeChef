import java.util.Scanner;

class BeautifulGarland {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			String s = scanner.next();
			int green = 0 , red = 0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i) == 'R')
					red++;
				else
					green++;
			}
			if(red == 0 || green == 0)
			{
				System.out.println("no");
			}
			else {
				if(red == green)
				{
					int rcount = 0 , gcount = 0;
					for(int i=1;i<s.length();i++)
					{
						if(s.charAt(i)==s.charAt(i-1))
						{
							if(s.charAt(i) == 'R')
								rcount++;
							else
								gcount++;
						}
					}
					if(rcount >= 2 || gcount >= 2)
						System.out.println("no");
					else
						System.out.println("yes");
				}
				else
					System.out.println("no");
			}
		}
	}
}

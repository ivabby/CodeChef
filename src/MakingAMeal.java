import java.util.Scanner;

class MakingAMeal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while(t-->0)
		{
			int c = 0 , o = 0 , d = 0 , e = 0 , h = 0 , f = 0;
			int n = scanner.nextInt();
			while(n-->0)
			{
				String string = scanner.next();
				for(int i=0;i<string.length();i++)
				{
					char ch = string.charAt(i);
					if(ch == 'c')
						c++;
					else if(ch == 'o')
						o++;
					else if(ch == 'd')
						d++;
					else if(ch == 'e')
						e++;
					else if(ch == 'h')
						h++;
					else if(ch == 'f')
						f++;
				}
			}
			//System.out.println(c+" "+o+" "+d+" "+e+" "+h+" "+f);
			c = c / 2;
			e = e / 2;
			System.out.println(Math.min(c, Math.min(o, Math.min(d, Math.min(e, Math.min(h, f))))));
		}
	}
}

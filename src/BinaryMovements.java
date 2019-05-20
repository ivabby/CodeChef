import java.io.*;
import java.util.*;
class BinaryMovements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int z = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			
			while(z-->0)
			{
				int c[] = new int[n];
				c[0] = a[0];
				for(int i=1;i<n;i++)
				{
					if(a[i] == 1 && a[i-1] == 0)
					{
						c[i] = 0;
						c[i-1] = 1;
					}
					else
						c[i] = a[i];
				}
				boolean flag = true;
				for(int i=0;i<n;i++)
				{
					if(a[i] != c[i])
						flag = false;
					a[i] = c[i];
					//System.out.print(a[i]+" ");
				}
				if(flag)
					break;
				//System.out.println();
			}
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");
			System.out.println();
		}
	}
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}

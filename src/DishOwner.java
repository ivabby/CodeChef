import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class DishOwner {
	static int parent[];
	static int find(int i)
	{
		if(parent[i] == i)
			return i;
		
		else
		{
			int pi = find(parent[i]);
			parent[i] = pi;
			return pi;
			//return parent[i];
		}
	}
	static void union(int x , int y)
	{
		int xset = find(x);
		int yset = find(y);
		parent[xset] = yset;
	}
	public static void main(String args[]) throws IOException {
		FastReader scanner = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			int s[] = new int[n+1];
			for(int i=1;i<=n;i++)
				s[i] = scanner.nextInt();
			parent = new int[n+1];
			for(int i=1;i<=n;i++)
				parent[i] = i;
			int q = scanner.nextInt();
			while(q-->0)
			{
				int v = scanner.nextInt();
				if(v == 0)
				{
					int x = scanner.nextInt();
					int y = scanner.nextInt();
					int xset = find(x);
					int yset = find(y);
					if(xset == yset)
					{
						out.write("Invalid query!\n");
						out.flush();
					}
					else if(s[xset] > s[yset])
					{
						parent[yset] = xset;
					}
					else if(s[yset] > s[xset])
					{
						parent[xset] = yset;
					}
				}
				else {
					int x = scanner.nextInt();
					out.write(find(x)+"\n");
					out.flush();
				}
			}
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
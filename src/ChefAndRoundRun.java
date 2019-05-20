import java.io.*;
import java.util.*;

class ChefAndRoundRun {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader scanner = new FastReader();
		int t = scanner.nextInt();
		while(t-->0)
		{
			int n = scanner.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			boolean visited[] = new boolean[n];
			long c = 0;
			for(int i=0;i<n;i++)
			{
				if(!visited[i])
				{
					HashMap<Integer , Integer> map = new HashMap<>();
					map.put(i , 1);
					int next = (i+a[i]+1)%n;
					while((!map.containsKey(next) || map.get(next)<2) && !visited[next])
					{
						if(!map.containsKey(next))
							map.put(next , 1);
						else
							map.put(next , map.get(next) + 1);
						next = (next + a[next] + 1)%n;
					}
					for(Integer j : map.keySet())
					{
						visited[j] = true;
						if(map.get(j) == 2)
						{
							c++;
						}
					}
				}
			}
			System.out.println(c);
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

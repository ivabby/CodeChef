import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

class DistinctPair {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader fr = new FastReader();
		int n = fr.nextInt();
		int m = fr.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int s = fr.nextInt();
//			if(!a.contains(s))
				a.add(s);
		}
		for(int i=0;i<m;i++)
		{
			int s = fr.nextInt();
//			if(!b.contains(s))
				b.add(s);
		}
//		System.out.println(a+" "+b);
//		Collections.sort(a);
//		Collections.sort(b);
		HashSet<Long> sum = new HashSet<>();
		int arr[][] = new int[n+m-1][2];
		int k=0;
		for(int i=a.size()-1;i>=0 && k<n+m-1;i=i-2)
		{
			for(int j=b.size()-1;j>=0 && k<n+m-1;j--)
			{
				long c = a.get(i) + b.get(j);
				if(!sum.contains(c))
				{
					System.out.println(i+" "+j);
					sum.add(c);
					k++;
				}
			}
		}
		for(int i=a.size()-2;i>=0 && k<n+m-1;i=i-2)
		{
			for(int j=b.size()-1;j>=0 && k<n+m-1;j--)
			{
				long c = a.get(i) + b.get(j);
				if(!sum.contains(c))
				{
					System.out.println(i+" "+j);
					sum.add(c);
					k++;
				}
			}
		}
//		System.out.println(sum);
//		for(int i=0;i<n+m-1;i++)
//		{
//			for(int j=0;j<2;j++)
//				System.out.print(arr[i][j]+" ");
//			System.out.println();
//		}
	}
}

import java.io.*;
import java.util.*;
class MinionChefAndBananas {
	static boolean check(int a[],int mid,int h)
	{
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			count = count + a[i]/mid;
			if(a[i]%mid > 0)
				count++;
		}
		return count<=h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader s = new FastReader();
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			int h = s.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = s.nextInt();
			Arrays.sort(a);
			long ans = 0;
			int low=1,high=1000000000;
			while(low<=high)
			{
				int mid = (low+high)/2;
				System.out.println(low+" "+high);
				if(check(a, mid, h))
				{
					ans = mid;
					high = mid - 1;
				}
				else
					low = mid + 1;
			}
			System.out.println(ans);
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

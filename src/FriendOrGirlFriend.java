import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

class FriendOrGirlFriend {
	 	static String getAlphaNumericString(int n) 
	    { 
	  
	        // chose a Character random from this String 
	        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz"; 
	  
	        // create StringBuffer size of AlphaNumericString 
	        StringBuilder sb = new StringBuilder(n); 
	  
	        for (int i = 0; i < n; i++) { 
	  
	            // generate a random number between 
	            // 0 to AlphaNumericString variable length 
	            int index 
	                = (int)(AlphaNumericString.length() 
	                        * Math.random()); 
	  
	            // add Character one by one in end of sb 
	            sb.append(AlphaNumericString 
	                          .charAt(index)); 
	        } 
	  
	        return sb.toString(); 
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		//long t = sc.nextLong();
		while(true)
		{
	        Random rand = new Random(); 
			int n = rand.nextInt(1000);
			String string = getAlphaNumericString(n);
			String st = getAlphaNumericString(1);
			char ch = st.charAt(0);
			int prev = 0;
			long cc = 0;
			for(int i=0;i<n;i++)
			{
				if(string.charAt(i) == ch)
				{
					long d = i - prev + 1;
					long c = n - i;
					cc = cc + c*d;
					prev = i+1;
				}
			}
//			System.out.println(cc);
			BigInteger tc = BigInteger.valueOf((n*(n+1))/2);
			BigInteger count = BigInteger.valueOf(0);
			long c = 0;
			for(int i=0;i<n;i++)
			{
				if(string.charAt(i) == ch)
				{
					//prev = i;
					BigInteger d = BigInteger.valueOf((c*(c+1))/2);
					count = count.add(d);
					c = 0;
				}
				else {
					c++;
				}
			}
			if(c!=0)
			{
				BigInteger d = BigInteger.valueOf((c*(c+1))/2);
				count = count.add(d);
			}
			tc = tc.subtract(count);
			BigInteger value = BigInteger.valueOf(cc);
			System.out.println(string+" "+ch);
			if(value.compareTo(tc) != 0)
			{
				System.out.println(value+" "+tc);
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

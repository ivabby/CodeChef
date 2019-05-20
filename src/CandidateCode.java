/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s1 = "";
            String s2 = "";
            long sum1 = 0 , sum2 = 0;
            int n = sc.nextInt();
            int a[] = new int[n];
            int max = Integer.MIN_VALUE;
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            sum1 = a[0];
            sum2 = a[1];
            s1 = Integer.toString(a[0]);
            s2 = Integer.toString(a[1]);
            for(int i=2;i<n;i++)
            {
                a[i] = sc.nextInt();
                max = Math.max(max , a[i]);
                    if(i%2 == 0)
                    {
                        if(sum1<0 && a[i]>=0)
                        {
                            sum1 = a[i];
                            s1 = Integer.toString(a[i]);
                        }
                        else if(sum1<0 && a[i]>sum1){
                            sum1 = a[i];
                            s1 = Integer.toString(a[i]);
                        }
                        else if(a[i] > 0){
                            sum1 = sum1 + a[i];
                            s1 = Integer.toString(a[i]) + s1;
                        }
                    } 
                    else{
                          if(sum2<0 && a[i]>=0)
                        {
                            sum2 = a[i];
                            s2 = Integer.toString(a[i]);
                        }
                        else if(sum2<0 && a[i]>sum2){
                            sum2 = a[i];
                            s2 = Integer.toString(a[i]);
                        }
                        else if(a[i] > 0){
                            sum2 = sum2 + a[i];
                            s2 = Integer.toString(a[i]) + s2;
                        }   
                    }  
            }
//            System.out.println(sum1+" "+sum2);
//            System.out.println(s1+" "+s2);
            if(sum1 == sum2)
            {
            	long b1 = Long.parseLong(s1);
            	long b2 = Long.parseLong(s2);
            	if(b1>b2)
            		System.out.println(b1);
            	else
            		System.out.println(b2);
            }
            else if(sum1 > sum2)
                System.out.println(s1);
            else
                System.out.println(s2);
        }
   }
}

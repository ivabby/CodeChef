import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AdaKing {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String a[] = br.readLine().split(" ");
			int r = Integer.parseInt(a[0]);
			int c = Integer.parseInt(a[1]);
			int k = Integer.parseInt(a[2]);
			int rr = r;
			int cc = c;
			int kk = k;
			int total = 0;
			rr--;
			while(rr>0 && kk>0 ) {
				total++;
				rr--;
				kk--;
			}
			System.out.println("up:"+total);
			rr = r;
			kk = k;
			cc--;
			while(cc>0 && kk>0) {
				total++;
				cc--;
				kk--;
			}
			System.out.println("left:"+total);
			cc = c;
			kk = k;
			cc++;
			while(cc<=8 && kk>0 ) {
				total++;
				cc++;
				kk--;
			}
			System.out.println("right:"+total);
			cc = c;
			kk = k;
			rr++;
			while(rr<=8 && kk>0 ) {
				total++;
				rr++;
				kk--;
			}
			System.out.println("down:"+total);
			rr = r;
			kk = k;
			rr--;
			cc--;
			while(rr>0 && cc>0 && kk>0) {
				total++;
				rr--;
				cc--;
				kk--;
			}
			System.out.println("upleft:"+total);

			rr = r;
			cc = c;
			kk = k;
			rr++;
			cc++;
			while(rr<=8 && cc<=8 && kk>0 ) {
				total++;
				rr++;
				cc++;
				kk--;
			}
			System.out.println("downright:"+total);

			rr = r;
			cc = c;
			kk = k;
			rr--;
			cc++;
			while(rr>0 && cc<=8 && kk>0) {
				total++;
				rr--;
				cc++;
				kk--;
			}
			System.out.println("upright:"+total);

			rr = r;
			cc = c;
			kk = k;
			rr++;
			cc--;
			while(rr<=8 && cc>0 && kk>0) {
				total++;
				rr++;
				cc--;
				kk--;
			}
			System.out.println("downleft:"+total);

			System.out.println(total+1);
		}
	}
}

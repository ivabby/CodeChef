import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class InternetMediaTypes {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int q = Integer.parseInt(arr[1]);
		HashMap<String, String> hMap = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			arr = br.readLine().split(" ");
			hMap.put(arr[0] , arr[1]);
		}
		for(int i=0;i<q;i++)
		{
			String string = br.readLine();
			String ss = string.substring(string.lastIndexOf('.') + 1);
//			System.out.println(ss);
			if(hMap.containsKey(ss) && string.contains('.'+""))
				System.out.println(hMap.get(ss));
			else
				System.out.println("unknown");
		}
	}
}

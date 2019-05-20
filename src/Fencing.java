import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

class Fencing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-->0)
		{
			MultiMap<Integer , Integer> map = new MultiMap<>();
			int n = sc.nextInt();
			int m = sc.nextInt();
//			boolean b[][] = new boolean[n+2][m+2];
			int k = sc.nextInt();
			long count = 0;
			while(k-->0)
			{
				int i = sc.nextInt();
				int j = sc.nextInt();
				Collection<Integer> arrayList = new ArrayList<>();
				arrayList = map.get(i-1);
				int c = 4;
				if(arrayList != null && arrayList.contains(j))
				{
					//System.out.println("Top: "+arrayList+" "+c);
					c--;
					count--;
				}
				arrayList = map.get(i+1);
				if(arrayList != null && arrayList.contains(j))
				{
					//System.out.println("Bottom: "+arrayList+" "+c);
					c--;
					count--;
				}
				arrayList = map.get(i);
				if(arrayList != null && arrayList.contains(j-1))
				{
					c--;
					count--;
				}
				if(arrayList != null && arrayList.contains(j+1))
				{
					c--;
					count--;
				}
				count+=c;
				map.put(i , j);
			}
			System.out.println(count);
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
class MultiMap<K, V>
{
    private Map<K, Collection<V>> map = new HashMap<>();
 
    /**
    * Add the specified value with the specified key in this multimap.
    */
    public void put(K key, V value) {
        if (map.get(key) == null)
            map.put(key, new ArrayList<V>());
 
        map.get(key).add(value);
    }
 
    /**
    * Associate the specified key with the given value if not
    * already associated with a value
    */
    public void putIfAbsent(K key, V value) {
        if (map.get(key) == null)
            map.put(key, new ArrayList<>());
 
        // if value is absent, insert it
        if (!map.get(key).contains(value)) {
            map.get(key).add(value);
        }
    }
 
    /**
    * Returns the Collection of values to which the specified key is mapped,
    * or null if this multimap contains no mapping for the key.
    */
    public Collection<V> get(Object key) {
        return map.get(key);
    }
 
    /**
    * Returns a Set view of the keys contained in this multimap.
    */
    public Set<K> keySet() {
        return map.keySet();
    }
 
    /**
    * Returns a Set view of the mappings contained in this multimap.
    */
    public Set<Map.Entry<K, Collection<V>>> entrySet() {
        return map.entrySet();
    }
 
    /**
    * Returns a Collection view of Collection of the values present in 
    * this multimap.
    */
    public Collection<Collection<V>> values() {
        return map.values();
    }
 
    /**
    * Returns true if this multimap contains a mapping for the specified key.
    */
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }
 
    /**
    * Removes the mapping for the specified key from this multimap if present
    * and returns the Collection of previous values associated with key, or
    * null if there was no mapping for key.
    */
    public Collection<V> remove(Object key) {
        return map.remove(key);
    }
 
    /**
    * Returns the number of key-value mappings in this multimap.
    */
    public int size() {
        int size = 0;
        for (Collection<V> value: map.values()) {
            size += value.size();
        }
        return size;
    }
 
    /**
    * Returns true if this multimap contains no key-value mappings.
    */
    public boolean isEmpty() {
        return map.isEmpty();
    }
 
    /**
    * Removes all of the mappings from this multimap.
    */
    public void clear() {
        map.clear();
    }
 
    /**
    * Removes the entry for the specified key only if it is currently
    * mapped to the specified value and return true if removed
    */
    public boolean remove(K key, V value) {
        if (map.get(key) != null) // key exists
            return map.get(key).remove(value);
 
        return false;
    }
 
    /**
    * Replaces the entry for the specified key only if currently
    * mapped to the specified value and return true if replaced
    */
    public boolean replace(K key, V oldValue, V newValue) {
 
        if (map.get(key) != null) {
            if (map.get(key).remove(oldValue))
                return map.get(key).add(newValue);
        }
        return false;
    }
}

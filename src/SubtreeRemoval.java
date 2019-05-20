import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

class SubtreeRemoval {
	static MultiMap<Integer, Integer> child;
	//static long sum = 0;
	static int x , a[],n;
	static long add(int key)
	{
		long sum = 0;
		Collection<Integer> c = child.get(key);
		if(c == null)
			return Math.max(x , a[key]);
		else {
			for(Integer i : c)
			{
				sum = sum + Math.max(x , add(i));
			}
			sum = Math.max(x , sum + a[key]);
			return sum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		while(t-->0)
		{
			child = new MultiMap();
			n = sc.nextInt();
			x =  sc.nextInt();
			x = -x;
			a = new int[n+1];
			for(int i=1;i<=n;i++)
				a[i] = sc.nextInt();
			for(int i=1;i<n;i++)
			{
				int p = sc.nextInt();
				int c = sc.nextInt();
				child.put(p , c);
			}
			Collection<Integer> c = child.get(1);
			ArrayList<Integer> arrayList = (ArrayList<Integer>) c;
			long sum = 0;
			if(c!=null)
			for(int i=0;i<c.size();i++)
			{
				sum = sum + Math.max(x , add(arrayList.get(i)));
			}
			sum = Math.max(sum + a[1], x);
			System.out.println(sum);
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

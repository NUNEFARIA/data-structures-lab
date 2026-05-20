package hashMap;

import java.util.Arrays;
import java.util.StringJoiner;

public class HashMap<K, V> {

    private Bucket<K, V>[] buckets;
    
    public HashMap(int capacity) {
        this.buckets = new Bucket[capacity];
    }
    
    private int hash(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }
    
    public void put(K key, V value) {
        
        int index = this.hash(key);
        
        if (this.buckets[index] == null) {
            this.buckets[index] = new Bucket<>();
        }
        
        buckets[index].put(key, value);
        
    }
    
    public V get(K key) {
        
        int index = this.hash(key);
        
        if (this.buckets[index] == null) {
            return null;
        }
        
       return this.buckets[index].get(key);
       
    }
    
    public void remove(K key) {
        
        int index = this.hash(key);
        
        if (this.buckets[index] == null) {
            return;
        }
        
        this.buckets[index].remove(key);
        
    }
    
    public boolean containsKey(K key) {
        return (get(key) != null);
    }
    
    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        for (Bucket bucket: buckets) {
            if (bucket != null) {
                builder.append("\n");
                builder.append(bucket);
            }
        }
        
        return builder.toString();
    }
}
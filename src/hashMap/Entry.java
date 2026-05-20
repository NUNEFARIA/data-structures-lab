package hashMap;

import java.util.StringJoiner;

public class Entry<K, V> {
    
    private K key;
    private V value;
    private Entry<K, V> next;
    
    public Entry(K kay, V value) {
        this.key = kay;
        this.value = value;
        this.next = null;
    }
    
    public K getKey() {
        return key;
    }
    
    public Entry<K, V> getNext() {
        return next;
    }
    
    public V getValue() {
        return value;
    }
    
    public void setValue(V value) {
        this.value = value;
    }
    
    public void setNext(Entry<K, V> next) {
        this.next = next;
    }
    
    public void setKey(K key) {
        this.key = key;
    }
    
    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        builder.append("[K:" + key);
        builder.append("|V:" + value);
        if (this.next != null) {
            builder.append("] " + next);
        }
        
        return builder.toString();
    }
}

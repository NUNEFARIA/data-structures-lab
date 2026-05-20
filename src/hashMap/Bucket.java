package hashMap;

import java.util.StringJoiner;

public class Bucket<K, V> {
    
    private Entry<K, V> firstEntry;
    
    public Bucket() {
        this.firstEntry = null;
    }
    
    public void put(K key, V value) {
        
        Entry<K,V> newEntry = new Entry<>(key,value);
        
        if (this.firstEntry == null) {
            this.firstEntry = newEntry;
            return;
        }
        
        Entry<K,V> tempEntry = this.firstEntry;
        
        while (true) {
            
            if (tempEntry.getNext() == null) {
                tempEntry.setNext(newEntry);
                return;
            }
            
            if (tempEntry.getKey() == newEntry.getKey()) {
                tempEntry.setValue(value);
                return;
            }
            
            tempEntry = tempEntry.getNext();
        }
    }
    
    public V get(K key) {
        
        Entry<K,V> tempEntry = this.firstEntry;
        
        while (tempEntry != null) {
            if (tempEntry.getKey().equals(key)) {
                return tempEntry.getValue();
            }
            tempEntry = tempEntry.getNext();
        }
        
        return null;
    }
    
    public void remove(K key) {
        
        if (this.firstEntry == null) {
            return;
        }
        if (this.firstEntry.getKey().equals(key)) {
            this.firstEntry = this.firstEntry.getNext();
            return;
        }
        
        Entry<K,V> tempEntry = this.firstEntry;
        
        while (tempEntry.getNext() != null) {
            if (tempEntry.getNext().getKey().equals(key)) {
                tempEntry.setNext(tempEntry.getNext().getNext());
                return;
            }
            tempEntry = tempEntry.getNext();
        }
        
    }
    
    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        builder.append(firstEntry);
        
        return builder.toString();
    }
}

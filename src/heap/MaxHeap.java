package heap;

import java.util.Arrays;
import java.util.StringJoiner;

public class MaxHeap<T extends Comparable<T>> {
    
    private T[] maxHeap;
    private int capacity;
    private int size;
    
    public MaxHeap(int capacity) {
        
        this.maxHeap = (T[]) new Comparable[capacity];
        this.capacity = capacity;
        this.size = 0;
    }
    
    public T[] getMaxHeap() {
        return maxHeap;
    }
    
    public void setMaxHeap(T[] maxHeap) {
        this.maxHeap = maxHeap;
    }
    
    private int left(int index) { return (2 * index + 1);}
    
    private int right(int index) { return (2 * index + 2);}
    
    private int parent(int index) { return ((index - 1) / 2);}
        
        
        public void insert (T value){
            
            for (int i = 0; i < capacity; ) {
                
                if (this.maxHeap[i] == null) {
                    this.maxHeap[i] = value;
                    return;
                }
                
                if (value.compareTo(this.maxHeap[i]) == 1) {
                    
                    i = this.right(i);
                    
                }
                else {
                    
                    i = this.left(i);
                }
                
                System.out.println("Capacidade Insuficiente!!");
            }
        }
        
        @Override
        public String toString () {
            
            StringBuilder builder = new StringBuilder();
            
            for (int i = 0; i < this.capacity; i++) {
                
                if (this.maxHeap[i] != null){
                    builder.append("[");
                    builder.append(this.maxHeap[i]);
                    builder.append("] ");
                }
                
            }
            
            return builder.toString();
        }
        
    }
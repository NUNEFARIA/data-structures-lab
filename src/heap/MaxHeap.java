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
    
    private int parent(int index) {
        return (index - 1) / 2;
    }
    
    private void swap(int a, int b) {
        
        T temp = this.maxHeap[a];
        
        this.maxHeap[a] = maxHeap[b];
        
        this.maxHeap[b] = temp;
    }
    
    private void heapifyUp(int index) {
        
        while ( index > 0 && this.maxHeap[index].compareTo(
                        this.maxHeap[this.parent(index)]) > 0
        ) {
            
            this.swap(index, this.parent(index));
            
            index = parent(index);
            
        }
    
    }
    
    public void insert (T value) {
        
        if (size == capacity) {
            throw new RuntimeException("Heap is full");
        }
        
        this.maxHeap[this.size] = value;
        
        heapifyUp(this.size);
        
        this.size++;
    }
    
//    peek()
//    remove()
//    heapifyDown()
    
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
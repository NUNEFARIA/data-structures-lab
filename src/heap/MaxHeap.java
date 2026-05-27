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
    
    private int leftSon(int index) {
        
        return (2 * index + 1);
    }
    
    private void heapifyDown() {
        
        int index = 0;
        
        while (leftSon(index) < size) {
            
            int largerChild = leftSon(index);
            
            if (
                    rightSon(index) < size &&
                            maxHeap[rightSon(index)].compareTo(
                                    maxHeap[largerChild]
                            ) > 0
            ) {
                
                largerChild = rightSon(index);
            }
            
            if (
                    maxHeap[index].compareTo(
                            maxHeap[largerChild]
                    ) >= 0
            ) {
                break;
            }
            
            swap(index, largerChild);
            
            index = largerChild;
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
    
    public T peek() {
        if (this.size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        
        return this.maxHeap[0];
    }
    
    public T remove(int index) {
        
        if (this.size == 0) {
            throw new RuntimeException("Heap is empty");
        }
        
        T removedValue = this.maxHeap[0];
        
        this.maxHeap[0] = this.maxHeap[this.size - 1];
        
        this.maxHeap[this.size - 1] = null;
        
        this.size--;
        
        this.heapifyDown();
        
        return removedValue;
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
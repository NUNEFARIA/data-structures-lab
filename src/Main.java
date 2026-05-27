import hashMap.HashMap;
import heap.MaxHeap;
import tree.BinaryTree;
import tree.Node;

public class Main {
    public static void main(String[] args) throws Exception {
        
        MaxHeap maxHeap = new MaxHeap<>(50);
        
        System.out.println(maxHeap);
        
        maxHeap.insert(1);
        System.out.println(maxHeap);
        maxHeap.insert(2);
        System.out.println(maxHeap);
        maxHeap.insert(3);
        System.out.println(maxHeap);
        maxHeap.insert(4);
        System.out.println(maxHeap);
        maxHeap.insert(5);
        System.out.println(maxHeap);
        maxHeap.insert(10);
        System.out.println(maxHeap);
        
        System.out.println(maxHeap.peek());
        
        maxHeap.remove(2);
        System.out.println(maxHeap);
    }
}
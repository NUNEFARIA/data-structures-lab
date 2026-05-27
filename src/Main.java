import hashMap.HashMap;
import heap.MaxHeap;
import tree.BinaryTree;
import tree.Node;

public class Main {
    public static void main(String[] args) throws Exception {
        
        MaxHeap maxHeap = new MaxHeap<>(50);
        
        System.out.println(maxHeap);
        
        maxHeap.insert(10);
        System.out.println(maxHeap);
        maxHeap.insert(9);
        System.out.println(maxHeap);
        maxHeap.insert(8);
        System.out.println(maxHeap);
        maxHeap.insert(10);
        System.out.println(maxHeap);
        maxHeap.insert(11);
        System.out.println(maxHeap);maxHeap.insert(10);
        System.out.println(maxHeap);
    }
}
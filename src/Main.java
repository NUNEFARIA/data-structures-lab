import graph.Graph;
import hashMap.HashMap;
import heap.MaxHeap;
import tree.BinaryTree;
import tree.Node;

public class Main {
    public static void main(String[] args) {
        
        Graph<Integer> graph = new Graph<>();
        
        graph.addVertex(2);
        graph.addVertex(7);
        graph.addVertex(6876);
        graph.addVertex(00);
        
        System.out.println(graph);
    }
}
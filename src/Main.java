import graph.Graph;
import hashMap.HashMap;
import heap.MaxHeap;
import tree.BinaryTree;
import tree.Node;

public class Main {
    public static void main(String[] args) {
        
        Graph<Character> graph = new Graph<>();
        
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        
        System.out.println(graph);
        
        graph.connect(graph.getVertices().get(0), graph.getVertices().get(1));
        
        System.out.println();
        System.out.println(graph);
    }
}
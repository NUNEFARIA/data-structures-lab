import tree.BinaryTree;
import tree.Node;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        System.out.println(tree);
        tree.insert(new Node<>(1));
        System.out.println(tree);
        tree.insert(new Node<>(0));
        System.out.println(tree);
        tree.insert(new Node<>(4));
        System.out.println(tree);
        tree.insert(new Node<>(2));
        System.out.println(tree);
        
        
        
    }
}
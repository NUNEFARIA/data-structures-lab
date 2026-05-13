package tree;


public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;
    private int size;
  
    
    public BinaryTree() {
        
        this.root = null;
        this.size = 0;
    }
    public BinaryTree(Node<T> node) {
        this.root = node;
    }
    
    // BST insertion algorithm
    public void insert(Node<T> newNode) {
        
        // Compares if root is null
        if (isEmpty()) {
            this.root = newNode;
            this.size++;
            return;
        }
        
        Node<T> node = this.root;
        int localSize = 0;
        
        while (true) {
            
            
            if (newNode.getValue().compareTo(node.getValue()) == 0){
                return;
            }
            
            localSize++;
            
            if (newNode.getValue().compareTo(node.getValue()) < 0) {
                
                if (node.getLeft() == null) {
                    node.setLeft(newNode);
                    this.size++;
                    return;
                }
                else {
                    node = node.getLeft();
                }
                
            }
            else {
                if (node.getRight() == null) {
                    node.setRight(newNode);
                    this.size++;
                    return;
                }
                else {
                    node = node.getRight();
                }
               
            }
        }
        
    }
    
    /*
     * Remove um valor da árvore.
     * A remoção começa pela raiz.
     */
    public void remove(T value) {
        this.root = remove(this.root, value);
    }
    
    /*
     */
    private Node<T> remove(Node<T> node, T value) {
        
        // Caso o valor não exista
        if (node == null) {
            return null;
        }
        
        // Compara o valor buscado com o valor do nó atual
        int cmp = value.compareTo(node.getValue());
        
        // Se o valor for menor, continua pela esquerda
        if (cmp < 0) {
            node.setLeft(remove(node.getLeft(), value));
        }
        
        // Se o valor for maior, continua pela direita
        else if (cmp > 0) {
            node.setRight(remove(node.getRight(), value));
        }
        
        // Nó encontrado
        else {
            
            // Caso 1:
            // Nó sem filhos
            if (node.getLeft() == null &&
                    node.getRight() == null) {
                
                return null;
            }
            
            // Caso 2:
            // Nó com apenas filho à direita
            if (node.getLeft() == null) {
                return node.getRight();
            }
            
            // Caso 3:
            // Nó com apenas filho à esquerda
            if (node.getRight() == null) {
                return node.getLeft();
            }
            
            // Caso 4:
            // Nó com dois filhos
            
            // Busca o menor valor da subárvore direita
            Node<T> successor = min(node.getRight());
            
            // Substitui o valor do nó atual
            // pelo valor do sucessor
            node.setValue(successor.getValue());
            
            // Remove o sucessor da árvore
            node.setRight(
                    remove(node.getRight(), successor.getValue())
            );
        }
        
        return node;
    }
    
    /*
     * Retorna o menor nó da subárvore.
     * Em uma BST, o menor valor sempre está
     * mais à esquerda possível.
     */
    private Node<T> min(Node<T> node) {
        
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        
        return node;
    }

    public boolean contains(T value) {
        
        if (isEmpty()) {
            return false;
        }
        
        Node<T> node = this.root;
        
        while (node != null) {
            
            
            if (value.compareTo(node.getValue()) == 0){
                return true;
            }
            
            if (value.compareTo(node.getValue()) < 0) {
                    node = node.getLeft();
            }
            else {
                node = node.getRight();
                
            }
        }
        
        return false;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public int size() {
        return this.size;
    }
    
    public int height() {
        return height(this.root);
    }
    
    private int height(Node<T> node) {
        
        if (node == null) {
            return -1;
        }
        
        return 1 + Math.max(
                height(node.getLeft()),
                height(node.getRight())
        );
    }

    public void clear() {
        this.root = null;
        this.size = 0;
    }
    
    @Override
    public String toString() {
        return toString(this.root);
    }
    
    private String toString(Node<T> node) {
        if (node == null) {
            return "";
        }
        
        // left → root → right
        return toString(node.getLeft())
                + "["
                + node.getValue()
                + "] "
                + toString(node.getRight());
    }
}

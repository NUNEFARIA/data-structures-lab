package queue.linkedQueue;

public class LinkedQueue<T> {
    
    private Elemento<T> primeiro;
    private Elemento<T> ultimo;
    
    // Entra no final da fila
    public void in(T elemento) {
        
        Elemento<T> novoElemento = new Elemento<>(elemento);
        
        // fila vazia
        if (this.primeiro == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
            return;
        }
        
        // último aponta para o novo
        this.ultimo.setProximo(novoElemento);
        
        // novo vira o último
        this.ultimo = novoElemento;
    }
    
    // Remove o primeiro da fila
    public void out() {
        
        // fila vazia
        if (this.primeiro == null) {
            throw new RuntimeException("Fila vazia");
        }
        
        // apenas um elemento
        if (this.primeiro == this.ultimo) {
            this.primeiro = null;
            this.ultimo = null;
            return;
        }
        
        // primeiro avança
        this.primeiro = this.primeiro.getProximo();
    }
    
    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        Elemento<T> atual = this.primeiro;
        
        while (atual != null) {
            
            builder.append("[");
            builder.append(atual.getElemento());
            builder.append("] ");
            
            atual = atual.getProximo();
        }
        
        return builder.toString();
    }
}
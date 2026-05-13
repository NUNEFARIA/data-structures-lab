package linkedList;

/**
 * Representa um nó de uma lista encadeada.
 *
 * Cada nó possui:
 * - um elemento (dado armazenado)
 * - uma referência para o próximo nó da lista
 */
public class No<T> {
    
    // 🔹 Dado armazenado no nó
    private T elemento;
    
    // 🔹 Referência para o próximo nó da lista
    // Se for o último nó, será null
    private No<T> proximo;
    
    /**
     * Construtor que cria um nó isolado (sem próximo)
     */
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
    
    /**
     * Construtor que cria um nó já apontando para outro
     */
    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    /**
     * Retorna o elemento armazenado no nó
     */
    public T getElemento() {
        return elemento;
    }
    
    /**
     * Retorna o próximo nó da lista
     */
    public No<T> getProximo() {
        return proximo;
    }
    
    /**
     * Define qual será o próximo nó
     */
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
    /**
     * Altera o valor armazenado no nó
     */
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    
    /**
     * Retorna uma representação simples do nó (apenas o valor)
     *
     * Obs: não mostramos o próximo para evitar recursão desnecessária
     */
    @Override
    public String toString() {
        return String.valueOf(elemento);
    }
}
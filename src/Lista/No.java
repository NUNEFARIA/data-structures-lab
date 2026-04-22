package Lista;

/* Cada nó armazane um valor e o proximo item da lista*/
public class No<T> { // # T neste caso é um tipo generico, qualquer
    // outra letra ou palavra poderia ser usada em seu lugar
    
    private T elemento; // # Armazena o dado
    private No<T> proximo; // # Aponta para o proximo nó da lista
    
    // Builders
    public No(T elemento) { // # Instancia nó solitario
        this.elemento = elemento;
        this.proximo = null;
    }
    
    public No(T elemento, No<T> proximo) { // Instancia nó que aponta para outro
        this.elemento = elemento;
        this.proximo = proximo;
    }
    
    // Getters
    public T getElemento() {
        return elemento;
    }
    
    public No<T> getProximo() {
        return proximo;
    }
    
    // Setters
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    
    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", proximo=" + proximo +
                '}';
    }
}

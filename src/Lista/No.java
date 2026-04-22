package Lista;

public class No<T> {
    
    private T elemento;
    private No<T> proximo;
    
    // Builders
    public No(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
    
    public No(T elemento, No<T> proximo) {
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

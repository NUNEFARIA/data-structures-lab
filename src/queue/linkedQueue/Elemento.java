package queue.linkedQueue;

public class Elemento<T> {
    
    private T elemento;
    private Elemento<T> proximo;
    
    public Elemento(T elemento) {
        this.elemento = elemento;
        this.proximo = null;
    }
    
    public T getElemento() {
        return elemento;
    }
    
    public Elemento<T> getProximo() {
        return proximo;
    }
    
    public void setProximo(Elemento<T> proximo) {
        this.proximo = proximo;
    }
    
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    
    @Override
    public String toString() {
        return String.format("%s", elemento);
    }
}
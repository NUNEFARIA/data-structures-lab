package stack.linkedStack;

public class Elemento<T> {
    private T elemento;
    private Elemento<T> inferior;
    
    public Elemento(T elemento) {
        this.elemento = elemento;
        this.inferior = null;
    }
    
    public Elemento(T elemento, Elemento<T> superior) {
        this.elemento = elemento;
        this.inferior = superior;
    }
    
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    
    public void setInferior(Elemento<T> superior) {
        this.inferior = superior;
    }
    
    public T getElemento() {
        return elemento;
    }
    
    public Elemento<T> getInferior() {
        return inferior;
    }
    
}

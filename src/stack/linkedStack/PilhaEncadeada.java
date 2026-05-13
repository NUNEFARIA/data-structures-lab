package stack.linkedStack;

public class PilhaEncadeada<T> {
    
    private Elemento<T> topo;
    private int altura;
    
    public PilhaEncadeada() {
        this.topo = null;
        this.altura = 0;
    }
    
    public void adiciona(T elemento) {
        Elemento<T> novoTopo = new Elemento<>(elemento);
        
        // O antigo topo recebe o antigo como inferior
        novoTopo.setInferior(this.topo);
        
        // o novo se torna o topo
        this.topo = novoTopo;
        
        // A altura é incrementada
         altura++;
    }
    
    public void retira() {
        this.topo = this.topo.getInferior();
    }
    
    public int getAltura() {
        return altura;
    }
    
    @Override
    public String toString() {
        
        StringBuilder builder = new StringBuilder();
        
        Elemento<T> posicao = topo;
        
        while (posicao != null) {
            
            builder.append("[");
            
            builder.append(posicao.getElemento());
            
            builder.append("] ");
            
            posicao = posicao.getInferior();
        }
        
        return builder.toString();
    }
}

package linkedList;

public class ListaEncadeada<T> {
    
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;
    
    private final int NAO_ENCONTRADO = -1;
    
    //  Validações separadas (IMPORTANTE)
    private boolean posicaoInvalida(int posicao) {
        return posicao < 0 || posicao >= this.tamanho;
    }
    
    private boolean posicaoInvalidaParaAdicionar(int posicao) {
        return posicao < 0 || posicao > this.tamanho;
    }
    
    //  Adiciona no final
    public void adiciona(T elemento) {
        No<T> novo = new No<>(elemento);
        
        if (this.tamanho == 0) {
            this.inicio = novo;
        } else {
            this.ultimo.setProximo(novo);
        }
        
        this.ultimo = novo;
        this.tamanho++;
    }
    
    //  Adiciona no início
    public void adicionaInicio(T elemento) {
        No<T> novo = new No<>(elemento, this.inicio);
        this.inicio = novo;
        
        if (this.tamanho == 0) {
            this.ultimo = novo;
        }
        
        this.tamanho++;
    }
    
    //  Adiciona em posição
    public void adiciona(int posicao, T elemento) {
        
        if (posicaoInvalidaParaAdicionar(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        if (posicao == 0) {
            this.adicionaInicio(elemento);
            return;
        }
        
        if (posicao == this.tamanho) {
            this.adiciona(elemento);
            return;
        }
        
        No<T> anterior = this.buscaNo(posicao - 1);
        No<T> novo = new No<>(elemento, anterior.getProximo());
        
        anterior.setProximo(novo);
        this.tamanho++;
    }
    
    //  Remove início
    public T removeInicio() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Lista vazia");
        }
        
        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;
        
        if (this.tamanho == 0) {
            this.ultimo = null;
        }
        
        return removido;
    }
    
    //  Remove final
    public T removeFinal() {
        if (this.tamanho == 0) {
            throw new RuntimeException("Lista vazia");
        }
        
        if (this.tamanho == 1) {
            return this.removeInicio();
        }
        
        No<T> penultimo = this.buscaNo(this.tamanho - 2);
        T removido = penultimo.getProximo().getElemento();
        
        penultimo.setProximo(null);
        this.ultimo = penultimo;
        this.tamanho--;
        
        return removido;
    }
    
    //  Remove por posição
    public T remove(int posicao) {
        
        if (posicaoInvalida(posicao)) {
            throw new RuntimeException("Posição inválida");
        }
        
        if (posicao == 0) {
            return this.removeInicio();
        }
        
        if (posicao == this.tamanho - 1) {
            return this.removeFinal();
        }
        
        No<T> anterior = this.buscaNo(posicao - 1);
        No<T> atual = anterior.getProximo();
        
        anterior.setProximo(atual.getProximo());
        atual.setProximo(null);
        
        this.tamanho--;
        return atual.getElemento();
    }
    
    //  Busca nó
    private No<T> buscaNo(int posicao) {
        if (posicaoInvalida(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        
        No<T> atual = this.inicio;
        
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        
        return atual;
    }
    
    //  Busca por posição
    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }
    
    //  Busca elemento
    public int busca(T elemento) {
        No<T> atual = this.inicio;
        int pos = 0;
        
        while (atual != null) {
            if (elemento == null) {
                if (atual.getElemento() == null) return pos;
            } else {
                if (elemento.equals(atual.getElemento())) return pos;
            }
            
            atual = atual.getProximo();
            pos++;
        }
        
        return NAO_ENCONTRADO;
    }
    
    //  Tamanho
    public int getTamanho() {
        return this.tamanho;
    }
    
    //  Limpa lista
    public void limpa() {
        No<T> atual = this.inicio;
        
        while (atual != null) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }
        
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    
    //  toString
    @Override
    public String toString() {
        if (this.tamanho == 0) {
            return "[]";
        }
        
        StringBuilder sb = new StringBuilder("[");
        No<T> atual = this.inicio;
        
        while (atual != null) {
            sb.append(atual.getElemento());
            atual = atual.getProximo();
            
            if (atual != null) {
                sb.append(", ");
            }
        }
        
        sb.append("]");
        return sb.toString();
    }
}
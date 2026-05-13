package stack.arrayStack;

import java.util.Arrays;

public class Pilha<T> {
    
    private T[] elementos;
    private int tamanho;
    
    public Pilha(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    
    public void adiciona( T elemento) {
        this.elementos[tamanho++] = elemento;
    }
    
    public void retira() {
        this.elementos[--tamanho] = null;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}

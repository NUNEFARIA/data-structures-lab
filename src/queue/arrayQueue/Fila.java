package queue.arrayQueue;

import java.util.Arrays;

public class Fila<T> {
    
    private T[] elementos;
    private int tamanho;
    
    public Fila(int tamanho) {
        this.elementos = (T[]) new Object[tamanho];
        this.tamanho = 0;
    }
    
    public void adiciona(T elemento) {
        this.elementos[tamanho++] = elemento;
    }
    
    public void retira() {
        int rep = tamanho;
        for (int i = 0; i < rep;) {
            this.elementos[i] = this.elementos[++i];
        }
        tamanho--;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}

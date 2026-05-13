package array;

import java.util.Arrays;

public class Vetor {
    
    private String[] elementos;
    private int tamanho;
    
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

//    // Adiciona elemento ao vetor
//    public void adiciona(String elemento) {
//        // Percorre o vetor
//        for (int i = 0; i < this.elementos.length; i++) {
//            // Armasena elemento na primeira posição vasia
//            // encontrada e sai do loop
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    // Adiciona elemento a vetor
//    // (forma mais eficiente e com execptions)
//    public void adiciona(String elemento) throws Exception {
//        if (this.tamanho < this.elementos.length) {
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        }else {
//            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
//        }
//
//    }
    
    public int getTamanho() {
        return this.tamanho;
    }
    
    // Adiciona elemento a vetor
    // (forma mais eficiente e sem execptions)
    public boolean adiciona(String elemento) {
        // Verifica se há posição vasia
        if (this.tamanho < this.elementos.length) {
            // Armasena elemento na primeira posição vasia
            // encontrada retorna indicador de sucesso
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }else {
            // Caso não aja espaço disponivel,
            // retorna indicador de insucesso
            return false;
        }
        
        
    }
    
    @Override
    public String toString() {
        return Arrays.toString(this.elementos);
    }
}


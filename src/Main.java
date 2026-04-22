import Lista.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        
        lista.adiciona(1);
        
        System.out.println(lista);
        System.out.println(lista.getTamanho());
    }
}
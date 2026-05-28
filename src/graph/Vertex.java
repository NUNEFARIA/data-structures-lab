package graph;

import java.util.ArrayList;

public class Vertex<T> {
    
    private T value;
    private ArrayList<Vertex<T>> connections;
    
    public Vertex(T value) {
        this.value = value;
        this.connections = new ArrayList<>();
    }
    
    public ArrayList<Vertex<T>> getConnections() {
        return connections;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    public void setConnections(ArrayList<Vertex<T>> connections) {
        this.connections = connections;
    }
    
//    connect()
//    disconnect()
//    toString()

}

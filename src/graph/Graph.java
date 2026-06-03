package graph;

import java.util.ArrayList;

public class Graph<T> {
    
    ArrayList<Vertex<T>> vertices;
    
    public Graph() {
        
        this.vertices = new ArrayList<>();
    }
    
    public ArrayList<Vertex<T>> getVertices() {
        return vertices;
    }
    
    public  void addVertex(T value) {
        
        Vertex<T> newVertex = new Vertex<>(value);
        
        this.vertices.add(newVertex);
        
    }
    
    public void connect(Vertex<T> vertexA, Vertex<T> vertexB) {
        
        if (!vertices.contains(vertexA) ||
                !vertices.contains(vertexB)) {
            
            throw new IllegalArgumentException("Vertex does not belong to graph");
        }
        
        if(vertexA.getConnections().contains(vertexB)) {
            
            System.out.println("\n" +
                    vertexA.getValue() +
                    " e " +
                    vertexB.getValue() +
                    " They are aready connected");
            
            return;
        }
        
        vertexA.connect(vertexB);
        vertexB.connect(vertexA);
        
    }
    
    public void disconnect()
    
    public String toString() {
        
        if (this.vertices.isEmpty()) {
            
            return "Graph is empty";
            
        }
        
        StringBuilder builder = new StringBuilder();
        
        for (Vertex<T> v: this.vertices) {
            
            builder.append("\n");
            builder.append(v);
            
        }
        
        
        return builder.toString();
    }

}

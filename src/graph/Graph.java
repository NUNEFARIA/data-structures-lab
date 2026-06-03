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
    
    public  void removeVertex(Vertex<T> vertex) {
        
        if (!vertices.contains(vertex)) {
            
            throw new IllegalArgumentException("Vertex does not belong to graph");
        }
        
        this.vertices.remove(vertex);
        
        for (Vertex<T> v: this.vertices) {
            
            if( v.getConnections().contains(vertex)) {
                
                v.disconnect(vertex);
                
            }
            
        }
        
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
                    " They are already connected");
            
            return;
        }
        
        vertexA.connect(vertexB);
        vertexB.connect(vertexA);
        
    }
    
    public void disconnect(Vertex<T> vertexA, Vertex<T> vertexB) {
        
        if (!vertices.contains(vertexA) ||
                !vertices.contains(vertexB)) {
            
            throw new IllegalArgumentException("Vertex does not belong to graph");
        }
        
        if(!(vertexA.getConnections().contains(vertexB))) {
            
            System.out.println("\n" +
                    vertexA.getValue() +
                    " e " +
                    vertexB.getValue() +
                    " They aren't already connected");
            
            return;
        }
        
        vertexA.disconnect(vertexB);
        vertexB.disconnect(vertexA);
        
    }
    
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

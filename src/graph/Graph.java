package graph;

import java.util.ArrayList;

public class Graph<T> {
    
    ArrayList<Vertex<T>> vertices;
    
    public Graph() {
        
        this.vertices = new ArrayList<>();
    }
    
//    connect()
//    disconnect()
    
    public String toString() {
        
        if (this.vertices.isEmpty()) {
            
            return "Graph is empty";
            
        }
        
        StringBuilder builder = new StringBuilder();
        
        for (Vertex v: this.vertices) {
            
            builder.append("\n");
            builder.append(v);
            
        }
        
        
        return builder.toString();
    }

}

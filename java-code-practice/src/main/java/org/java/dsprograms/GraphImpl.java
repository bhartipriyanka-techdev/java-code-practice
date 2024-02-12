package org.java.dsprograms;

public class GraphImpl {

    int[][] graph;
    GraphImpl(int vertics){

        graph = new int[vertics][vertics];
    }
    void addEdge(int v, int u){
        graph[v][u] =1;
        graph[u][v] = 1;
    }
    void display(){
        for(int i =0 ;i<= graph.length - 1; i++){
            System.out.print(i+": ");
            for(int j =0 ;j<= graph.length - 1; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        GraphImpl graph1 = new GraphImpl(4);
        graph1.addEdge(0,1);
        graph1.addEdge(0,2);
        graph1.addEdge(2,3);
        graph1.addEdge(1,3);
        graph1.display();

    }
}

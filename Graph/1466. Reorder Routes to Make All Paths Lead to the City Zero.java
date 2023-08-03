class Graph{
    ArrayList<Integer>[] outAdjacencyList;
    ArrayList<Integer>[] inAdjacencyList;
    Graph(int n,int[][] connections){
        outAdjacencyList = new ArrayList[n];
        inAdjacencyList = new ArrayList[n];
        for(int i=0;i<n;i++){
            outAdjacencyList[i] = new ArrayList<Integer>();
            inAdjacencyList[i] = new ArrayList<Integer>();
        }
        for(int[] edge : connections){
            int from = edge[0]; int to = edge[1];
            outAdjacencyList[from].add(to);
            inAdjacencyList[to].add(from);
        }
    }
    int InDegree(int n){
        return inAdjacencyList[n].size();
    }
    int OutDegree(int n){
        return outAdjacencyList[n].size();
    }
}
class Solution {
    int count = 0;
    boolean isChecked[];
    void dfs(Graph graph, int now){
        if(isChecked[now]){
            return;
        }
        isChecked[now]=true;
        for(int n:graph.inAdjacencyList[now]){   
            dfs(graph,n);
        }
        for(int n: graph.outAdjacencyList[now]){
            if(isChecked[n]==false){
                count++;
            }
            dfs(graph,n);
        }
    }

    public int minReorder(int n, int[][] connections) {
        Graph mygraph = new Graph(n, connections);
        isChecked = new boolean[n];
        dfs(mygraph, 0);
        return count;
    }
}
import java.util.*;
class Solution {
    boolean[] marked;
    ArrayList<Integer>[] graph;
    public void dfs(int src, int des){
        if(src==des){
            marked[src] = true;
            return;
        }
        for(int next : graph[src]){
            if(marked[next]==false){
                marked[next] = true;
                dfs(next,des);
                if(marked[des]==true){
                    return;
                }
            }
            
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int graphSize[] = new int[n];
        for(int[] e : edges){
            for(int v : e){
                graphSize[v]+=1;
            }
        }
        graph = new ArrayList[n];
        marked = new boolean[n];
        for(int i = 0;i<n;i++){
            graph[i] = new ArrayList<Integer>(graphSize[i]);
        }
        for(int[] e : edges){
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        dfs(source,destination);
        return marked[destination];
    }
}
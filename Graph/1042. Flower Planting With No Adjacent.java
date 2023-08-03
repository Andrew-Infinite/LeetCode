class Graph{
    ArrayList<Integer>[] adjacencyList;
    int flowertype[];
    Graph(int n, int[][]edges){
        adjacencyList = new ArrayList[n];
        flowertype = new int[n];
        for(int i=0;i<n;i++){adjacencyList[i] = new ArrayList<Integer>(3);}
        for(int[]edge : edges){
            adjacencyList[edge[0]-1].add(edge[1]-1);
            adjacencyList[edge[1]-1].add(edge[0]-1);
        }
    }
}
class Solution {
    Graph myGraph;
    boolean isChecked[];
    public int[] gardenNoAdj(int n, int[][] paths) {
        myGraph = new Graph(n,paths);
        isChecked = new boolean[n];
        /*for(int i=0;i<n;i++){
            myGraph.flowertype[i]=dfs(i);
        }*/
        bfs(myGraph,n);
        return myGraph.flowertype;
    }
    void bfs(Graph graph,int n){
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            if(!isChecked[i]) queue.add(i);
            isChecked[i] = true;
            while(!queue.isEmpty()){
                int now = queue.remove();
                HashSet<Integer> flowerUsed = new HashSet<Integer>();
                for(int x:myGraph.adjacencyList[now]){
                    flowerUsed.add(myGraph.flowertype[x]);
                    if(!isChecked[x]) queue.add(x);
                    isChecked[x]=true;
                }
                for(int j=1;j<5;j++){
                    if(!flowerUsed.contains(j)){
                        myGraph.flowertype[now] = j;
                        break;
                    }
                }
            }
        }
        
    }
    int dfs(int now){
        if(isChecked[now]){
            //might return 0, but if 0 means they would be process later, so it is okay.
            return myGraph.flowertype[now];
        }
        isChecked[now] = true;
        HashSet<Integer> flowerUsed = new HashSet<Integer>();
        for(int x:myGraph.adjacencyList[now]){
            myGraph.flowertype[x]=dfs(x);
            flowerUsed.add(myGraph.flowertype[x]);
        }
        System.out.println(flowerUsed.toString());
        for(int i=1;i<5;i++){
            if(!flowerUsed.contains(i)){return i;}
        }
        return -1;
    }
}
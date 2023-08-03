class Solution {
    ArrayList<Integer> graph[];
    boolean isProcessing[];
    boolean isMarked[];
    public boolean dfs(int now){
        isProcessing[now]=true;
        for(int x : graph[now]){
            if(isProcessing[x]) return false;
            if(isMarked[x]) continue;
            
            isMarked[x] = true;
            if(dfs(x)==false) return false;
        }
        isProcessing[now]=false;
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        graph = new ArrayList[numCourses];
        isMarked = new boolean[numCourses];
        isProcessing = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            graph[i] = new ArrayList<Integer>();
        }
        for(int[] edge : prerequisites){
            graph[edge[1]].add(edge[0]);
        }
        for(int i=0;i<numCourses;i++){
            if(!isMarked[i]){
                if(dfs(i)==false) return false;
            }
        }
        return true;
    }
}
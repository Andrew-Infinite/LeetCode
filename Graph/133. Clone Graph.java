/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
class Solution {
    HashMap <Integer,Node> graph = new HashMap<Integer,Node>();
    public void dfs(Node original, Node Copy){

        for(Node x : original.neighbors){
            if(!graph.containsKey(x.val)){
                Node newNode = new Node(x.val);
                graph.put(x.val,newNode);
                Copy.neighbors.add(newNode);
                dfs(x,newNode);
            }else{
                Copy.neighbors.add(graph.get(x.val));
            }
            
        }
    }
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Node cloneGraph = new Node(node.val,new ArrayList<Node>(node.neighbors.size()));
        graph.put(cloneGraph.val,cloneGraph);
        dfs(node,cloneGraph);
        return cloneGraph;
    }
}
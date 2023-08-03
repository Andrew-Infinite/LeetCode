class Solution {
    Stack<int[]> stack = new Stack<int[]>();
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        floodFill2(image,sr,sc);
        for(int[] pair : stack){
            sr=pair[0];sc=pair[1];
            image[sr][sc] = color;
        }
        return image;
    }
    void floodFill2(int[][] image, int sr, int sc) {
        stack.push(new int[]{sr,sc});
        int color = image[sr][sc];
        image[sr][sc]=-1;
        if(sr+1<image.length&&color==image[sr+1][sc]){
            floodFill2(image, sr+1,sc);
        }
        if(sc+1<image[0].length&&color==image[sr][sc+1]){
            floodFill2(image, sr,sc+1);
        }
        if(sr-1>=0&&color==image[sr-1][sc]){
            floodFill2(image, sr-1,sc);
        }
        if(sc-1>=0&&color==image[sr][sc-1]){
            floodFill2(image, sr,sc-1);
        }
    }
}
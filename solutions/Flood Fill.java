class Solution {
    private int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int tempColor = newColor == 0?Integer.MIN_VALUE:-newColor;
        int mul = newColor == 0?0:-1;
        int curr = image[sr][sc];
        dfs(image,sr,sc,tempColor,curr);
        for(int[] mx:image){
            for(int j=0;j<mx.length;++j) {
                if(mx[j]<0)
                    mx[j]*=mul;
            }
        }
        return image;
    }
    
    private void dfs(int[][] image, int sr, int sc, int newColor,int curr) {
        image[sr][sc]=newColor;
        for(int[] dir:directions) {
            int xs = sr+dir[0],ys=sc+dir[1];
            if(xs<0||xs>=image.length||ys<0||ys>=image[0]
                .length||image[xs][ys]<0||image[xs][ys]!=curr)
                continue;
           dfs(image,xs,ys,newColor,curr); 
        }
    }
    
    
}

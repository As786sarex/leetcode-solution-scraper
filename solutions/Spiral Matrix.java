class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new LinkedList<>();
        int m=matrix[0].length,n=matrix.length;
        int[][] directions= {{0,1},{1,0},{0,-1},{-1,0}};
        int dir=0;
        int[] all={m,n-1},current={0,-1};
        
        while(true){
            int temp=all[dir%2];
            while(temp-->0){
                var c= directions[dir];
                current[0]+=c[0];
                current[1]+=c[1];
                //System.out.println(current[0]+" "+current[1]);
                result.add(matrix[current[0]][current[1]]);
            }
            --all[dir%2];
            dir=(dir+1)%4;
            if(all[dir%2]<=0)
                return result;
        }
        
        
    }
}

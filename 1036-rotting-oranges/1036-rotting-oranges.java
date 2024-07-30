class Pair{
    int row,col,tm;
    Pair(int _row,int _col,int _tm){
        this.row = _row; this.col = _col; this.tm = _tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis = new int[n][m];

        Queue<Pair> queue = new LinkedList<>();
        int cnt_fresh = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1){
                    cnt_fresh++;
                }
            }
        }
        if(cnt_fresh==0)
            return 0;

        int tm=0,cnt=0;
        int dx[] = {-1,0,1,0};
        int dy[] = {0,1,0,-1};

        while(!queue.isEmpty()){
            int r = queue.peek().row;
            int c = queue.peek().col;
            int t = queue.peek().tm;
            tm = Math.max(tm,t);
            queue.remove();
            for(int i=0;i<4;i++){
                int nrow = r + dx[i];
                int ncol = c + dy[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                    queue.add(new Pair(nrow,ncol,t+1));
                    vis[nrow][ncol]=2;
                    cnt++;
                } 
            }
        }
        if(cnt!=cnt_fresh) return -1;
        
        return tm;
    }
}
public class setMatrixZero {
    public static void main(String[] args) {
        /*
         * a m*n matrix is given .
         * find out if any zero is present inseide th matrix .
         * I f any then make the row and column in whuich it present entire 0..
         */
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int m = arr.length, n = arr[0].length;

        // int[][] helper=new int[m][n];
        // for(int i=0;i<m;i++){
        // for(int j=0;j<n;j++){
        // helper[i][j]=arr[i][j];
        // }
        // }
        // for(int i=0;i<m;i++){
        // for(int j=0;j<n;j++){
        // if(helper[i][j]==0){
        // for(int b=0;b<n;b++){
        // arr[i][b]=0;
        // }
        // for(int a=0;a<m;a++){
        // arr[a][j]=0;
        // }
        // }
        // }
        // }
        // for(int i=0;i<m;i++){
        // for(int j=0;j<n;j++){
        // System.out.print(arr[i][j]);
        // }
        // System.out.println();
        // }

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (row[i] == true) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (col[j] == true) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

}

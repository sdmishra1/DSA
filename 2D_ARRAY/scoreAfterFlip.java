public class scoreAfterFlip {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } };
        int m = arr.length, n = arr[0].length;
        // to check whether the 1st column having 1 or not

        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
        }
        // to check all the columns individually except the 1st one as that is being
        // already sorted
        for (int j = 1; j < n; j++) {
            int noOfzeroes = 0, noOfones = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0)
                    noOfzeroes++;
                else
                    noOfones++;
            }
            if (noOfzeroes > noOfones) {
                for (int i = 0; i < m; i++) {
                    if (arr[i][j] == 0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
        }

        int score = 0;
        int x = 1;
        for (int j = n-1; j >=0 ; j--) {
            for (int i = 0; i < m; i++) {
                score += (arr[i][j] * x);
            }
            x *= 2;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(score);

    }

}

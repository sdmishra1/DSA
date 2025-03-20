public class rotateArrayBy90 {
    public static void main(String[] args) {
    int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
    int m=arr.length;
    

    for(int i=0;i<m;i++){
        for(int j=0;j<i;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    for(int i=0;i<m;i++){
        int c=0,b=m-1;
        while(c<b){
        int temp=arr[i][c];
        arr[i][c]=arr[i][b];
        arr[i][b]=temp;
        c++;b--;
        } 
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
    
}

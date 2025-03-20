public class maximum_element {
    public static void main(String[] args) {
        int arr[] = {1,2,56,7,667,98,9,0};
        int n= arr.length;


        int max = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=max){
                if(arr[i]>smax){
                    smax=arr[i];
                }
            }
        }

        int min  = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        int smin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]!=min){
                if(arr[i]<smin){
                    smin = arr[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(smax);
        System.out.println(min);
        System.out.println(smin);
    }
    
}

public class pallindrome{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,3,2};
        int n= arr.length;
        int flag=0;

        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                System.out.println("not a pallindrome");
                flag=1;
                break;
            }
            
        }
        if(flag==0)
        System.out.println("pallindrome");
    }
}

//Time Complexcity =O(n)
//Space Complexcity =O(1)
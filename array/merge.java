import java.util.Arrays;

public class merge{
    public static void main(String[] args) {
        int a[]={1,43,55,87};
        int b[]={0,5,23,52,89,97};

        int c[]=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
                //i++;k++;
            }
            else{
            c[k++]=b[j++];
            //k++;j++;
            }
        }

        if(i==a.length){
            while(j<b.length){
            c[k++]=b[j++];
            //k++;j++;
            }

        }

        if(j==b.length){
            while(i<a.length){
            c[k++]=b[j++];
            //k++;j++;
            }

        }
       
        
        
        System.out.println(Arrays.toString(c));
    }
}
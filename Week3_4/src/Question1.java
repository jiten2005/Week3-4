public class Problem4 {
    static void mergeSort(double arr[], int l, int r){
        if(l<r){
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);

            double temp[]=new double[r-l+1];
            int i=l,j=m+1,k=0;

            while(i<=m && j<=r){
                if(arr[i]<arr[j]) temp[k++]=arr[i++];
                else temp[k++]=arr[j++];
            }

            while(i<=m) temp[k++]=arr[i++];
            while(j<=r) temp[k++]=arr[j++];

            for(i=l,k=0;i<=r;i++,k++)
                arr[i]=temp[k];
        }
    }

    public static void main(String args[]){
        double arr[]={12,8,15};

        mergeSort(arr,0,arr.length-1);

        for(double x:arr)
            System.out.print(x+" ");
    }
}
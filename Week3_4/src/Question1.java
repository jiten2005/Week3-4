public class Question5 {
    public static void linearSearch(String arr[], String target){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(target)){
                System.out.println("Found at index "+i);
                return;
            }
        }
    }

    public static void binarySearch(String arr[], String target){
        int low=0, high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid].equals(target)){
                System.out.println("Found at index "+mid);
                return;
            }

            if(arr[mid].compareTo(target)<0)
                low=mid+1;
            else
                high=mid-1;
        }
    }

    public static void main(String args[]){
        String arr[]={"accA","accB","accB","accC"};

        linearSearch(arr,"accB");
        binarySearch(arr,"accB");
    }
}
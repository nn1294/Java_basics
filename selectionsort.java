public class selectionsort {
    public static void main(String[] args) {
        int arr[] = {7,3,1,2,6,4,5};
        for(int i=0;i<arr.length-i-1;i++){
            int smallest  = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    int arr[smallest] = arr[j];
                    smallest = j;
                }
                int temp  =  arr[smallest];
                arr[smallest]= arr[i];
                arr[i] = temp;
            }
            System.out.print();
        }
    }
}

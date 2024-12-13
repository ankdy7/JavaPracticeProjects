public class LargestElementInArray {
    public static void main(String[] args) {
        int [] arr = {1,1,3,3,2,5,4,8,6,10,9,7};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

            System.out.print(arr[arr.length-1]);

    }
}

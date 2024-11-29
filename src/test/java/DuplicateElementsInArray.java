public class DuplicateElementsInArray {

    public static void main(String[] args) {

        int [] arr={1,1,2,3,4,5,7,8,8,8,9};

        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = 0;
                    }
                }
                if (count > 1) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

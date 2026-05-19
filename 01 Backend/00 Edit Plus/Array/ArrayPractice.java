class ArrayPractice {
    public static void main(String[] arg) {
        int arr[] = { 1, 2, 3, 4 };

        for(int i =0; i < arr.length; i++) {
            arr[i] = arr[++i] +1;
        }

        for(int num : arr) {
            // System.out.println(arr[num]);
            System.out.println(num);
        }
    }
}
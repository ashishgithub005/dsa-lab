package binarysearch;

public class BinarySearchDemo {
    static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        //find 3
        int k = 7;
        int res = binarySearchAlgo(a, k);
        System.out.println(res);
    }

    private static int binarySearchAlgo(int[] a, int k) {
        int start = 0;
        int end = a.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(a[mid] == k){
                return mid;
            }else if(a[mid] > k){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return -1;
    }
}

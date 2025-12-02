package array.operation;

public class InsertInToArray {
    static void main(String[] args) {
        //initialize array with size n
        int[] a = new int[5];
        int j = 1;
        for(int i=0;i<5 ;i++){
            a[i] = j++;
        }

        for(int i=0;i<5 ;i++){
            System.out.println(a[i]);
        }
    }
}

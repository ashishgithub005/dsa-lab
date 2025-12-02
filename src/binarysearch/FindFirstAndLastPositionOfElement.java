package binarysearch;

import java.util.Scanner;

public class FindFirstAndLastPositionOfElement {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element for which you want to search: ");
        int k = sc.nextInt();
        int[] a = {5,7,7,8,8,10};
        int firstPosition = firstPosition(a, k);
        System.out.println("firstPosition : "+firstPosition);
        int lastPosition = lastPosition(a, k);
        System.out.println("lastPosition : "+lastPosition);
    }

    private static int lastPosition(int[] a, int k) {
        int start = 0;
        int end = a.length - 1;
        int lastPosition = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == k) {
                //if element is found then assume that one is lastPosition of element
                lastPosition = mid;
                //  and then try to search other position if present to right(becasue firt posiiton always present right side) of found element.
                start = mid + 1;
            }else if (a[mid] < k) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return lastPosition;
    }

    private static int firstPosition(int[] a, int k) {
        int start = 0;
        int end = a.length - 1;
        int firstPosition = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] == k) {
                //if element is found then assume that one is firstPosition of element
                firstPosition = mid;
                //  and then try to search other position if present to left(becasue firt posiiton always present left side) of found element.
                end = mid - 1;
            }else if (a[mid] < k) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return firstPosition;
    }
}

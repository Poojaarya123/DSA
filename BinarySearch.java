import java.util.*;

public class BinarySearch {
    // Binary Search
    public static int binarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // Camparsions
            if (num[mid] == key) { // found
                return mid;
            }
            if (num[mid] < key) { // right
                start = mid + 1;
            }
             else{
                //if mid>key
                end = mid - 1;   //left
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 6;
        System.out.println("Index for key is : " + binarySearch(num, key));

    }
}

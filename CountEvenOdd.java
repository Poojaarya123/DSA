public class CountEvenOdd {
    public static void count_evenOdd(int arr[], int n) {
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println(countEven + "," + countOdd);

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        count_evenOdd(arr, n);

    }
}

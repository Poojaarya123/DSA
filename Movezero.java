public class Movezero {
    public static int j;

    public static void pushZerosToEnd(int[] arr, int n) {

        for (int i = 0; i < n; i++) {

            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println("Print all array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 15, 0, 0, 2, 17, 0, 2, 16, 0, 0,15 };
        int n = arr.length;
        pushZerosToEnd(arr, n);
    }
}

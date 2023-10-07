public class MaxGuest {
    public static void maxHour(int e[], int l[], int t) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < t; i++) {
            sum = sum + e[i] - l[i];
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int e[] = { 7, 0, 5, 1, 3 };
        int l[] = { 1, 2, 1, 3, 4 };
        maxHour(e, l, 5);
    }

}

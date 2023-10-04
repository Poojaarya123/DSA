public class Array_as_fun {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 97, 98, 99 };
        update(marks);

        // To print the update array
        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks : " + marks[i]);
        }
    }

}

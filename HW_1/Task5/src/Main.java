import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] task5 = new Integer[]{3, 2, 3, 1, 4, 2, 8, 3};

        System.out.println("Array: " + Arrays.toString(task5));

        for (int i = 0; i < task5.length; i++) {
            for (int j = i + 1; j < task5.length; j++) {
                if (task5[i].equals(task5[j])) {
                    task5[j] = 0;

                }
            }
        }

        System.out.println("Replacing all duplicate elements with the value 0: " + Arrays.toString(task5));

    }
}

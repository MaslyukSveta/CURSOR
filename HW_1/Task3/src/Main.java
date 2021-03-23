import java.util.Arrays;

public class Main {
    public static void main (String [] args){

        Integer [] task3 = new Integer[]  {-12, -23, 3, 93, -34, -67, 83, -2, -6, 56, -45, 2};

        System.out.println ("Array: " + Arrays.toString (task3));
        int sum = 0;
        for (Integer integer : task3) {
            if (integer > 0) {
                sum += integer;
            }
        }
        System.out.println("Sum of positive elements of an array: " + sum);

    }
}

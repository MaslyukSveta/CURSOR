import java.util.Arrays;

public class Main {
    public static void main (String [] args){

        Integer [] task4 = new Integer[]  {1, 2, 4, 1};

        System.out.println ("Array: " + Arrays.toString (task4));

        double average = 0;
        if (task4.length > 0) {
            double sum = 0;
            for (int j = 0; j < task4.length; j++) {
                sum += task4[j];
            }
            average = sum / task4.length;
        }

        System.out.println("Average value of array elements: " + average);

    }
}

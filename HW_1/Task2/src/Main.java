import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main (String [] args){

        Integer [] task1 = new Integer[]  {2, 3, 1, 7, 11};
        System.out.println ("Array before: " + Arrays.toString (task1));
        Arrays.sort(task1, Collections.reverseOrder());
        System.out.println("Array after:  " + Arrays.toString(task1));



    }

}

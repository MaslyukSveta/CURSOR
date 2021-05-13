public class Main {
    public static void main(String [] args){

        MyList<Integer> myList = new MyList<>();

        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        System.out.println(myList);
        System.out.println("MAX number: " + myList.minElemArray());
        System.out.println("MIN number: " + myList.maxElemArray());

    }
}

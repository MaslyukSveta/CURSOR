package cursor.hw.hw2;

public class CounterObject {

    private static int objectsCount;

    public CounterObject() {
        objectsCount++;
    }

    public static int getObjectsCount() {
        return objectsCount;
    }
}

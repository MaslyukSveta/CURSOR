package cursor.hw.hw2;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);

        double area = circle.getArea();
        double radius = circle.getRadius();
        System.out.println("Radius = " + radius + "\n" + "Area = " + area);

        for (int i = 0; i < 5; i++) {
            new CounterObject();
        }
        System.out.println("Number of objects: " + CounterObject.getObjectsCount());


        Car car = new Car();

        car.start();
        car.speedUp(100);
        car.currentSpeed();
        car.speedDown(50);
        car.stop();


        Fractions fractions1 = new Fractions(3L, (short) 4);
        Fractions fractions2 = new Fractions(1L, (short) 2);
        Fractions fractions3 = new Fractions(5L, (short) 9);

        Fractions operationResult = fractions1.addition(fractions2);
        boolean comparisonResult;

        System.out.printf("%s + %s = %s\n", fractions1, fractions2, operationResult);
        operationResult = fractions2.subtraction(fractions2);
        System.out.printf("%s - %s = %s\n", fractions2, fractions2, operationResult);
        operationResult = fractions2.subtraction(fractions3);
        System.out.printf("%s - %s = %s\n", fractions2, fractions3, operationResult);
        operationResult = fractions1.multiplication(fractions3);
        System.out.printf("%s * %s = %s\n", fractions1, fractions3, operationResult);
        operationResult = fractions3.division(fractions2);
        System.out.printf("%s / %s = %s\n", fractions3, fractions2, operationResult);
        comparisonResult = fractions1.isEqual(fractions3);
        System.out.printf("%s = %s - %s\n", fractions1, fractions3, comparisonResult);
        comparisonResult = fractions2.isEqual(fractions2);
        System.out.printf("%s = %s - %s\n", fractions2, fractions2, comparisonResult);
        comparisonResult = fractions3.comparison(fractions1);
        System.out.printf("%s > %s - %s\n", fractions3, fractions1, comparisonResult);
        comparisonResult = fractions2.comparison(fractions1);
        System.out.printf("%s > %s - %s\n", fractions2, fractions1, comparisonResult);


        Money money1 = new Money(2L, (byte) 40);
        Money money2 = new Money(1L, (byte) 60);
        double doubleNumber = 2.5;
        Money moneyOperationResult = money1.add(money2);
        boolean moneyComparingResult;
        System.out.printf("%s + %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.subtract(money2);
        System.out.printf("%s - %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.divide(money2);
        System.out.printf("%s / %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.multiply(money2);
        System.out.printf("%s * %s = %s\n", money1, money2, moneyOperationResult);
        moneyOperationResult = money1.divide(doubleNumber);
        System.out.printf("%s / %s = %s\n", money1, doubleNumber, moneyOperationResult);
        moneyOperationResult = money1.multiply(doubleNumber);
        System.out.printf("%s * %s = %s\n", money1, doubleNumber, moneyOperationResult);
        moneyComparingResult = money1.equals(money2);
        System.out.printf("%s == %s: %s\n", money1, money2, moneyComparingResult);
        moneyComparingResult = money1.isHigher(money2);
        System.out.printf("%s > %s: %s\n", money1, money2, moneyComparingResult);
        moneyComparingResult = money1.isHigherOrEqual(money2);
        System.out.printf("%s >= %s: %s\n", money1, money2, moneyComparingResult);

    }
}

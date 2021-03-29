package cursor.hw.hw2;

public class Car {
    private final int maxSpeed = 210;
    //Написать класс «автомобиль», который должен уметь заводится, глушить мотор, ехать и держать необходимую скорость.
    private boolean Engine = false;
    private int currentSpeed;

    public void start() {
        if (Engine)
            System.out.println("Автомобиль уже заведен");
        else {
            Engine = true;
            System.out.println("Завести мотор");
        }
    }


    public void stop() {
        if (!Engine)
            System.out.println("Автомобиль уже заглушен");
        else {
            Engine = false;
            System.out.println("Заглушить мотор");
        }
    }

    public void speedUp(int speed) {
        if (Engine) {
            if (speed > maxSpeed || speed < 0)
                System.out.println("Невозможная скорость для этого автомобиля");
            else {
                currentSpeed += speed;
                if (currentSpeed == 0)
                    System.out.println("Машина стоит");
                else
                    System.out.println("Speed: " + currentSpeed);
            }
        }
    }

    public void currentSpeed() {
        if (Engine) {
            if (currentSpeed == 0)
                System.out.println("Машина стоит");
            else
                System.out.println("Текущая скорость: " + currentSpeed);
        }
    }

    public void speedDown(int speed) {
        if (Engine) {
            if (speed > maxSpeed || speed < 0)
                System.out.println("Невозможная скорость для этого автомобиля");
            else {
                currentSpeed -= speed;
                if (currentSpeed == 0)
                    System.out.println("Машина стоит");
                else
                    System.out.println("Speed: " + currentSpeed);
            }
        }
    }
}

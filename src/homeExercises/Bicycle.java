package homeExercises;

public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;
    private static int count = 0;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        this.count++;
    }

    public static int getCount() {
        return count;
    }
}
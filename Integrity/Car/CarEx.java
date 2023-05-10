package Integrity.Car;

public class CarEx extends CarAb /*implements Car*/{

    @Override
    public void forward() {
        System.out.println("전진");
    }

    @Override
    public void back() {
        System.out.println("후진");
    }

    @Override
    public void stop() {
        System.out.println("정지");
    }
}

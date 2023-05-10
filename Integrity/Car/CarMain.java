package Integrity.Car;

public class CarMain {
    public static void main(String argv[]){
        CarAb carAb = new CarEx(); // 의존성 주입

        /*
        의존성 주입 : 햄버거의 종류에 따라 넣는 재료를 바꾸기에 레시피를 정하는것은
                    변수로 선언하고 햄버거라는 틀은 동일함
        */
        carAb.forward();
        carAb.back();
        carAb.stop();

    }
}

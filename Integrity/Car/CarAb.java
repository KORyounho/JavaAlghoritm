package Integrity.Car;

public abstract class CarAb{ // interface와 abstract차이 ->(구현방식의 차이가 있음)
                             // interface -> 클래스랑은 다름
                             // abstract -> 는 클래스 성질
                             // 추가로 interface는 메모리를 절약하는 성질을 가짐
    public void forward(){};
    public void back(){};
    public void stop(){};
}

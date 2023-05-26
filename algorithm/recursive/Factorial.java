package algorithm.recursive;

public class Factorial{
    static int factorial(int a){
//        if(a>1){
//            return a*factorial(a-1);
//        }
//        else
//            return 1;
//
        return a>1 ? a*factorial(a-1) : 1;
    }

    public static void main(String[] args) {
        System.out.println("factorial(3) = " + factorial(3));
    }
}

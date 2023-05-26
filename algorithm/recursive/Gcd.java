package algorithm.recursive;

public class Gcd {
    public int uclidgcd(int a, int b){
        if(a<b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if(a%b==0){
            return b;
        }
        else{
            return uclidgcd(b, a%b);
        }
    }

    public static void main(String[] args) {
        Gcd gcd = new Gcd();
        System.out.println(gcd.uclidgcd(128, 48));
    }
}

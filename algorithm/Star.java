package algorithm;

public class Star { // 마름모 정복했다.
    //마름모에서 제일 중요한거! -> 띄어쓰기랑 별의 관계를 생각하면 쉽다
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++)
        {
            for(int j = 5-i; j>=1; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = 4; i>=1; i--)
        {
            for(int j = 4; j>=i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

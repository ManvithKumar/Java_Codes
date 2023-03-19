import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(Gcd(a, b));
    }
    static int Gcd(int a, int b){
        if(b == 0)
        {
            return a;
        }
         return Gcd(b,a%b);
    }
}

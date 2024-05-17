import java.util.Scanner;

public class Main {
    public static int GCD(int m, int n) {
        int quotient = m / n;
        int remainder = m % n;

        System.out.println(m + " = "+ n + "(" + quotient + ")" + " + " + remainder);
        if(remainder == 0) return n;
        else return GCD(n, remainder);
    }

    public static int LCM(int m, int n, int gcd) {
        return (m*n)/gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Euclidean Algorithm\n");
        System.out.print("Enter number no.1 : ");
        int m = scanner.nextInt();
        System.out.print("Enter number no.2 : ");
        int n = scanner.nextInt();
        if(!(m < 0 || n < 0 || m == n)) {
            System.out.println("\nProcess : ");
            int dividend = Math.max(m, n), divisor = Math.min(m, n);
            int gcd = GCD(dividend, divisor);
            System.out.println("\nGCD(" + dividend + ", " + divisor + ") = " + gcd);
            System.out.println("LCM(" + dividend + ", " + divisor + ") = " + LCM(m, n, gcd));
        }else{
            System.out.println("Please enter valid number. (no negative numbers / the two number must not be equal)");
        }
    }

}
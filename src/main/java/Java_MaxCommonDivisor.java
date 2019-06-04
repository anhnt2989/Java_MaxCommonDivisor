import java.util.Scanner;

public class Java_MaxCommonDivisor {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("No Greatest common divisor!");
        while (a != b) {
            if (a > b) a = a-b;
            else b = b-a;
        }
        System.out.println("Greatest common disisor: " + a);
    }
}

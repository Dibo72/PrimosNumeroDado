import java.util.Scanner;
public class PrimosNumeroDado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean primo = true;

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            primo = true;
            for (int j = 2; j <= (i/2); j++) {
                if (i%j==0) {
                    primo = false;
                }
                if (!primo) {
                    break;
                }
            }
            if (primo == true) {
                System.out.println(i);
            }
        }
    }
}
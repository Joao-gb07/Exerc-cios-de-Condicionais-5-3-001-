import java.util.Scanner;

public class NumeroImparOuPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int parOuImpar = scan.nextInt();

        if (parOuImpar % 2 == 0) {
            System.out.println("O número digitado é par");
        } else {
            System.out.println(" numero digitado é impar");
        }

    }
}
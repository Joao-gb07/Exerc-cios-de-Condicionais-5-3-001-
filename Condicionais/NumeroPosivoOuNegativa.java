import java.util.Scanner;

public class NumeroPosivoOuNegativa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num >= 0) {
            System.out.println("O número digitado é Positivo.");
        } else {
            System.out.println("O número digitado é Negativo.");
        }

    }
}

import java.util.Scanner;

public class VerificarIntervaldo1e10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num >= 0 && num <= 10) {
            System.out.println("O valor está entre 1 e 10");
        } else {
            System.out.println("O valor não está entre 1 e 10");
        }

    }

}

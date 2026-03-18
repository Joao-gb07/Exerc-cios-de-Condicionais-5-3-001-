import java.util.Scanner;

public class VarificarNumeroMaiorQueDez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scan.nextInt();

        if (numero > 10) {
            System.out.println("É maior que dez");
        } else {
            System.out.println("Não é maior que dez");
        }

    }
}

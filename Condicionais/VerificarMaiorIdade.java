import java.util.Scanner;

public class VerificarMaiorIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso liberado, você é maior de idade");
        } else {
            System.out.println("Acesso negado, você é menor de idade");
        }
    }
}

import java.util.Scanner;

public class VerificarAprovadoEReprovado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        float nota = scan.nextFloat();

        if (nota >= 7) {
            System.out.println("Parabéns, você foi aprovado na disciplina.");
        } else {
            System.out.println("Você foi reprovado.");
        }
    }
}

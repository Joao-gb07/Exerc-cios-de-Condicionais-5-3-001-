import java.util.Scanner;

public class VerificarMaiorQue100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da compra R$ ");
        float valorDaCompra = scan.nextFloat();

        if (valorDaCompra >= 100) {
            System.out.println("Você tem direito ao desconto nas compras");
        } else {
            System.out.println("Você não tem direito ao desconto!");
        }
    }
}

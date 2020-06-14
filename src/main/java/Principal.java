import java.util.Scanner;
/**
 * @author Daniel Teles
 * @version 1.0
 * @since 11/06/2020 - 22:49
 * @category View
 */
public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        int opcao = 0;
        do {

            System.out.println("\nDigite o primeiro numero");
            calculadora.setNumero1(scanner.nextDouble());

            System.out.println("Digite o segundo numero");
            calculadora.setNumero2(scanner.nextDouble());

            System.out.println("1-somar\n2-subtrair\n3-multiplicar\n4-dividir\n5-todos\n0-sair");
            System.out.println("Digite o numero da operação desejada:");
            opcao = scanner.nextInt();

            System.out.println(calculadora.verificarOperacao(opcao));

        } while(opcao != 0);
    }
}

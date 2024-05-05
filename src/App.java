import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        char operacao;
        double num1, num2;

        do {
            System.out.println(
                    "Digite a operação que deseja realizar:\n'+' Soma\n'-' Subtração\n'*' Multiplicação\n'/' Divisão\n'^' Potência\n'R' Raiz quadrada");
            operacao = scanner.next().toUpperCase().charAt(0);
            switch (operacao) {
                case '+':
                    System.out.println("Digite o primero número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    calculadora.soma(num1, num2);
                    break;
                case '-':
                    System.out.println("Digite o primero número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    calculadora.subtracao(num1, num2);
                    break;
                case '*':
                    System.out.println("Digite o primero número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    calculadora.multiplicacao(num1, num2);
                    break;
                case '/':
                    System.out.println("Digite o primero número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    calculadora.divisao(num1, num2);
                    break;
                case '^':
                    System.out.println("Digite o primero número:");
                    num1 = scanner.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextDouble();
                    calculadora.potencia(num1, num2);
                    break;
                case 'R':
                    System.out.println("Digite o número:");
                    num1 = scanner.nextDouble();
                    calculadora.raiz(num1);
                    break;
                default:
                    break;
            }
            System.out.println();

        } while (operacao != 'Q');

        scanner.close();
    }
}

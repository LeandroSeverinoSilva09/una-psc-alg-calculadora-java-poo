public class Calculadora {

    public void soma(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public void subtracao(double num1, double num2) {
        System.out.println(num1 - num2);
    }

    public void multiplicacao(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    public void divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("impossivél realizar divisão por zero");
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void potencia(double base, double potencia) {
        if (potencia == 0) {
            System.out.println('1');
        } else {
            System.out.println(Math.pow(base, potencia));
        }
    }

    public void raiz(double num) {
        if (num < 0) {
            System.out.println("Não existe raiz de número negativo");
        } else {
            System.out.println(Math.sqrt(num));
        }
    }
}

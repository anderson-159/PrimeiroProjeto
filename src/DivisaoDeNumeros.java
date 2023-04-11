import java.util.Scanner;

public class DivisaoDeNumeros {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro número da operação");
            int num1 = sc.nextInt();

            System.out.println("Digite o segundo número da operação");
            int num2 = sc.nextInt();
            int resultado = num1 / num2;

            System.out.println("O resultado da divisão é: " + resultado);

        } catch (ArithmeticException e) {
            System.err.println("Houve uma exceção de divisão por zero! by");
        }

        catch (NumberFormatException e) {
            System.err.println("Houve uma exceção de número inválido! by Marcel Tanuri");
        }

        finally{
            System.out.println("Obrigado, até breve");
        }

    }

}
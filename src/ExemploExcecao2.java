package br.com.ada.f1rst973.primeiroprojeto.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploExcecao2 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.print("Informe o primeiro numero ");
            int numero1 = scanner.nextInt();

            System.out.print("Informe o segundo numero ");
            int numero2 = scanner.nextInt();
            int resultado = numero1 / numero2;
            System.out.printf("O resultado da divisão é: " + resultado);
        }

        // tratamento de exceções
        catch(ArithmeticException arithmeticException)
        {
            System.err.printf("\nExceção: %s", arithmeticException);
            System.out.println("Não divida por zero!");
        }
        catch(InputMismatchException inputMismatchException)
        {
            System.err.printf("\nExceção %s", inputMismatchException);
            System.out.println("O valor informado nao é numerico!");
        }

        finally
        {
            System.out.println("Finaliza metodo main!");
        }
    }
}


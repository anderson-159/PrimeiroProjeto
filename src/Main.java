import java.util.Scanner;

//Programação Orientada a Objetos
//Surgiu da necessidade de se "pensar diferente" na hora de se programar
//Novas nomenclaturas:
// -> Dados/Variáveis passam a ser chamados de Atributos
// -> Funções passam a ser chamados de Métodos
public class Main {
    public static void main(String[] args) {

        // Instanciação dos objetos -> é a forma como eu vou
        //"usar" a classe
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        Scanner leia = new Scanner (System.in);

        aluno1.matricula = 1001;
        aluno1.nome = "Igor";
        // Entrada de dados no objeto através do teclado, ou
        // seja, via usuário. Reparar na entrada da nota
        // pelo objeto aluno1
        System.out.println("Informe a primeira nota:");
        aluno1.nota1 = leia.nextDouble();

        //aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.0;
        aluno1.nota3 = 6.0;
        aluno1.nota4 = 4.0;

        // Execução do método calcularMedia, que é do tipo
        // void, ou seja, não tem "retorno" para dentro do
        // programa
        aluno1.calcularMedia();
        // Execução do método calcularMedia2, que é do tipo
        // double, necessitando de retorno para dentro do código
        // O retorno dele será jogado na tela através do
        // System.out.println
        System.out.println("Aluno: " + aluno1.nome +
                "\nMédia: " + aluno1.calcularMedia2());

    }
}
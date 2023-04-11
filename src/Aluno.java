// A classe Aluno deve armazenar:
// -> Nome, Matrícula e 4 Notas
// A classe Aluno também deve calcular a sua média aritmética
public class Aluno {
    // Definição dos atributos, todos eles são públicos
    // para que a classe main possa "enxergá-los"
    public String nome;
    public int matricula;
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;
    // Este método, por ser do tipo void, não retorna
    // nada para dentro do programa. Apenas executa as linhas
    // de código.
    public void calcularMedia(){
        double media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Aluno: " + nome + "\nMédia:"+ media);
    }
    // Este método, por ser do tipo double, faz um retorno
    // para a classe com o seu "resultado"
    public double calcularMedia2(){
        double media = (nota1+nota2+nota3+nota4)/4;
        return media;
    }
}
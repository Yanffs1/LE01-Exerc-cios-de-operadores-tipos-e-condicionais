public class Exercicio16 {
    /*
     * 16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média aritmética. 
     * Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83
    */

    public static void ex16(){
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("\nExercicio 16\n");
        System.out.print("informe o valor da primeira nota: ");
        nota1 = Leitor.lerDouble();

        System.out.print("informe o valor da segunda nota: ");
        nota2 = Leitor.lerDouble();

        System.out.print("informe o valor da terceira nota: ");
        nota3 = Leitor.lerDouble();

        media = (nota1 + nota2 + nota3)/3;

        System.out.println(String.format("A media das notas informadas são: %.2f",media));

    }
}

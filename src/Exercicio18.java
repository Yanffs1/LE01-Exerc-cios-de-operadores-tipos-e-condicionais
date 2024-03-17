public class Exercicio18 {
    /*
     * 18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica. 
     * Média harmônica = 31 + 1 + 1 nota1 nota2 nota3
     * Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8 Média: 7.37
    */

    public static void ex18() {
        double nota1;
        double nota2;
        double nota3;
        
        double mediaHarmonica;

        System.out.println("\nExercicio 16\n");
        System.out.print("informe o valor da primeira nota: ");
        nota1 = Leitor.lerDouble();

        System.out.print("informe o valor da segunda nota: ");
        nota2 = Leitor.lerDouble();

        System.out.print("informe o valor da terceira nota: ");
        nota3 = Leitor.lerDouble();

        
        mediaHarmonica = 3/(1/nota1 + 1/nota2 + 1/nota3);

        System.out.println(String.format("A media das notas informadas são: %.2f",mediaHarmonica));
    }

}

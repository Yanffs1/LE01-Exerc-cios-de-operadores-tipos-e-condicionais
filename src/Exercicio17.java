public class Exercicio17 {
    /*
     * 17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes acada nota e retorne a sua média ponderada. 
     * Veja o cálculo da média ponderada:Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3peso1 + peso2 + peso3
     * Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2 Média ponderada = 8.25
    */

    public static void ex17() {
        double nota1;
        double nota2;
        double nota3;
        double peso1;
        double peso2;
        double peso3;
        double media;

        System.out.println("\nExercicio 16\n");
        System.out.print("informe o valor da primeira nota: ");
        nota1 = Leitor.lerDouble();

        System.out.print("informe o valor da segunda nota: ");
        nota2 = Leitor.lerDouble();

        System.out.print("informe o valor da terceira nota: ");
        nota3 = Leitor.lerDouble();

        System.out.print("informe o valor do primeiro peso: ");
        peso1 = Leitor.lerDouble();

        System.out.print("informe o valor do primeiro peso: ");
        peso2 = Leitor.lerDouble();

        System.out.print("informe o valor do primeiro peso: ");
        peso3 = Leitor.lerDouble();

        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3))/(peso1 + peso2 + peso3);

        System.out.println(String.format("A media das notas informadas são: %.2f",media));
    }
}

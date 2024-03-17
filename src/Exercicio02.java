public class Exercicio02 {
    /*
     * 2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o resultado da sua soma.
    */

    public static void ex2() {
        int valorA = 0;
        int valorB = 0;

        System.out.println("Exercicio 2");
        System.out.print("\ninforme o primeiro número: ");
        valorA = Leitor.lerInt();

        System.out.print("\ninforme o segundo número: ");
        valorB = Leitor.lerInt();

        System.out.println("O resultado da soma dos dois valores é " + (valorA + valorB));
    }

}

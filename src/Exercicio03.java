public class Exercicio03 {
    /*
     * 3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nas variáveis A e B e informe qual deles é o maior. 
     *Caso os números sejam iguais informarao usuário que a sequência de números informados é inválida.
    */

    public static void ex3() {
        int valorA;
        int valorB;

        System.out.println("Exercício 3\n");
        System.out.println("Informe o valor do primeiro número: ");
        valorA = Leitor.lerInt();

        System.out.println("Informe o valor do segundo número: ");
        valorB = Leitor.lerInt();     
        
        if (valorA > valorB) {
            System.out.println("O valor " + valorA + " é maior que " + valorB );
        } else if (valorB > valorA) {
            System.out.println("O valor " + valorB + " é maior que " + valorA );
        } else {
            System.out.println("O sequencia informada é inválida");
        }
    }

}

public class Exercicio08 {
    /*
    * 8. Escreva um algoritmo que leia um número e mostre uma mensagem caso este número seja maior ou igual a 50, outra se ele for menor que 50.
    */

    public static void ex8(){
        int numero;

        System.out.println("Exercício 08\n");
        System.out.print("Informe um número: ");
        numero = Leitor.lerInt();

        if (numero >= 50) {
            System.out.println("O valor é maior ou igual a 50");
        } else {
            System.out.println("O valor informado é menor que 50");
        }
    }
}

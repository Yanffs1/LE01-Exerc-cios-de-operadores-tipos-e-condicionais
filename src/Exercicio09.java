public class Exercicio09 {
    /*
    * 9. Leia dois números nas variáveis A e B e identifique se os valores são iguais ou diferentes. 
    Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.Caso sejam diferentes, 
    informe que são diferentes e qual número é o maior.
    */

    public static void ex9() {
        int a;
        int b;

        System.out.println("\nExercicio 09\n");
        System.out.print("Informe o valor de A: ");
        a = Leitor.lerInt();

        System.out.print("Informe o valor de B: ");
        b = Leitor.lerInt();

        if (a == b) {
            System.out.println("Os valores são iguais!");
        } else if (a > b) {
            System.out.println("O valor de A: " + a + " é maior que o valor de B: " + b);
        } else {
            System.out.println("O valor de B: " + b + " é maior que o valor de A: " + a);
        }
        
    }

}

public class Exercicio13 {
    /*
    * 13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de operador em outra variável do tipo CARACTERE. 
    * Imprima o resultado da operaçãode A por B se o operador aritmético for válido; 
    * caso contrário deve ser impresso umamensagem de operador não definido. Tratar erro de divisão por zero.
    */

    public static void ex13() {
        float valorA;
        float valorB;
        char operador;

        System.out.println("\nExercicio 13\n");
        System.out.print("Informe o valor de A: ");
        valorA = Leitor.lerFloat();

        System.out.print("Informe o valor de B: ");
        valorB = Leitor.lerFloat();

        System.out.print("Informe o operador: ");
        operador = Leitor.lerChar();

        switch (operador) {
            case '+':
                System.out.println(valorA + " + " + valorB + " = " + (valorA + valorB));
                break;
            case '-':
                System.out.println(valorA + " - " + valorB + " = " + (valorA - valorB));
                break;
            case '*':
                System.out.println(valorA + " * " + valorB + " = " + (valorA * valorB));
                break;
            case '/':
                if (valorB != 0) {
                    System.out.println(valorA + " / " + valorB + " = " + (valorA / valorB));
                } else {
                    System.out.println("Valor invalido, não é possivel efetuar divião por 0");
                }
                break;
            default:
                System.out.println("Operador não definido");
                break;
        }
    }

}

public class Exercicio01 {
    /*
    1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem “Número maior do que 10!”, 
    caso este número seja maior, ou “Número menor ou igual a 10!”, caso este número seja menor ou igual.
    */

    public static void ex1() {
        int valor;

        System.out.print("informe Um valor: ");
        valor = Leitor.lerInt();

        if (valor > 10) {

            System.out.println("O valor informado " + valor + " é maior que 10!");
        } else {
            System.out.println("O valor informado " + valor + " é menor ou igual a 10!"); 
        }

    }
}

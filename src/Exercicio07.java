public class Exercicio07 {
    /*
    * 7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número está no intervalo entre 100 e 200. 
    Caso o número esteja fora do intervalo o usuário também deverá ser informado.
    */

    public static void ex7() {
        int numero;

        System.out.println("Exercicio 7\n");
        System.out.print("informe um numero :");
        numero = Leitor.lerInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número informado " + numero + " se encontra no intervalo ente 100 e 200");
        } else {
            System.out.println("O número informado " + numero + " não se encontra no intervalo ente 100 e 200");
        }
    }
}

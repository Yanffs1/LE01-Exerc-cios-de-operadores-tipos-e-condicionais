public class Exercicio10 {
    /*
    *10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. 
    Caso o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Númeroinválido!”. 
    */

    public static void ex10() {
        int valor;
        
        System.out.println("\nExeercicio 10\n");
        System.out.print("Informe um valor dentro do intervalo de 1 a 5: ");
        valor = Leitor.lerInt();

        if (valor >= 1 && valor <= 5) {
            System.out.println("O numero " + valor + " se encontra dentro do intervalo de 1 a 5");
        } else {
            System.out.println("O numero " + valor + " não esta dentro do intervalo de 1 a 5");
        }


    }
}

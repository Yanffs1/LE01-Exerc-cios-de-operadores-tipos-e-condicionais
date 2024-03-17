public class Exercicio11 {
    /*11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em ordem crescente.*/

    public static void ex11() {
        int valorA;
        int valorB;
        int valorC;
        int temp = 0;

        System.out.println("\nExercicio 11\n");
        System.out.print("Informe o valor da primeira variavel: ");
        valorA = Leitor.lerInt();
         
        System.out.print("Informe o valor da segunda variavel: ");
        valorB = Leitor.lerInt();

        System.out.print("Informe o valor da terceira variavel: ");
        valorC = Leitor.lerInt();

        if (valorA > valorB ) {
            temp = valorA;
            valorA = valorB;
            valorB = temp;
        
        } 
        if (valorB > valorC) {
            valorB = temp;
            valorC = valorB;
            valorB = temp;
        }

        System.out.println("Os valores em ordem cresente são " + valorA + ", " + valorB + ", " + valorC);

    }
}

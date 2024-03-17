public class Exercicio04 {
    
    /*
    *4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos
    */

    public static void ex4() {
        int valorA;
        int valorB;

        System.out.println("Exercício 4\n");
        System.out.println("Informe o valor do primeiro número: ");
        valorA = Leitor.lerInt();

        System.out.println("Informe o valor do segundo número: ");
        valorB = Leitor.lerInt();     
        
        System.out.println("\nSoma:  " + valorA + " + " + valorB + " = " + (valorA + valorB)  );

        System.out.println("\nSubtração:  " + valorA + " - " + valorB + " = " + (valorA - valorB)  );

        System.out.println("\nMultiplicação:  " + valorA + " x " + valorB + " = " + (valorA * valorB)  );

        System.out.println("\nDivisão:  " + valorA + " / " + valorB + " = " + (valorA / valorB)  );
        
    }

}

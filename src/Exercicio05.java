public class Exercicio05 {
    /*
     5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor da variável A passe a ser o valor da variável B
     e o valor da variável B passe a ser o valor da variável A. Apresentar uma mensagem com o valor original de cada variável e 
     outra com os valores trocados.
    */

    public static void ex5() {
        String variavelA; 
        String variavelB;
        String substitutoA;
        String substitutoB;

        System.out.println("Exercício 5");

        System.out.println("Informe os valores de A: ");
        variavelA = Leitor.lerString();

        System.out.println("Informe os valores de B: ");
        variavelB = Leitor.lerString();

        substitutoA = variavelA;
        substitutoB = variavelB;
        variavelA = variavelB;
        variavelB = substitutoA;

        System.out.println("Os valores originais de A são " + substitutoA + " e de B " + substitutoB + 
        " e os valores atuais são A:" + variavelA + " e B:" + variavelB);


    }


}

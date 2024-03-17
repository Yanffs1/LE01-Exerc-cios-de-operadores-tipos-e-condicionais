public class Exercicio14 {
    /*
    14. A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão Aritmética (PA). Nesta fórmula, 
    temos que an é o termo de ordem n (n-ésimo termo),r é a razão e a1 é o primeiro termo da Progressão Aritmética. 
    Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética. 
    Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28
    */

    public static void ex14() {
        double a1;
        double n;
        double r;
        double an;

        System.out.print("\nExercicio 14\n");
        System.out.println("Informe o valor de a1: ");
        a1 = Leitor.lerDouble();

        System.out.println("Informe o valor de n: ");
        n = Leitor.lerDouble();

        System.out.println("Informe o valor de r: ");
        r = Leitor.lerDouble();

        an = a1 + (n - 1) * r;
        
        System.out.println("O resultado da progressão aritimética é: " + an);
        
        
    }
}


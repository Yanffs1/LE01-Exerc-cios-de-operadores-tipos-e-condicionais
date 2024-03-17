public class Exercicio19 {
    /*
     * 19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu volume calculado de acordo com a seguinte fórmula: 
     * volume = 3.14 * raio^2 * altura; Exemplo: raio = 10, altura = 15. Volume = 4710
    */

    public static void ex19() {
        double raio;
        double altura;
        double volume;

        System.out.println("\nExercicio 19\n");
        System.out.println("Informe o valor do raio: ");
        raio = Leitor.lerDouble();
        System.out.println("Informe o valor da altura: ");
        altura = Leitor.lerDouble();
        
        volume = 3.14 * Math.pow(raio, 2) * altura;

        System.out.println("O valor do volume é igual a: " + volume);
    }
}

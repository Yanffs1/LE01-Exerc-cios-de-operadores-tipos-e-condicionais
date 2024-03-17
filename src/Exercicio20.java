public class Exercicio20 {
    /*
     * 20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem, 
     * utilizando um automóvel que faz 12km por litro e considerando que são fornecidos o tempo em hora e a velocidade média da viagem.
    */

    public static void ex20() {
        double tempo;
        double velMed;
        double distancia;
        double litros;

        System.out.println("\nExercicio 20!!!\n");
        System.out.print("Informe o tempo decorrido: ");
        tempo = Leitor.lerDouble();
        System.out.print("Informe a velocidade media atingida durante a viagem: ");
        velMed = Leitor.lerDouble();

        distancia = tempo * velMed;
        litros = distancia / 12;

        System.out.println("A distancia percorrida durante a viagem foi de: " + litros);
    }
}

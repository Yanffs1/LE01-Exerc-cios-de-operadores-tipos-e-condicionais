public class Exercicio06 {
    /*
    * 6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:
    F = (9 * C + 160) / 5
    */

    public static void ex6() {
        float celcius;
        float fahrenheit;

        System.out.println("Exercício 6");
        System.out.println("informe o valor da temperatura em graus Celcius");
        celcius = Leitor.lerFloat();

        fahrenheit = (9 * celcius + 160) / 5;

        System.out.println("A temperatura " + celcius +  " convertida em graus Fahrenheit é " + fahrenheit);


    }
}

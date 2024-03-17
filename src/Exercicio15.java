import java.lang.Math; 

public class Exercicio15 {
    /*
     * 15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,y2), 
     * calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz(((x2 - x1)2) + ((y2 - y1)2)). 
     * Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03
    */

    public static void ex15() {
        double x1;
        double y1;
        double x2;
        double y2;
        double d;
        
        System.out.println("E\nxercicio 15\n");
        System.out.print("Informe o primeiro valor de p1: ");
        x1 = Leitor.lerDouble();
        System.out.print("Informe o segundo valor de p1: ");
        y1 = Leitor.lerDouble();
        System.out.print("Informe o primeiro valor de p2: ");
        x2 = Leitor.lerDouble();
        System.out.print("Informe o segundo valor de p2: ");
        y2 = Leitor.lerDouble();

        d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println(String.format("A distancia entre P1(%.2f, %.2f) e P2(%.2f, %.2f) é igual a Distancia: %.2f", x1, x2, y1, y2, d));
    }
}

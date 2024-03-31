import java.util.Scanner;
public class Main1 {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float resultado = 0;

        System.out.println("Digite o primeiro valor:");
        float a = leitor.nextFloat();

        System.out.println("Digite o segundo valor:");
        float b = leitor.nextFloat();

        System.out.println("--Escolha a operação--\n1: +\n2: -\n3: x\n4: /");
        int x = leitor.nextInt();


        switch (x) {
            case 1:
                resultado = Calculadora.soma(a, b);
                break;
            case 2:
                resultado = Calculadora.sub(a, b);
                break;
            case 3:
                resultado = Calculadora.mult(a, b);
                break;
            case 4:
                resultado = Calculadora.div(a, b);
                break;
        }
        System.out.println("Resultado = " + resultado);
        leitor.close();
    }
}

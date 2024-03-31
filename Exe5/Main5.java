package Exe5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<Carro> Carros = new ArrayList<>();
        int x = -1;

        while (x != 3) {
            System.out.println("\n==Bem vindo ao CarEvent==\n");
            System.out.println("1 -Cadastrar veiculo\n2 - Velocidade\n3 - Sair");
            x = Integer.parseInt(leitor.nextLine());
            switch (x) {
                case 1:
                    Cadastrar(Carros);
                    break;
                case 2:
                    controlarVelocidade(Carros);
                    break;
                case 3:
                    System.out.println("Até a Proxima!!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void Cadastrar(List<Carro> Carros) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--Vamos Cadastrar seu carro--");
        System.out.println("Marca:");
        String marca = leitor.nextLine();
        System.out.println("Modelo:");
        String modelo = leitor.nextLine();
        System.out.println("Ano:");
        int ano = Integer.parseInt(leitor.nextLine());
        System.out.println("Velocidade:");
        float velocidade = Float.parseFloat(leitor.nextLine());

        Carro newCarro = new Carro(marca, modelo, ano, velocidade);
        Carros.add(newCarro);

        System.out.println("==Carro Cadastrado==");
        System.out.println("Marca:"+ newCarro.getMarca());
        System.out.println("Modelo:"+ newCarro.getModelo());
        System.out.println("Ano:"+ newCarro.getAno());
        System.out.println("Velocidade atual:" + newCarro.getVelocidade());
    }
    public static void controlarVelocidade(List<Carro> carros) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número do carro:");
        int indice = leitor.nextInt();
        if (indice >= 0 && indice < carros.size()) {
            Carro carro = carros.get(indice);
            System.out.println("1 - Acelerar\n2 - Freiar");
            int opcao = leitor.nextInt();
            if (opcao == 1) {
                carro.acelerar();
            } else if (opcao == 2) {
                carro.freiar();
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.println("Velocidade atual do carro "+carro.getMarca() +" "+ carro.getModelo() + ": " + carro.getVelocidade());
        } else {
            System.out.println("Carro não encontrado!");
        }
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        ArrayList<Pizza> menuPizzas = criarMenuPizzas();

        Pedido pedido = new Pedido();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 5) {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    exibirMenuPizzas(menuPizzas);
                    adicionarPizzaAoPedido(pedido, menuPizzas, scanner);
                    break;
                case 2:
                    cancelarPedido(pedido);
                    break;
                case 3:
                    exibirRelatorioPedido(pedido);
                    break;
                case 4:
                    atualizarEnderecoEntrega(pedido, scanner);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

    }

    public static ArrayList<Pizza> criarMenuPizzas() {
        ArrayList<Pizza> menuPizzas = new ArrayList<>();

        // Adicionar pizzas pré-cadastradas
        menuPizzas.add(new Pizza("Margherita", 25.0, new String[]{"Molho de tomate", "Muçarela", "Manjericão"}));
        menuPizzas.add(new Pizza("Calabresa", 30.0, new String[]{"Molho de tomate", "Muçarela", "Calabresa"}));
        menuPizzas.add(new Pizza("Frango com Catupiry", 35.0, new String[]{"Molho de tomate", "Muçarela", "Frango", "Catupiry"}));

        return menuPizzas;
    }

    public static void exibirMenu() {
        System.out.println("\n===== Menu =====");
        System.out.println("1. Adicionar Pizza ao Pedido");
        System.out.println("2. Cancelar Pedido");
        System.out.println("3. Exibir Relatório do Pedido");
        System.out.println("4. Atualizar Endereço de Entrega");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void exibirMenuPizzas(ArrayList<Pizza> menuPizzas) {
        System.out.println("\n=== Menu de Pizzas ===");
        for (int i = 0; i < menuPizzas.size(); i++) {
            Pizza pizza = menuPizzas.get(i);
            System.out.println((i + 1) + ". " + pizza.getNome() + " - R$" + pizza.getValor());
        }
    }

    public static void adicionarPizzaAoPedido(Pedido pedido, ArrayList<Pizza> menuPizzas, Scanner scanner) {
        System.out.print("Escolha o número da pizza desejada: ");
        int numeroPizza = scanner.nextInt();

        if (numeroPizza >= 1 && numeroPizza <= menuPizzas.size()) {
            Pizza pizzaSelecionada = menuPizzas.get(numeroPizza - 1);
            pedido.adicionarPizza(pizzaSelecionada);
            System.out.println("Pizza " + pizzaSelecionada.getNome() + " adicionada ao pedido.");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void cancelarPedido(Pedido pedido) {
        pedido.cancelarPedido();
        System.out.println("Pedido cancelado.");
    }

    public static void exibirRelatorioPedido(Pedido pedido) {
        pedido.gerarRelatorio();
    }

    public static void atualizarEnderecoEntrega(Pedido pedido, Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.print("Digite o novo endereço de entrega: ");
        String novoEndereco = scanner.nextLine();
        pedido.setEnderecoEntrega(novoEndereco);
        System.out.println("Endereço de entrega atualizado com sucesso.");
    }
}

import java.util.ArrayList;
import java.util.Scanner;


public class Main7 {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Gerar Relatório de Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque);
                    break;
                case 2:
                    atualizarProduto(estoque);
                    break;
                case 3:
                    removerProduto(estoque);
                    break;
                case 4:
                    gerarRelatorio(estoque);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    public static void adicionarProduto(ArrayList<Produto> estoque) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Adicionar Produto ===");

        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();

        System.out.print("Código do Produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Quantidade em Estoque: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preço do Produto: ");
        double preco = scanner.nextDouble();

        Produto produto = new Produto(nome, codigo, quantidade, preco);
        estoque.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    public static void atualizarProduto(ArrayList<Produto> estoque) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Atualizar Produto ===");

        System.out.print("Digite o código do produto que deseja atualizar: ");
        int codigo = scanner.nextInt();

        Produto produto = buscarProdutoPorCodigo(estoque, codigo);

        if (produto != null) {
            System.out.print("Nova quantidade em Estoque: ");
            int novaQuantidade = scanner.nextInt();
            produto.setQuantidade(novaQuantidade);

            System.out.print("Novo preço do Produto: ");
            double novoPreco = scanner.nextDouble();
            produto.setPreco(novoPreco);

            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public static void removerProduto(ArrayList<Produto> estoque) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Remover Produto ===");

        System.out.print("Digite o código do produto que deseja remover: ");
        int codigo = scanner.nextInt();

        Produto produto = buscarProdutoPorCodigo(estoque, codigo);

        if (produto != null) {
            estoque.remove(produto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public static Produto buscarProdutoPorCodigo(ArrayList<Produto> estoque, int codigo) {
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public static void gerarRelatorio(ArrayList<Produto> estoque) {
        System.out.println("\n=== Relatório de Estoque ===");
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio!");
        } else {
            double valorTotalEstoque = 0;
            for (Produto produto : estoque) {
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Quantidade em Estoque: " + produto.getQuantidade());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("Valor Total em Estoque: " + produto.calcularValorTotal());
                System.out.println("-----------------------");
                valorTotalEstoque += produto.calcularValorTotal();
            }
            System.out.println("Valor Total do Estoque: " + valorTotalEstoque);
        }
    }
}
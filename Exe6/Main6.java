import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Agenda minhaAgenda = new Agenda();
        Scanner leitor = new Scanner(System.in);
        int x = -1;

        while (x != 4) {
            System.out.println("1 - Adicionar contato\n2 - Buscar contato\n3 - Mostrar lista de contatos\n4 - Sair");
            x = Integer.parseInt(leitor.nextLine());

            switch (x) {
                case 1:
                    cadastrar(minhaAgenda);
                    break;
                case 2:
                    buscar(minhaAgenda);
                    break;
                case 3:
                    listar(minhaAgenda);
                    break;
                case 4:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void cadastrar(Agenda minhaAgenda) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do contato:");
        String nome = leitor.nextLine();
        System.out.println("Digite o telefone do contato:");
        String telefone = leitor.nextLine();

        minhaAgenda.adicionarContato(nome, telefone);
    }

    public static void buscar(Agenda minhaAgenda) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do contato que deseja buscar:");
        String nome = leitor.nextLine();

        Contato contatoEncontrado = minhaAgenda.buscarContatoPorNome(nome);
        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado: " + contatoEncontrado.getNome() + " - " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public static void listar(Agenda minhaAgenda) {
        System.out.println("Lista de contatos:");
        for (Contato contato : minhaAgenda.getContatos()) {
            System.out.println(contato.getNome() + " - " + contato.getTelefone());
        }
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        List<Jogador> perfil = new ArrayList<>();

        int x = -1;

        while (x != 3) {
            System.out.println("--Bem vindo ao TrueWorld--");
            System.out.println("1-Criar Perfil--\n2-Atualizar Informações--\n3-Sair--");
            x = leitor.nextInt();

            switch (x) {
                case 1:
                    CriarPerfil(perfil);
                    break;
                case 2:
                    Atualizar(perfil);
                    break;
                case 3:
                    System.out.println("Adeus Aventureiro!!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void CriarPerfil(List<Jogador> perfil) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("--Vamos criar seu personagem--");
        System.out.println("Nome:");
        String nome = leitor.nextLine();

        Jogador novoJogador = new Jogador(nome, 0, 0);
        perfil.add(novoJogador);

        System.out.println("\n--Perfil criado--");
        System.out.println("Nome:" + novoJogador.getNome());
        System.out.println("Nivel *" + novoJogador.getNivel()+"*");
        System.out.println("Pontuação [" + novoJogador.getPontuacao()+ "]\n");
    }

    public static void Atualizar(List<Jogador> perfil){
        Scanner leitor = new Scanner(System.in);

        System.out.println("--Vamos atualizar seu personagem--");
        System.out.println("Digite o nome de seu personagem:");
        String aux = leitor.nextLine();
        Jogador jogador = encontrarContaPorNumero(perfil, aux);
        if (jogador != null) {
            System.out.println("Quantos Monstros pequenos derrotou?");
            int p = Integer.parseInt(leitor.nextLine());
            System.out.println("Quantos Monstros medios derrotou?");
            int m = Integer.parseInt(leitor.nextLine());
            System.out.println("Quantos Monstros grandes derrotou?");
            int g = Integer.parseInt(leitor.nextLine());
            jogador.pontuacao(p, m, g);
            System.out.println("Perfil atualizado:");
            System.out.println("Nome:" + jogador.getNome());
            System.out.println("Nivel *" + jogador.getNivel()+"*");
            System.out.println("Pontuação [" + jogador.getPontuacao()+ "]\n");
        } else {
            System.out.println("Jogador não encontrado!");
        }
    }

    public static Jogador encontrarContaPorNumero(List<Jogador> perfil, String aux) {
        for (Jogador jogador : perfil) {
            if (jogador.getNome().equals(aux)) {
                return jogador;
            }
        }
        return null;
    }
}
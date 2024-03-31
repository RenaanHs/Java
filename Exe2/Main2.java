import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        List<livro> livros = new ArrayList<>();

        System.out.println("Quantos livros quer Registrar?");
        int num = Integer.parseInt(leitor.nextLine());
        for (int i = 0; i < num; i++) {
            System.out.println("Titulo: ");
            String titulo = leitor.nextLine();

            System.out.println("Autor: ");
            String autor = leitor.nextLine();

            System.out.println("Ano");
            int ano = Integer.parseInt(leitor.nextLine());

            livros.add(new livro(i+1,titulo, autor, ano));
        }
        System.out.println("Digite o codigo do livro desejado:");
        int codx = leitor.nextInt();
        for (livro livro : livros) {
            if (livro.cod == codx) {
                System.out.println("Livro: " + livro.titulo + ", Autor: " + livro.autor + ", Ano: " + livro.ano);
            }
        }
        leitor.close();
    }
}

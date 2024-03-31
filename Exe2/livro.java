import java.util.Scanner;
public class livro {
    int cod;
    String titulo;
    String autor;
    int ano;

    livro(int cod, String titulo,String autor, int ano){
        this.cod = cod;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    Scanner leitor = new Scanner(System.in);

}

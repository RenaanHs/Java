public class Jogador {
    private String nome;
    private int nivel;
    private int pontuacao;

    Jogador(String nome, int nivel, int pontuacao){
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = pontuacao;
    }

    void pontuacao(int p, int m, int g){
        int pont = getPontuacao() + (p*5) + (m*7) + (g*10);
        setPontuacao(pont);
        nivel();
    }

    void nivel(){
        this.nivel = getPontuacao() / 100;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }
}
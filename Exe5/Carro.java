package Exe5;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    Carro(String marca, String modelo, int ano, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }


    public void acelerar() {
        this.velocidade += 10;
    }

    public void freiar() {
        this.velocidade -= 10;
        if (this.velocidade < 0) {
            this.velocidade = 0;
        }
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getVelocidade() {
        return velocidade;
    }

}

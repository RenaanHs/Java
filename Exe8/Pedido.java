import java.util.ArrayList;

public class Pedido {
    private ArrayList<Pizza> pizzas;
    private String enderecoEntrega;
    private double valorTotal;

    public Pedido() {
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = "";
        this.valorTotal = 0.0;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
        valorTotal += pizza.getValor();
    }

    public void removerPizza(Pizza pizza) {
        pizzas.remove(pizza);
        valorTotal -= pizza.getValor();
    }

    public void cancelarPedido() {
        pizzas.clear();
        valorTotal = 0.0;
        enderecoEntrega = "";
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório do Pedido ===");
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("Total de Pizzas: " + pizzas.size());
        System.out.println("Valor Total: R$" + valorTotal);
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }
}

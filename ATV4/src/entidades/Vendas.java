package entidades;

public class Vendas {

    public double valorVenda;

    public Vendas(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vendas{");
        sb.append("valorVenda=").append(valorVenda);
        sb.append('}');
        return sb.toString();
    }
}

package entidades;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {

    private List<Vendedor> vendedores = new ArrayList<>();
    private double comissaoGerente;
    private String setor;
    private double comissaoTotalGerente;

    public Gerente(int idade, String nome, String cpf, String cargo, double salario, double comissaoGerente, String setor, double comissaoTotalGerente) {
        super(idade, nome, cpf, cargo, salario);
        this.comissaoGerente = comissaoGerente;
        this.setor = setor;
        this.comissaoTotalGerente = comissaoTotalGerente;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public double getComissaoGerente() {
        return comissaoGerente;
    }

    public void setComissaoGerente(double comissaoGerente) {
        this.comissaoGerente = comissaoGerente;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getComissaoTotalGerente() {
        for(int i = 0; i < vendedores.size(); i++){
            comissaoTotalGerente += vendedores.get(i).totalVendas * comissaoGerente;
        }
        return comissaoTotalGerente;
    }

    public void setComissaoTotalGerente(double comissaoTotalGerente) {
        this.comissaoTotalGerente = comissaoTotalGerente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Gerente{");
        sb.append("salario=").append(salario);
        sb.append(", cargo='").append(getCargo()).append('\'');
        sb.append(", salario=").append(getSalario());
        sb.append(", vendedores=").append(vendedores);
        sb.append(", comissaoGerente=").append(comissaoGerente);
        sb.append(", setor='").append(setor).append('\'');
        sb.append(", comissaoTotalGerente=").append(comissaoTotalGerente);
        sb.append(", idade=").append(getIdade());
        sb.append(", nome='").append(getNome()).append('\'');
        sb.append(", cpf='").append(getCpf()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

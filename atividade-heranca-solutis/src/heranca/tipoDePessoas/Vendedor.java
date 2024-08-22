package heranca.tipoDePessoas;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    // Construtor padrão
    public Vendedor() {
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto); // Chama o construtor da superclasse
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioComComissao = getSalarioBase() + (valorVendas * (comissao / 100));
        return salarioComComissao - (salarioComComissao * (getImposto() / 100));
    }

    @Override
    public String toString() {
        return "Vendedor {" +
                "nome = '" + getNome() + '\'' +
                ", endereco = '" + getEndereco() + '\'' +
                ", telefone = '" + getTelefone() + '\'' +
                ", codigoSetor = " + getCodigoSetor() +
                ", salario base = " + getSalarioBase() +
                ", imposto = " + getImposto() +
                ", valor das vendas = " + valorVendas +
                ", comissao = " + comissao +
                ", salario liquido com comissao = " + calcularSalario() +
                '}';
    }
}

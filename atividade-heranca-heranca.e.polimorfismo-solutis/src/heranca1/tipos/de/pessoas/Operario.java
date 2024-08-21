package heranca1.tipos.de.pessoas;

public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario() {
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor,
                    double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioComComissao = getSalarioBase() + (valorProducao * (comissao / 100));
        return salarioComComissao - (salarioComComissao * (getImposto() / 100));
    }

    @Override
    public String toString() {
        return "Operario {" +
                "nome = '" + getNome() + '\'' +
                ", endereco = '" + getEndereco() + '\'' +
                ", telefone = '" + getTelefone() + '\'' +
                ", codigo do setor = " + getCodigoSetor() +
                ", salario base = " + getSalarioBase() +
                ", imposto = " + getImposto() +
                ", valor de producao = " + valorProducao +
                ", comissao = " + comissao +
                ", salario liquido com comissao = " + calcularSalario() +
                '}';
    }
}

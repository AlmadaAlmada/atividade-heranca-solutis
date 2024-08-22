package heranca.tipoDePessoas;

public class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador() {
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto); // Chama o construtor da superclasse
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    @Override
    public String toString() {
        return "Administrador {" +
                "nome = '" + getNome() + '\'' +
                ", endereco = '" + getEndereco() + '\'' +
                ", telefone = '" + getTelefone() + '\'' +
                ", codigo do setor = " + getCodigoSetor() +
                ", salario base = " + getSalarioBase() +
                ", imposto = " + getImposto() +
                ", ajuda de custo = " + ajudaDeCusto +
                ", salario liquido com ajuda de custo = " + calcularSalario() +
                '}';
    }
}


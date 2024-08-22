package heranca.tipoDePessoas;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String endereco, String telefone,
                      double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return "Fornecedor {" +
                "nome = '" + getNome() + '\'' +
                ", endereco = '" + getEndereco() + '\'' +
                ", telefone = '" + getTelefone() + '\'' +
                ", valor do credito = " + valorCredito +
                ", valor da divida = " + valorDivida +
                ", saldo = " + obterSaldo() +
                '}';
    }
}


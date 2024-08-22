package heranca.main;

import heranca.tipoDePessoas.*;

public class Empresa {
    private Pessoa[] pessoas;

    public Empresa() {
        pessoas = new Pessoa[6];

        // teste de pessoa
        pessoas[0] = new Pessoa();
        pessoas[0].setNome("João Silva");
        pessoas[0].setEndereco("Rua Central, 1");
        pessoas[0].setTelefone("555-0001");

        pessoas[1] = new Pessoa("Mario Andrade", "Rua do Milho", "555-0008");

        pessoas[2] = new Pessoa("Vagner Neto", "555-0009");

        // teste de fornecedor
        pessoas[3] = new Fornecedor("Maria Souza", "Rua da Feira, 2", "555-0002", 10000.0, 2000.0);
        Fornecedor fornecedor = (Fornecedor) pessoas[3];
        double saldoFornecedor = fornecedor.obterSaldo();
        System.out.println("Saldo do fornecedor: " + saldoFornecedor);

        // teste de empregado
        pessoas[4] = new Empregado("Carlos Oliveira", "Rua do Comércio, 3", "555-0003", 101, 4000.0, 15.0);
        Empregado empregado = (Empregado) pessoas[4];
        double salarioEmpregado = empregado.calcularSalario();
        System.out.println("Salário do empregado: " + salarioEmpregado);

        // teste de administrador
        pessoas[5] = new Administrador("Ana Ribeiro", "Rua das Palmeiras, 4", "555-0004", 102, 5000.0, 20.0, 1000.0);
        Administrador administrador = (Administrador) pessoas[5];
        double salarioAdministrador = administrador.calcularSalario();
        System.out.println("Salário do administrador: " + salarioAdministrador);

        // teste de oprário
        pessoas[4] = new Operario("Pedro Almeida", "Rua das Oficinas, 5", "555-0005", 103, 3000.0, 10.0, 20000.0, 8.0);
        Operario operario = (Operario) pessoas[4];
        double salarioOperario = operario.calcularSalario();
        System.out.println("Salário do operário: " + salarioOperario);

        // teste de vendedor
        pessoas[5] = new Vendedor("Lucia Costa", "Rua das Flores, 6", "555-0006", 104, 2500.0, 10.0, 30000.0, 5.0);
        Vendedor vendedor = (Vendedor) pessoas[5];
        double salarioVendedor = vendedor.calcularSalario();
        System.out.println("Salário do vendedor: " + salarioVendedor);
    }

    public void imprimirPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
            System.out.println("-------------------------------------------");
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.imprimirPessoas();
    }
}

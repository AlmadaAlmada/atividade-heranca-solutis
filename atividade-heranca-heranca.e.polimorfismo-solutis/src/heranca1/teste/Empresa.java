package heranca1.Main;

import heranca1.tipos.de.pessoas.*;

public class Empresa {
    private Pessoa[] pessoas;

    public Empresa() {
        pessoas = new Pessoa[6];

        pessoas[0] = new Pessoa("João Silva", "Rua Central, 1", "555-0001");
        pessoas[1] = new Fornecedor("Maria Souza", "Rua da Feira, 2", "555-0002", 10000.0, 2000.0);
        pessoas[2] = new Empregado("Carlos Oliveira", "Rua do Comércio, 3", "555-0003", 101, 4000.0, 15.0);
        pessoas[3] = new Administrador("Ana Ribeiro", "Rua das Palmeiras, 4", "555-0004", 102, 5000.0, 20.0, 1000.0);
        pessoas[4] = new Operario("Pedro Almeida", "Rua das Oficinas, 5", "555-0005", 103, 3000.0, 10.0, 20000.0, 8.0);
        pessoas[5] = new Vendedor("Lucia Costa", "Rua das Flores, 6", "555-0006", 104, 2500.0, 10.0, 30000.0, 5.0);
    }

    public void imprimirPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
            System.out.println("-★-★-★-★-★-★-★-★-★-★-★-★-★-★-★-★-★-★-★-★-★-★-★");
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.imprimirPessoas();
    }
}


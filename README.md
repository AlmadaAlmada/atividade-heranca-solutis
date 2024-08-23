# Lista de Herança Solutis

Este projeto é uma aplicação simples em Java que demonstra o uso de herança entre classes. Ele implementa uma hierarquia de classes para representar diferentes tipos de pessoas e funcionários. A aplicação cria instâncias dessas classes e testa seus métodos, incluindo o cálculo de salários e a obtenção de saldos.

## Estrutura do Projeto
O projeto é organizado em pacotes da seguinte forma:

- heranca.main

**`Empresa.java`**: Classe principal que cria e manipula instâncias das classes Pessoa, Fornecedor, Empregado, Administrador, Operario, e Vendedor.
  
- heranca.tipoDePessoas

**`Pessoa.java`**: Classe base que contém atributos comuns como nome, endereço e telefone.

**`Fornecedor.java`**: Classe derivada de Pessoa, que representa um fornecedor com atributos de crédito e dívida.

**`Empregado.java`**: Classe derivada de Pessoa, que representa um empregado com código de setor, salário base e imposto.

**`Administrador.java`**: Classe derivada de Empregado, que inclui uma ajuda de custo adicional.

**`Operario.java`**: Classe derivada de Empregado, que representa um operário com atributos de produção e comissão.

**`Vendedor.java`**: Classe derivada de Empregado, que representa um vendedor com atributos de vendas e comissão.

## Funcionalidades
- **Criação de Pessoas**: A classe Pessoa permite a criação de pessoas com atributos como nome, endereço e telefone.
  
- **Criação de Fornecedores**: A classe Fornecedor permite a criação de fornecedores com atributos de crédito e dívida, e a obtenção do saldo.

- **Criação de Empregados**: A classe Empregado permite a criação de empregados com código de setor, salário base e imposto, e o cálculo do salário líquido.

- **Criação de Administradores**: A classe Administrador estende Empregado e permite a adição de uma ajuda de custo no cálculo do salário.

- **Criação de Operários**: A classe Operario estende Empregado e permite a adição de uma comissão sobre a produção no cálculo do salário.

- **Criação de Vendedores**: A classe Vendedor estende Empregado e permite a adição de uma comissão sobre as vendas no cálculo do salário.

## Como Executar
-Para rodar o projeto, siga estas etapas:

1. **Clone o repositório:**

```bash
git clone https://github.com/seu-usuario/mundo-animal.git
```

2. **Navegue até o diretório do projeto:**

```bash
   cd mundo-animal
````

3. **Compile o projeto:**

Utilize um ambiente de desenvolvimento Java, como o IntelliJ IDEA ou Eclipse, para compilar o projeto. Se preferir, você também pode usar o javac diretamente no terminal:

```bash
javac -d bin src/mundo/animal/*.java
```
4. **Execute o projeto:**

Navegue até o diretório onde os arquivos .class estão localizados e execute o programa:

```bash
java mundoAnimal.Zoologico
```



# Exercícios de Programação Orientada a Objetos (POO) em Java

Este projeto contém uma série de exercícios práticos em Java, focados na aplicação de conceitos fundamentais de Programação Orientada a Objetos (POO), como encapsulamento, herança, polimorfismo, abstração, imutabilidade, generics e padrões de projeto.

---

## 🚀 Tecnologias Utilizadas

* **Java 17** ou superior
* **Apache Maven** (para gerenciamento de dependências e construção do projeto)
* **Git** (para controle de versão)
* **IntelliJ IDEA** (opcional, como IDE de desenvolvimento)

---

## 📁 Estrutura do Projeto

O projeto está organizado em pacotes, com cada exercício contido em seu próprio diretório, seguindo a estrutura padrão de projetos Maven.
src/
└── br/
└── com/
└── exercicios/
├── exercicio1/
├── exercicio2/
├── exercicio3/
├── exercicio4/
├── exercicio5/
├── exercicio6/
├── exercicio7/
└── exercicio8/


---

## 🧩 Descrição dos Exercícios

Cada diretório (`exercicio1`, `exercicio2`, etc.) contém a implementação completa de um exercício, demonstrando um ou mais conceitos de POO.

* **Exercício 1: Encapsulamento (Classe `Produto`)**
    * Implementa a classe `Produto` com atributos privados e validação de dados via getters e setters.
* **Exercício 2: Encapsulamento com Validação (Desconto)**
    * Estende a classe `Produto` para incluir um método `aplicarDesconto` com validações de regras de negócio.
* **Exercício 3: Herança (Hierarquia de Funcionários)**
    * Cria uma hierarquia de classes (`Funcionario`, `Gerente`, `Desenvolvedor`) para demonstrar herança e sobrescrita de métodos.
* **Exercício 4: Polimorfismo com Interface (IMeioTransporte)**
    * Utiliza a interface `IMeioTransporte` para aplicar o polimorfismo em classes como `Carro`, `Bicicleta` e `Trem`.
* **Exercício 5: Abstração (Sistema de Pagamentos)**
    * Demonstra o uso de uma classe abstrata (`FormaPagamento`) com subclasses (`CartaoCredito`, `Boleto`, `Pix`) que implementam lógicas específicas.
* **Exercício 6: Imutabilidade e Objetos de Valor (Carrinho)**
    * Cria classes imutáveis (`Dinheiro`, `Produto`, `Carrinho`) para mostrar como as operações retornam novas instâncias, preservando o estado original.
* **Exercício 7: Generics (Repositório Genérico)**
    * Implementa um repositório genérico (`InMemoryRepository`) que pode ser usado com qualquer tipo de entidade, reforçando o uso de generics.
* **Exercício 8: Padrão Strategy (Cálculo de Frete)**
    * Aplica o padrão de design Strategy para permitir a troca dinâmica de algoritmos de cálculo de frete, incluindo o uso de lambdas.

---

## ⚙️ Como Executar o Projeto

Para compilar e executar o projeto, siga os passos abaixo:

1.  **Clone o Repositório:**
    ```bash
    git clone [https://github.com/rs2chel/Exercicio-07-PraTI.git](https://github.com/rs2chel/Exercicio-07-PraTI.git)
    cd Exercicio-07-PraTI
    ```

2.  **Abra o Projeto no IntelliJ IDEA** (ou outra IDE de sua preferência).

3.  **Execute o código:**
    * Para cada exercício, você pode encontrar a classe principal (geralmente chamada `Main.java`) dentro de sua respectiva pasta.
    * Clique com o botão direito na classe `Main.java` desejada e selecione **"Run 'Main.main()'"** para executar o código.

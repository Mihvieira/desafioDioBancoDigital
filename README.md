# Criando um Banco Digital com Java e Orientação a Objetos

## Desafio: 

Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

## Descrição Detalhada do Projeto:

**Objetivo:**

O projeto teve como principal objetivo simular um banco digital básico, implementando as funcionalidades mais comuns de uma conta bancária, como depósito, saque e transferência. Essa simulação permitiu explorar os conceitos da programação orientada a objetos (POO) em Java, utilizando classes e interfaces para modelar as diferentes entidades do sistema bancário.

**Desafios e Soluções:**

* **Uso de Classes e Interface:**
    * **Classes:** Foram desenvolvidas classes para representar as entidades do sistema, como [`Banco`](src/Banco.java), [`Cliente`](src/Cliente.java), [`Conta`](src/Conta.java), [`ContaCorrente`](src/ContaCorrente.java) e [`ContaPoupanca`](src/ContaPoupanca.java). Cada classe encapsula os dados e comportamentos específicos de cada entidade.
        * **Banco:** Responsável por gerenciar as contas e clientes.
        * **Cliente:** Representa os clientes do banco, contendo informações pessoais.
        * **Conta:** Classe base para as contas bancárias, contendo métodos comuns como depósito, saque e transferência.
        * **ContaCorrente:** Herda de Conta e pode ter funcionalidades específicas de uma conta corrente.
        * **ContaPoupanca:** Herda de Conta e pode ter funcionalidades específicas de uma conta poupança.
    * **Interface:** A interface [`IConta`](src/IConta.java) foi criada para definir um contrato entre os diferentes tipos de contas, especificando os métodos comuns que todas as contas devem implementar.
        * **IConta:** Define métodos como depósito, saque, transferência e impressão de extrato.

* **Tecnologias Utilizadas:**
    * **Java:** A linguagem de programação Java é amplamente utilizada no desenvolvimento de sistemas empresariais e por oferecer um forte suporte à programação orientada a objetos.

**Resultado Alcançado:**

Ao final do projeto, foram obtidos os seguintes resultados:

* **Aprendizado sobre Orientação a Objetos:**
    * **Conceitos Fundamentais:** O desenvolvimento do projeto permitiu consolidar o entendimento sobre os pilares da POO, como:
        * **Abstração:** A capacidade de identificar as características essenciais de um objeto e representá-lo em código.
        * **Encapsulamento:** O mecanismo de ocultar os detalhes internos de uma classe, expondo apenas as funcionalidades necessárias.
        * **Herança:** A capacidade de criar novas classes a partir de classes existentes, reutilizando código e estabelecendo hierarquias.
        * **Polimorfismo:** A capacidade de objetos de classes diferentes responderem de maneira diferente à mesma mensagem.
    * **Aplicabilidade:** Foi possível observar como os conceitos da POO podem ser aplicados para modelar sistemas reais, como um banco digital, de forma mais organizada e eficiente.
* **Organização do Projeto:**
    * **Estrutura de Classes:** A criação de classes bem definidas e com responsabilidades claras facilitou a organização do código e a manutenção do sistema.
    * **Diagrama de Classes:** A construção de um diagrama de classes visualizou as relações entre as classes, auxiliando na compreensão da arquitetura do sistema.
* **Entendimento sobre Modificadores de Acesso:**
    * **protected:** Permite o acesso a membros da classe em classes filhas e no mesmo pacote.
    * **private:** Restringe o acesso a membros da classe apenas dentro da própria classe.
    * **public:** Permite o acesso a membros da classe de qualquer lugar.
    * **static:** Define membros que pertencem à classe e não a instâncias da classe.
    * **final:** Impede que um membro seja modificado após sua inicialização.

## Outras informações

Projeto desenvolvido no curso de java da DIO


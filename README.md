# Criando um Banco Digital com Java e Orientação a Objetos

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

## Descrição Detalhada do Projeto:

**Objetivo:**

O projeto teve como principal objetivo simular um banco digital básico, implementando as funcionalidades mais comuns de uma conta bancária, como depósito, saque e transferência. Essa simulação permitiu explorar os conceitos da programação orientada a objetos (POO) em Java, utilizando classes e interfaces para modelar as diferentes entidades do sistema bancário.

**Desafios e Soluções:**

* **Uso de Classes e Interface:**
    * **Classes:** Foram criadas classes para representar as entidades do sistema, como `Banco`, `Cliente`, `Conta`, `ContaCorrente` e `ContaPoupança`. Cada classe encapsulou os dados e comportamentos específicos de cada entidade.
    * **Interface:** A interface `IConta` foi definida para estabelecer um contrato entre as diferentes tipos de contas, definindo os métodos comuns que todas as contas deveriam implementar (como depósito, saque e transferência).
* **Tecnologias Utilizadas:**
    * **Java:** A linguagem de programação Java foi escolhida por ser amplamente utilizada no desenvolvimento de sistemas empresariais e por oferecer um forte suporte à programação orientada a objetos.

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
    * **private:** Restrige o acesso a membros da classe apenas dentro da própria classe.
    * **public:** Permite o acesso a membros da classe de qualquer lugar.
    * **static:** Define membros que pertencem à classe e não a instâncias da classe.
    * **final:** Impede que um membro seja modificado após sua inicialização.
* **Criação de Classes:**
    * **Banco:** Representa a instituição financeira, podendo conter informações como nome, endereço e lista de clientes.
    * **Cliente:** Representa um cliente do banco, com atributos como nome, CPF e lista de contas.
    * **Conta:** Classe abstrata que define os atributos e métodos comuns a todas as contas (número da conta, saldo, etc.).
    * **ContaCorrente:** Classe concreta que herda de `Conta` e implementa funcionalidades específicas da conta corrente (cheque especial, etc.).
    * **ContaPoupança:** Classe concreta que herda de `Conta` e implementa funcionalidades específicas da conta poupança (rendimento, etc.).
    * **IConta:** Interface que define os métodos comuns a todas as contas (depositar, sacar, transferir).

**Em resumo:**

O projeto proporcionou uma experiência prática de aplicação dos conceitos da programação orientada a objetos em Java, permitindo ao desenvolvedor construir um sistema simples, mas funcional, simulando um banco digital. A compreensão dos conceitos de classes, objetos, herança, polimorfismo e modificadores de acesso foi fundamental para a conclusão do projeto.

**Possíveis Extensões:**

* **Implementação de outras funcionalidades:** Inclusão de funcionalidades como pagamento de contas, investimentos, empréstimos, etc.
* **Gerenciamento de usuários:** Implementação de um sistema de login e autenticação para os clientes.
* **Persistência de dados:** Utilização de um banco de dados para armazenar as informações das contas e clientes de forma persistente.
* **Interface gráfica:** Desenvolvimento de uma interface gráfica para interagir com o sistema.


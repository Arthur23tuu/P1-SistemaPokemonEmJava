# ⚡ Sistema de Batalha Pokémon (Java POO)

Projeto desenvolvido como requisito para a avaliação P1 da disciplina de **Desenvolvimento Para Servidores I**; bem como meu primeiro projeto prático focado na aprendizagem da linguagem **Java** e na fixação de conceitos de **Programação Orientada a Objetos (POO)**.

## 🎓 Dados Acadêmicos
* **Instituição:** Fatec São Roque
* **Aluno:** Arthur Camargo Laranjeira
* **Semestre:** 4º
* **Disciplina:** Desenvolvimento Para Servidores I
* **Professor:** Marcos Costa de Sousa

## 📝 Sobre o Projeto
Este projeto consiste em um simulador em modo texto de batalhas Pokémon. Embora seja um sistema introdutório, idealizado durante as etapas iniciais do meu aprendizado em Java, ele cumpre o objetivo fundamental de modelar um cenário lógico utilizando os pilares da Orientação a Objetos. O código instancia lutadores de diferentes tipos, simula o combate por turnos e aplica travas lógicas (utilizando `Math.max`) para garantir a integridade dos dados, impedindo que os pontos de vida (HP) fiquem negativos.

O desenvolvimento deste sistema atende à proposta do exercício final da P1, consistindo em um projeto de livre escolha realizado de forma individual. A implementação consolida os seguintes conceitos obrigatórios exigidos para a entrega:

* **Classes e Atributos (Visibilidade):** Criação da classe base `Pokemon` com seus atributos fundamentais (`nome`, `hp`, `ataque`) protegidos pelo modificador `private`.
* **Encapsulamento, Getters e Setters:** Proteção do estado interno dos objetos, exigindo a passagem por métodos de acesso para qualquer leitura ou alteração dos atributos.
* **Métodos Construtores:** Construção da base para que todas as instâncias herdeiras exijam parâmetros iniciais de configuração no momento da criação.
* **Herança:** Especialização da superclasse em subclasses temáticas como `PokemonAgua`, `PokemonFogo`, `PokemonEletrico` e `PokemonPlanta`.
* **Sobrecarga de Método (Overload):** Múltiplas assinaturas para o método `atacar()`, permitindo tanto realizar um ataque direcionado (passando o alvo como parâmetro) quanto errar a ação (sem receber parâmetros).
* **Reescrita de Método (Override):** Uso do `@Override` nas classes filhas para personalizar o comportamento do ataque, exibindo golpes específicos daquele tipo (ex: `Blastoise usou Surf`).

## ⚙️ Estrutura do Código
* **`Pokemon.java`**: A superclasse que define a abstração principal. Gerencia a lógica do dano sofrido e contém os métodos getters/setters universais.
* **Classes Derivadas (`PokemonAgua.java`, `PokemonFogo.java`, `PokemonPlanta.java`, `PokemonEletrico.java`)**: Subclasses que invocam o construtor da mãe via `super()` para injetar seus dados específicos e sobrescrevem a estética dos ataques.
* **`BatalhaPokemon.java`**: Contém o método `main` e atua como a arena. Nela ocorre a criação dos objetos e a execução de um torneio estruturado (Semifinais e Grande Final). A classe também manipula o estado dos objetos, simulando "poções" de cura através do `setHp()` para restaurar a vida dos Pokémon entre as rodadas.

# Exercício 1

### Tasks:
* Encontrar os  erros do código
* Explicar o motivo dos erros
* Reescrever o código de maneira que funcione.

### Tópicos envolvidos nesse exercício:
* construtor
* herança
* super
* @Override
* polimorfismo
* arrays
* loop for
* erro de compilação
* erro de runtime
* encapsulamento

---
## 🔹 Respostas 🔹

Erros encontrados:
* A instanciação "Animal animal = new Cachorro();" esperava um argumento String que não foi passado.
* O método emitirSom() em Animal, não possuia parâmetros.
* Animal exige um nome no construtor, mas nãoes tava repassando isso para o construtorde Cachorro.

Correção:
* Adicionar Argumento na instanciação da classe Cachorro no main.
* Adicionar parâmetro no método emitirSom
* Adicionar super(nome) no construtor de cachorro
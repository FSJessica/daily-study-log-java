# 🔷 O que é POO?
    Programação orientada a objetos é um paradigma de programação que organiza o código ao redor de objetos

## O que é um Objeto?

    É uma representação em código de algo que exista no mundo real. Ex: um carro, um bolo, uma pessoa.
    Esses objetos contém dados (atributos) e ações (métodos) específicos associados a ele.

## Classes:
    As classes são modelos que definem e esrtuturam todas as características comuns a um objeto.

## Princípios
São 4 os pilares da programação orientada a objetos:

### Encapsulamento
    Redução de complexidade + aumento da reusabilidade

Ao encapsular um objeto, garantimos a proteção de acesso direto a seus dados internos.
A maior parte das linguagens orientadas a objetos implementam o encapsulamento baseados em propriedades privadas,
ligadas a métodos especiais chamados getters e setters, que irão retornar e setar o valor da propriedade, respectivamente,
 evitando assim o acesso direto a propriedade do objeto, e adicionando uma camada de segurança à aplicação.


### Abstração
    Redução da complexidade + redução do impacto das mudanças

O objeto deve ter uma interface simples e amigável, para isso, as partes complexas ou detalhes de implementação precisam
estar protegidos do mundo exterior. Portanto, na abstração, algumas partes da implementação precisam estar "escondidas".
São 3 os pontos que devem ser levados em consideração nessa abstração:
1° É preciso dar uma identidade ao objeto que se irá criar, essa identidade deve ser única.
Na maior parte das linguagens, há o conceito de pacotes em que a identidade do objeto não pode ser repetida 
dentro do pacote.
2º Dentro da programação orientada a objetos deve-se dar características ao objeto que são chamadas de propriedades.
3º Deve-se definir as ações que o objeto irá executar, essas ações são chamadas de métodos

### Herança
    Eliminação da repetição de código.

É útil para eliminar repetição de código, onde um objeto pode herdar características(ou seja, propriedades e métodos) de 
outra classe, sem a necessidade de reescrever as mesmas características.
Na orientação a objetos, um objeto abaixo na hierarquia irá herdar características de todos os objetos acima dele, 
A herança a partir das características do objeto mais acima é considerada herança direta, as demais são consideradas 
heranças indiretas.


### Polimorfismo
    Remoção de código desnecessário

Em POO, polimorfismo é caracterizadoquando duas ou mais classes possuem métodos com o mesmo nome, mas com apossibilidade 
de ter implementações diferentes.
Consiste na alteração do funcionamento interno de um método herdade de um objeto pai. Em java 
o atributo "@Override" é necessário para isso.


# 🔷 Modificadores de Acesso
     Modificadores de acesso são usados para determinar quem tem a permissão para usar aquele trecho de código.
     É importante  para manter o código seguro e limpo, uma dica é sempre usar o acesso mais restrito que faça sentido
     para um membro em particular, nunca deixe todos os membros público.
      
## Os modificadores de acesso

* Private: Permissão de acesso apenas dentro da própria classe
* Package-private (default): Permissão de acesso para todas as classes dentro do mesmo package.
* Protected: Permissão de acesso para classes no mesmo package ou por subclasses.
* Public: Permissão de acesso pra todas as classes em qualquer local.

### Private 

Campos private são usados para proteger dados, e não são acessíveis diretamente de fora
Esse modificador é muito usado para atributos, garantindo o encapsulamento. Em vez de usar 
diretamente, você expõe métodos controlados (getters/setters). Reduzindo bugs e mantendo controle
sobre o objeto.

    private String senha;

### Package-private (default)
Acessível apenas dentro do mesmo pacote, não pode ser acessado fora do pacote.
Ele é útil quando você quer que várias classes relacionadas(mesmo pacote) compartilhem informações, sem expor isso para
o restante do sistema. Organiza melhor o código internamente, especialmente em projetos com múltiplos pacotes.


    String endereço;

### Protected
Pode ser acessado dentro da mesma classe, no mesmo pacote e por subclasses.
É um meio-termo entre private e public, muito útil quando está trabalhando com herança, pois permite que classes filhas
reutilizem e modifiquem comportamentos de classe pai sem expor esses dados para todo o sistema.

    protected String email;

### Public
Pode ser acessado de qualquer lugar, inclusive dos outros pacotes.
É usado quando você quer expor algo como parte da "interface" do seu sistema.
Geralmente em projetos reais métodos de controllers e services geralmente são public,
pois precisam ser acessados por outras camadas da aplicação.

    public class Usuario {
        public String nome;
    }

# 🔷 Interfaces:

    Uma interface é uma coleção de métodos que descrevem o comportamento de um objeto.
    Para implementar uma interface, um objeto deve implementar todos os métodos dela.
    É como um “contrato” que outras classes devem seguir. Diz quais métodos devem existir,
    mas não como serão implementados e não criam objetos.

### Exemplo:

    public interface Animal{

        void emitirSom();
    
    }

### Implementando:

    public class Cachorro implements Animal{

        @Override
        public void emitirSom(){
            System.out.println("Au au");
        }
    }

### Utilidade:

* Padronização: Garante que classes possuam métodos específicos.
* Desacoplamento: Permite um código flexível.
* Polimorfismo: Pode tratar objetos diferentes da mesma forma.
* Arquitetura profissional: Funcionam muito bem com frameworks importantes, como o spring, hibernate, jpa

# 🔷 Construtores:

Qualquer classe Java tem um construtor, esses são métodos especiais que inicializam instâncias (um novo objeto) da classe.
Um construtor de uma classe é invocado quando uma instância é criada usando a palavra-chave "new".
Se uma classe não tiver construtores explícitos, o compilador java provê um construtor sem argumento por default.

Um método construtor:
- Deve ter o mesmo nome da classe que o contém.
- Não pode ter nenhum tipo de retorno (nem mesmo void).

Exemplo:

    class Patient {
    
        String name;
        int age;
        float height;
    
        public Patient(String name, int age, float height){
            this.name = name;
            this.age = age;
            this.height = height;
        }
    }

Para inicializar os campos, a palavra-chave "this" é usada, comumente para diferenciar o atributo da classe e o
parâmetro do construtor.


Criando as instâncias da classe usando o construtor escrito:

    Patient patient1 = new Patient ("Heinrich", 40, 182.0f);
    Patient patient2 = new Patient ("Mary", 33, 171.5f);

Também é possível definir valores default pra os campos da classe. Exemplo:

    class Patient {
    
        String name;
        int age;
        float height;
    
        public Patient() {
            this.name = "Unknown";
        }
    }

# Princípios SOLID

São os cinco princípios que facilitam o processo de desenvolvimento, a manutenção e a expansão do software.

## S — Single Responsibility Principle 
### (Princípio da responsabilidade única)

As classes e métodos devem ter responsabilidades únicas. Quanto mais tarefas um método/classe
executa, mais difícil é testá-lo e garantir que o programa está em ordem.

Exemplo: 

    public class GerenciadorTarefas {
        public String conectarAPI(){
            //...
        }
        public void criarTarefa(){
            //...
        }
        public void atualizarTarefa(){
            //...
        }
        public void removerTarefa(){
            //...
        }
        public void enviarNotificacao(){
            //...
        }
        public void produzirRelatorio(){
            //...
        }
        public void enviarRelatorio(){
            //...
        }
    }

O problema desse código é que há muitas funções atribuídas a classe GerenciadorTarefas, que não tem relação com o
gerenciamento de tarefas.
O princípio da responsabilidade única pode resolver essa situação, atribuindo a classe GerenciadorTarefas apenas os
métodos criarTarefa, atualizarTarefa, removerTarefa. Para os outros métodos, o ideal é criar classes correspondentes. 

Esse princípio, traz principalmente:
- Facilidade para fazer manutenções
- Reusabilidade das classes
- Facilidade para realizar testes
- Simplificação da legibilidade do código

## O — Open-Closed Principle
### (Princípio Aberto-Fechado)

As entidades de software (como classes e métodos) devem estar abertas para extensão, mas fechadas para modificação.
O ideal é adaptar o código não para alterar a classe, mas para estendê-la.

Exemplo:
Digamos que nessa clínica, existe uma classe que trata das solicitações de exames. Inicialmente, o único exame possível
é o exame de sangue.

    public class AprovaExame {
        public void aprovarSolicitacaoExame(Exame exame){
            if(verificaCondicoesExameSangue(exame))
                System.out.println("Exame aprovado!");
        }
        public boolean verificaCondicoesExameSangue(){
            //....
        }
    }

Se precisarmos incluir uma nova funcionalidade ao sistema como exames de Raio-X, ultrassons, etc...
Como incluir isso no nosso código? Seguindo a lógica, iríamos adicionar mais um if no código e mais um método para olhar
condições específicas do exame, deixando a classe e o projeto mais complexo.

Uma solução aplicando o princípio aberto-fechado:

    public interface AprovaExame{
        void aprovarSolicitacaoExame(Exame exame);
        boolean verificaCondicoesExame(Exame exame);
    }
    public class AprovaExameSangue implements AprovaExame{
        @Override
        public void aprovarSolicitacaoExame(Exame exame){
            if(verificaCondicoesExame(exame))
                System.out.println("Exame sanguíneo aprovado!");
        }
        @Override
        boolean verificaCondicoesExame(Exame exame){
            //....
        }
    }
    public class AprovaRaioX implements AprovaExame{
        @Override
        public void aprovarSolicitacaoExame(Exame exame){
            if(verificaCondicoesExame(exame))
                System.out.println("Raio-X aprovado!");
        }
        @Override
        boolean verificaCondicoesExame(Exame exame){
            //....
        }
    }
Assim sempre será possível implementar a interface AprovaExame ao adicionarmos recursos. Essa interface, no entanto, 
não muda. Estamos estendendo-a, mas não alterando.

## L — Liskov Substitution Principle
### (Princípio da substituição de Liskov)

Classes derivadas (ou classes-filhas) devem ser capazes de substituir suas classes-base (ou classes-mães) Ou seja, uma
classe-filha deve ser capaz de executar tudo que sua classe-mãe faz. Esse princípio se conecta com o polimorfismo e 
reforça esse pilar da POO.

Exemplo:

Veja esse sistema de uma faculdade:

    public class Estudante {
        String nome;
        public Estudante(String nome) {
            this.nome = nome;
        }
        public void estudar() {
            System.out.println(nome + " está estudando.");
        }
    }

    public class EstudanteDePosGraduacao extends Estudante {
        @Override
        public void estudar() {
            System.out.println(nome + " está estudando e pesquisando.");
        }
    }

Se tivermos que adicionar a funcionalidade entregarTCC(), colocariamos esse método na classe estudante.
O problema é que normalmente, estudantes de pós-graduação não entregam TCCs, mas deveria apresentar todos os 
comportamentos da classe Estudante, pois é classe filha.
Uma solução seria modificar a nossa modelagem. Criando a classe EstudanteDeGraduação

    public class EstudanteDeGraduacao extends Estudante {
        public void estudar() {
            System.out.println(nome + " está estudando na graduação.");
        }
        public void entregarTCC() {
            //…
        }
    }

Assim, não estamos forçando uma classe a fazer algo que ela originalmente não faz.
Aplicar esse princípio nos traz diversos benefícios, especialmente para ter uma modelagem mais fiel à realidade,
reduzir erros inesperados no programa e simplificar a manutenção do código.


## I — Interface Segregation Principle
### (Princípio da Segregação da Interface)

Uma classe não deve ser forçada a implementar interfaces e métodos que não serão utilizados.
Seguir o Princípio da Segregação da Interface ajuda a promover a coesão e a flexibilidade em nossos sistemas,
tornando-os fáceis de manter e estender.

## D — Dependency Inversion Principle
### (Princípio da inversão da dependência)

É recomendado que os módulos de alto nível não dependam diretamente dos detalhes de implementação de módulos de
baixo nível.

A adesão ao Princípio de Inversão de Dependência promove a flexibilidade e a extensibilidade dos nossos sistemas.
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
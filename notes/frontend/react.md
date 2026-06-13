#  🔷 que é React

React é uma framework JavaScript usada para criar interfaces de usuário em aplicativos web.
É flexível e escalável, usado por muitas empresas de tecnologia.

### Definição de framework

Cnjunto de ferramentas e bibliotecas que fornecem um conjunto de recursos e funcionalidades prontas para o uso do
desenvolvedor. Alguns dos frameworks mais populares incluem o React para o javaScript, o Django para o Pyhton e o Spring
para o Java.

## Usos do React

- Criar aplicações web atualizadas em tempo real
- Criar interfaces de usuário
- Criar aplicações web que precisam ser escaláveis e mantidas por equipes grandes.
- Em conjunto com React Native, é possível criar aplicações mobile pra iOS e Android.

#  🔷 React components

No react, a tela é dividida em pequenos blocos independentes, os componentes então, são partes reutilizáveis da interface.

Um site pode ser dividido em partes como:
* Header
* Menu
* Card de produto
* Botão
* Footer
Cada parte pode virar um component.

Exemplo de um component:
(JavaScript)

          function Mensagem() {
            return (
                <h1>Hello world</h1>
            );
          }
        
          export default Mensagem;

Usando o component:

            import Mensagem from "./Mensagem";
            
            function App() {
                return (
                    <div>
                        <Mensagem />
                     </div>
                 );
            }
            
            export default App;

#  🔷 React components

Props(Properties) são valores enviados de um component pai para um component filho.
Atuam como argumentos de função, são imutáveis dentro do componente que as recebe, garantindo que os dados fluam de forma previsível e unidirecional.
Vantagens:
- Reutilização
- components dinâmicos
- comunicação entre components

Exemplo:

    function Saudacao(props) {
        return <h1>Olá {props.nome}</h1>;
    }

Usando componentes com props:
    
    <Saudacao nome="Maria" />


#  🔷 React hooks

São funções especiais do React que permitem adicionar funcionalidades aos components.
Eles começam com "use" e só podem ser usados dentro de components do React ou hooks customizados.


Os hooks são usados para:
- guardar estado
- reagir a mudanças
- acessar ciclo de vida
- compartilhar lógica

Hooks famosos:

### useState

### useEffect
  - Executa efeitos colaterais em componentes funcionais. Exemplos: busca de dados de uma API, alterar o título da página, adicionar eventos ao navegador, executar algo quando um state muda, iniciar ou limpar timers(setInterval, setTimeout).
    - Sintaxe:
  
          useEffect(() => {
            //código
          }, [dependency]);

## useRef

Cria uma referência persistente que continua existindo entre as renderizações do componente.
Enquanto o useState guarda dados e atualiza a tela quando muda, o useRef guarda uma referência ou valor, não atualiza a rela quando muda, e é muito usado para acessar elementos HTML.
Use State guarda dados para exibir na interface, useRef guarda referências e valores nternos sem causar nova renderização.


- useContext
- useMemo
- useCallback

# 🔷 State

State em React é uma forma do react component guardar uma informação que pode mudar com o tempo e precisa ser lembrada.
É um valor armazenado pelo componente que pode mudar ao longo do tempo. Quando ele muda, o React atualiza a interface automaticamente.

Exemplos de state:

- contador
- texto de um input
- usuário logado
- carrinho de compras
- menu aberto/fechado
- lista de tarefas
- tema claro/escuro

### Porque não usar então apenas as variáveis?

A magia do state no react é que sempre que mudar, o react sabe automaticamente rederizar novamente o component (ou partes dele) para refletir as mudanças na UI.

### No que difere dos props?

Os props são como configurações ou atributos que você passa para um component. E eles são apenas de leitura.

| Parâmetro de Comparação |                                         State                                          |                                                                                                 Props |
|:------------------------|:--------------------------------------------------------------------------------------:|------------------------------------------------------------------------------------------------------:|
| Definição               |  Específico de um componente e determina como esse componente renderiza e se comporta  | Abreviação de "Properties", uma forme de passar dados de um componente pai, para um componente filho. |
| Imutabilidade           |                        Mutável: Componentes podem mudar o state                        |                                       Imutável: Componentes não podem mudar os props, apenas usá-los. |
| Data Flow               | Local ao Component: Esrtutura de dados que podem mudar com o tempo devido a interações |                                                            Data flow de via única, de pai para filho. |
| Exemplo                 |                         const [count, setCount] = useState(0);                         |                                                                            <Welcome name = "React" /> |
| Caso de uso             |                       Dado que irão modificar( ex: user input).                        |                                         Dados que não devem mudar e não mudarão pelo component filho. |


# Prop

Abreviação de (properties) são a forma de passar dados de um componente para outro.

Exemplo: 

Quando você escreve:

    <Pessoa nome="Jessica" />

O React cria um objeto parecido com:
    
    props = {
        nome: "Jessica"
    }

Então dentro do componente:

    props.nome

Guarda: 

    Jessica


## Prop Drilling

Acontece quando você precisa passar uma prop por vários componentes intermediários apenas para que ela chegue a um componente mais profundo.
Se um componente tem um dado  no topo e você precisa dele lá embaixo, você fica repassando a prop de pai pra filho, de filho pra neto, mesmo que esses componentes intermediários não usem o dado.

Exemplo:

Nesta árvore:

    -App
        -Header
            -Menu
                -User Info

O nome do usuário está em App mas UserInfo que precisa dele.

App:

    function App() {
        const nome = "Jessica";

        return <Header nome={nome} />;
    }

Header:

    function Header({ nome }) {
        return <Menu nome={nome} />;
    }

Menu:

    function Menu({ nome }) {
        return <UserInfo nome={nome} />;
    }

UserInfo

    function UserInfo({ nome }) {
        return <h1>{nome}</h1>;
    }

Apesar de Header e Menu não usarem nome, eles repassam a prop para UserInfo. Se a árvore for muito grande, pode ser difícil de manter e repetitivo,
para resolver esse problema, geralmente se usa o Hook useContext com a Context API
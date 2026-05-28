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



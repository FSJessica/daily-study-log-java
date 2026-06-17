#  🔷 O que é JavaScript

Linguagem de programação usada pra fins de interatividade em páginas web.
Bastante usada com frameworks/bibliotecas como REACT, Angular,Node.js. Usada em conjunto com HTML e CSS.

### HTML
HTML é como o esqueleto, a estrutura de uma página web.
Define títulos, textos, botões, imagens, formulários, etc.

Exemplo:

    <h1>Login</h1>
    <button>Entrar</button>



### CSS
CSS estiliza a página web, "embelezando" a estrutura criada.
Controla cores, tamanhos, fontes, espaçamento, layouts, animações.

Exemplo:

    button {
    background-color: blue;
    }

### JavaScript
O JavaScript entra como o definidor de comportamentos, dando "vida" à página web, criando interatividade.
Cria cliques, abre menus, atualização de dados, chamadas pra APIS, validações, animações dinâmicas, etc.

Exemplo:

    button.onclick = function() {
    alert("Clicou");
    }

# 🔷 Axios

Biblioteca JavaScript usada pra fazer requisições HTTP a APIs de forma mais simples e prática do que o fetch.


Exemplo:

    const response = await axios.get('/users');
    console.log(response.data);

Sem axios:

    fetch('https://jsonplaceholder.typicode.com/posts')
    .then(response => response.json())
    .then(data => console.log(data));

Com axios:

    import axios from 'axios';

    axios.get('https://jsonplaceholder.typicode.com/posts')
    .then(response => console.log(response.data));

Com axios você tem a vantagem de ter menos código, já que converte JSON automaticamente, enquanto no fetch você precisa chamar response.json().
Com axios o tratamento de erros se torna mais simples já que considera respostas de erro (404, 500, etc) como exceções e cai no catch, no fetch você precisa verificar response.ok manualmente.
O axios tem Interceptadores (interceptors) que permitem adicionar autenticação, logs ou outras ações antes de cada requisição e após cada resposta.
Com axios a configuração é centralizada, você pode criar uma instância com URL base e configurações reutilizáveis.
O axios tem Timeout nativo, sendo fácil definir tempo máximo de espera.

O fetch pode ser utilizado em projetos simples, ou quando não precisa adicionar dependências, ou quando já vem nativo no navegador, porém axios é mais prático, possui melhor tratamento de erros, interceptadores e configutação centralizada.

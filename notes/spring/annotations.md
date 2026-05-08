# 🔷 O que são annotations:
    Annotations são uma forma de metadados, fornecem dados sobre um programa que não
    faz parte do próprio programa, são responsáveis por imbutir informações complementares
    no código fonte. Surgidas a partir da versão 1.5 no Java e precedidas por um @.
    No Spring Framework, as anotações foram introduzidas na versão 2.5, facilitando
    a configuração que antes era toda via XML. O uso de annotations fornece recursos muito 
    poderosos para manter o código limpo e conciso. São úteis para detectar beans automaticamente, 
    criar instâncias e injetar nos objetos que precisam deles.
    

## @SpringBootApplication
É como o botão de "iniciar". O Spring Boot sabe que deve começar a rodar o aplicativo e configurar tudo para nós.

## @RestController
Ajuda a direcionar as requisições HTTP para os métodos corretos, garantindo que cada URL acesse a parte certa do nosso 
código. É um sinal de que a classe vai cuidar das requisições e respostas Http, tornando possível conversar com o app 
pela internet.

## @Controller
Anotação a nível de classe, indica que a classe precisará ser exposta como um bean de controlador e injetada nos 
consumidores que indicaram que precisam dele. Fornecem suporte para especificar coisas específicas de Controller, como o
caminho, o HTTP, o corpo da solicitação, parâmetro de consulta, parâmetro do caminho, tipos de conteúdo aceitos, etc.

## @RequestMapping
Mapeia URLs para métodos específicos nos controladores, organizando o fluxo das informações.

## @Component
Transforma uma classe em um componente gerenciado pelo Spring. O Spring passa a cuidar da criação e gerenciamento de
objetos dessa classe. Um dos exemplos mais populares de uma anotação @Component são as classes @Controller que atuam como 
um controlador Spring MVC e manipulam solicitações HTTP. Deve ser usada em nível de classe, e ao ser referenciada em 
outro contexto (obter a instância), pode-se usar a anotação @Autowired.

## @Repository
Marca uma classe como um repositório, responsável por acessar e manipular os dados. Indica que a classe se comunica com
o banco de dados, facilitando a busca, salvamento e atualização de informações.

## @Value
Ajuda a pegar valores de configurações e usar no código. É útil para configurar coisas de forma flexível

## @Autowired 
A nível de campos ou construtor da classe. Faz a injeção de dependências, permitindo que o Spring conecte automaticamente 
os componentes necessários. Colocando automaticamente os objetos necessários nos lugares certos do código. Ou seja, campos,
métodos, construtores, sem precisar criar tudo manualmente.

## @Configuration
Marca uma classe como uma fonte importante de definições de bean para o Spring Boot. É como o manual de instruções que
ensina ao Spring como montar certas partes do aplicativo.

## @Bean
A nível de método/função e indica que este, cria e retorna um bean que pode ser usado como dependencia em outras classes
do projeto. Comumente usado nas classes anotadas com @Configuration, ao colocar @Bean você diz ao spring que quer criar 
esse objeto e deixar ele disponível para outras classes utilizarem ele como dependência, por exemplo.

## @Import
Importa configurações de outras classes.

## @ComponentScan
Encontra e registra todos os componentes, serviços e repositórios no projeto. Faz uma varredura no pacote para todas as
classes @Configuratioin.

## @Service
A nível e classe, usada para classes que atuam como classes de serviço, contendo lógica de negócios. Assemelha-se ao 
@Controller usada no Spring MVC, sendo uma especialização de @Component (assim como @Controller e @Repository)
que não possui estado encapsulado.
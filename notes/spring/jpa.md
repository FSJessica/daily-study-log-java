# 🔷 O que é JPA
JPA (Java Persistence API), é uma especificação para mapeamento objeto-relacional em Java, fazendo uso de objetos Java em vez de SQL manual, isso se dá através de anotações, consultas JPQL e APIs. Projeto que faz parte do sistema Spring, para facilitar o uso de base de dados em uma aplicação Spring.
Importante lembrar que o JPA não implementa, é apenas uma especificação. Quem implementa é o Hibernate.

# 🔷 O que é Hibernate

É um framework OMR (Object Relational Mapping), ou seja, ele transforma objetos em tabelas SQL. É ele que vai gerar o SQL, interação com o banco de dados, salvar os objetos, buscar os dados... sem a necessidade de escrever SQL "puro"

# 🔷 O que é Spring Data JPA

É a camada de abstração adicional, utiliza recursos do JPA mas também recursos próprios. Essa ferramenta diminui consideralvelmente a necessidade de escrever muito código manualmente(como interfaces referentes aos repositórios ou DAOs), pois automatiza muitos processos(repositories, queries simples, CRUD, integração com hibernate) e deixam algulidades pré-instaladas, como paginação de registros e ordenação das consultas.

# 🔷 JPA annotations

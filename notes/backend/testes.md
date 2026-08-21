# 🔷 Testes Unitários

São testes que verificam a menor parte do código de maneira isolada geralmente uma método ou uma função.
Com eles você pode encontrar erros rapidamente, garantir que o código continua funcionando após alterações, testar cada 
parte do sistema separadamente.

Os testes unitários estão na base da pirâmide de testes, sendo estes os mais rápidos, e a melhor maneira de detectar 
erros logo
no início da aplicação, evitando erros maiores no futuro.

![img.png](img.png)

## JUnit

O JUnit é um framework de código aberto para a linguagem Java usado para criar e executar testes unitários 
automatizados.
Ele segue o padrão AAA (Arrange, Act, Assert): prepara os dados, executa a ação e verifica o resultado esperado com 
comandos assert.
Estrutura Básica (Padrão AAA)

- Anotação @Test: Indica ao framework que o método é um teste executável
- Assinatura: Deve ser public void e sem parâmetros.
- Arrange (Preparação): Cria objetos e define variáveis de entrada.
- Act (Ação): Executa o método que você quer testar.
- Assert (Verificação): Compara o resultado obtido com o esperado usando assertEquals, assertTrue, entre outros.

## Mockito

O Mockito é um popular framework de testes em Java usado para criar objetos simulados (mocks). Ele serve para isolar a 
classe que você quer testar, simulando o comportamento de dependências externas como bancos de dados, APIs ou outras 
classes complexas, permitindo testes rápidos e previsíveis. 

Como o Mock Funciona
Substituição: O objeto real é trocado por um objeto simulado (o mock) que possui a mesma interface.
Configuração: Você define antecipadamente o que o mock deve retornar quando um método específico for acionado.
Isolamento: O código roda focado apenas na lógica principal, sem depender de internet, arquivos ou servidores externos.
Verificação: O teste checa se os métodos do mock foram chamados da maneira correta e com os parâmetros certos. 
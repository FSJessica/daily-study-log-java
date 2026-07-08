#  🔷 O que é AWS

## Modelo cliente-servidor

 É uma arquitetura de rede distribuída que divide tarefas entre provedores de recursos (servidores) e solicitantes
 de recursos (clientes).  Neste modelo, o cliente inicia a comunicação enviando uma solicitação, e o servidor aguarda,
 processa o pedido e retorna a resposta, geralmente através de protocolos como HTTP, FTP ou SMTP.

## Princípio on demand

Operações On-Demand funcionam com base nas necessidades, ou encomendas, dos clientes, ou seja, é um produto ou serviço
sob demanda. Isso quer dizer que essa estratégia busca atender aos clientes da forma mais conveniente possível,
de acordo com as solicitações realizadas.

## O que é computação em nuvem

É o fornecimento de serviços de computação, incluindo servidores, armazenamento, bancos de dados, sistema de rede,
software, análise e inteligência, pela Internet (“a nuvem”) para oferecer inovações mais rápidas, recursos flexíveis e
economias de escala. Você normalmente paga apenas pelos serviços de nuvem que usa, ajudando a reduzir os custos
operacionais, a executar sua infraestrutura com mais eficiência e a dimensionar conforme as necessidades da sua
empresa mudam.

## Tipos de implantação na nuvem:

- cloud: Flexibilidade de migrar os recursos existentes para a nuvem, projetar e criar novas aplicações no ambiente de
nuvem ou usar uma combinação de ambos.

- on-premises: Usa ferramentas de virtualização e gerenciamento de recursos não oferece muitos dos benefícios da
computação em nuvem. No entanto, às vezes é procurada por sua capacidade de fornecer recursos dedicados e baixa latência.

- hybrid: Os recursos baseados em nuvem e a infraestrutura on-premises funcionam juntos. Ideal para situações em que as
aplicações legadas devem permanecer on-premises devido às preferências de manutenção ou aos requisitos regulatórios.

## Benefícios da nuvem:
- capacidade de pagar conforme o uso (trocas de despesas fixas por despesas variáveis)
-economia de escala massiva.
- parar de advinhar a capacidade
- aumento de velocidade e agilidade
- parar de gastar dinheiro mantendo data-centers
- globalização em minutos

## Infraestrutura global AWS
- Alta disponibilidade
- Tolerância a falhas
- zonas de disponibilidade (AZ's)

 ## Modelo de responsalididade compartilhada

### Responsabilidade do cliente (segurança NA nuvem)

- Dados do cliente
- Criptografia de dados do cliente

### Responsabilidade do cliente OU da aws(depende do serviço)

- criptografia de dados do servidor
- proteção de dados em trânsito
- plataforma, aplicações, gerenciamente de identidades e acessos
- configuração do sistema operacional, rede e firewall

### Responsabilidade da aws(segurança DA nuvem)

- atualização de softwares de conputação, armazenamento, banco de dados e redes
- infraestrutura global da AWS e hardware(regiões AZs e locais de borda)

## Amazon Elastic Compute Cloud (EC2)

- Altamente flexível
- Econômico
- Rápido

### Multilocação

Compartilhamento dos recursos fornecidos pelo host

- Escalar verticalmente : aumentar ou diminuir o tamanho das instâncias conforme necessidade.
- Escalar horizontalmente:

## Famílias do Amazon(EC2)

- Uso geral: 
  - Equilíbrio de recursos
  - cargas de trabalho diversas
  - serviços web
  - repositórios de código

- Otimizadas para computação:
  - Tarefas com uso intensivo de computação
  - servidores de jogos
  - computação de alto desempenho (HPC)
  - tarefas de aprendizado de máquina
  - modelagem científica
  
- Otimizadas para memória:
  - tarefas com uso intensivo de memória

- Computação acelerada
  - cálculos de ponto flutuante
  - processamento grafico
  - correspondência de padrões de dados
  - aceleradores de hardware
  
- Otimizadas para armazenamento
  - alto desempenho pra dados armazenados localmente

## Interagindo com serviços da AWS

- Console de gerenciamento da AWS
  - configura ambientes de testes
  - visualizar faturas da aws
  - monitorar recursos
  - gerenciar tarefas não técnicas
  
- Interface de linha de comando da AWS(CLI)
  - automatizar tarefas por meio de scripts
  
- Kit de desenvolvimento de software (SDK)
  -integração dos serviços da aws em suas aplicações fornecendo APIs para várias linguagens de programação

## O que é AMI

Imagens de máquina da amazon (AMI - amazon machine image) pode ser definida como um modelo pré-configurado de máquina virtualque já inclui todos os elementos essenciais para a criação de uma nova instância

## componentes

sistema operacional
estrutura de armazenamento
definição de arquitetura
permissões para o lançamento da instância
aplicações de software previamente instaladas

* obs.: a partir de uma ṕunica AMI é possṕivel implantar múltiplas instâncias EC2

## 3 maneiras de usar AMI

criar a sua própria AMI
usar AMIs da AWS disponíveis
comprar no AWS marketplace

## Repetibilidade da AMI
mesma configuração -> implantações automatizadas -> ambientes consistentes -> scaling com confiança

## Opções de cobrança do EC2
- sob demanda - paga conforme capacidade computacional que sua aplicação consome
- saving plans - preços mais baixos (72% desconto) em troca de um compromisso de 1 a 3 anos (é possível alterar o tamanho da EC2)
- instâncias reservadas - (75% desconto) para cargas de trabalho instável e previsível (não altera tamanho de EC2) 1 ou 3 anos
- instâncias spots - (90% desconto) AWS pode recuperar instâncias a qualquer momento e cliente recebe aviso de 2 minutos para salvar o progresso
- hosts dedicados - servidor físico real para reserver para uso exclusivo
- instâncias dedicadas - instância dedicada exclusiva isolando operações de outros clientes da aws

## Escalabilidade vs Elasticidade

escalabilidade é a capacidade do sistema ser expandido ao longo do tempo. habilidade para suportar uma carga de trabalho crescente por meio de adição de mais recursos.
 - escala vertical: aumenta o poder de processamento das máquinas atuais
 - escala horizontal: adição (scale out) ou remoção (scale in) de novas máquinas à infraestrutura
elasticidade trata do ajuste dinâmico de recursos para atender demandas momentâneas. permite o sistema aumentar ou diminuir recursos de forma automatizada em resposta às variações de demanda em tempo real

## Amazon EC2 Auto Scaling

Ajusta automaticamente o número de instâncias com base nas mudanças na demanda da aplicação.
 - escalonamento dinâmico - se ajusta em tempo real às flutuações de demanda.
 - escalonamento preditivo - agenda preditivamente o número certo de instâncias previstas

### Groupo deauto scaling

precisa ter três configurações principais:
 - capacidade mínima - menor número de instâncias necessárias para manter a aplicação executando
 - capacidade desejada
 - capacidade máxima

## Elastic Loud Balancing (ELB)

Serve para distribuir de forma automática o fluxo de tráfego de uma aplicação entre diversos recursos com o objetivo de otimizar o desempenho e a confiabilidade
atua como ponto centralizado de entrada para todo o trafégo web.
principais benefícios:
 - distribuição eficiente de tráfego
 - auto scaling
 - gerenciamento simplificado

métodos de roteamento:
 - round robin
 - menor número de conexões
 - hash de ip
 - menor tempo de resposta

## Amazon EventBridge
serviço com tecnologia sem servidor (serverless) que conecta diferentes partes da aplicação usando eventos
serve para quando existem etapas intermediárias entre o começo e o fim, que serão acionadas (eventos)

## Amazon Simple Queue Service (SQS)
enfileiramento de mensagens projetado para estabelecer uma comunicação de alta confiabilidade entre diferentes componentes de software
permite o envio, armazenamento e recebimento de mensagens com garantia de que nenhuma mensagem será perdida

## Amazon Simple Notification Service (SNS)
opera com base no modelo de publicação/assinatura. publicadores enviam mensagens para múltiplos assinantes por meio de canais centralizados
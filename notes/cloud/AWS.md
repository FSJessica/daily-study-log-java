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

## Tipos de gerenciamento
### Gerenciado
você tem um serviço pré-configurado para dar mais conveniencia
### Não-gerenciado
você tem total responsabilidade para personalizar o serviço
### Serverless
(sem servidor) você não pode ver ou acessar a infraestrutura subjacente

## AWS Lambda
um serviço que executa código em resposta a eventos sem necessidade de provisionar ou gerenciar servidores

## Amazon Elastic Container Service (ECS)
- simplificado e integrado
- possibilidade de definir parâmetros
- serviço totalmente gerenciado

## Amazon Elastic Kubernetes Service (EKS)
- plataforma de código aberto
- mais complexa
- mais controle e flexibilidade

## Amazon Elastic Container Registry (ECR)
- registro de conteineres totalmente gerenciado
- armazena imagens de conteiner

## Amazon Fargate
alternativa de computação serverless para usar quando não quer configurar os serviços EC2

### Como as peças se encaixam
- carrega as imagens de conteineres no ECR
- escolha um serviço de orquestração com base no que precisa (ECS ou EKS)
- escolha a opção de computação (EC2 ou Fargate)

## AWS Elastic Beanstalk
- provisionamento simplificado
- gerenciamento de configurações
- visibilidade e controle

## AWS Batch
- gerenciamento de infraestrutura
- suporte à processamento paralelo
- escalabilidade automática

## Amazon Lightsail
- simplicidade
- bom custo benefício
- infraestrutura gerenciada

## AWS Outposts
- solução de nuvem híbrida
- ambientes consistentes
- baixa latência e residência de dados

## escolha de regiões AWS: considerações
- conformidade - devem permanecer dentro dos requisitos de uma área
- proximidade - deve escolher uma proximidade mais próxima dos clientes
- disponibilidade de recursos - escolher uma região que tenha todos os recursos necessários
- preço - alguns locais são mais econômicos para operar

## Amazon CloudFront
rede de entrega contínua, tem o objetivo de servir o conteúdo mais próximo possível dos usuários. trabalha com locais de borda
### Locais de borda
serve como uma memória cache para diminuir a latência na entrega do conteúdo

## CloudFormation
serviço que ajuda a modelar e configurar os recursos da AWS para que vc gaste menos tempo gerenciando esses recursos e tenha mais tempo para se concentrar nas aplicações executadas na AWS

## Amazon Virtual Private Cloud (VPC)
permite provisionar uma seção logicamente isolada da aws em que vc pode executar recursos da aws em uma rede virtual definida por vc

### benefícios VPC
- aumentar segurança
- economizar tempo
- controle de acesso

### Sub-rede
sub-seção de uma vpn, pública ou privada. privada = usada para conter recursos como banco de dados que armazena informações sensíveis. pública = contém recursos como um site voltado pro cliente

### Gateway de internet
conexão entre VPC e internet.

### Gateways privados virtuais
permite que o tráfego protegido da internet ingresse na VPC. precisa de uma conexão de rede privada virtual (virtual private network - VPN).

### VPN (virutal private network)
criptografa o tráfego na internet para proteger de qualquer pessoa. possibilita estabelecer conexão VPN entre VPC e a rede privada

## AWS Client VPN
serviço de rede usado para conectar profissionais remotos e redes on-premises na nuvem. fornece autenticação avançada e acesso remoto, é elástica etotalmente gerenciada.

## AWS Site-to-Site VPN
cria conexão segura entre o data center ou as filiais e seus recursos da nuvem. oferece alta disponibilidade, sessões seguras e privadas e acelera aplicações.

## AWS PrivateLink
tecnologia altamente disponível e dimensionável que pode ser usada para conectar à VPC de forma privada a serviços e recursos como se estivessem na sua VPC. ajuda a proteger o tráfego e a se conectar com regras de gerenciamento simplificadas.

## AWS Direct Connect
permite estabelecer uma conexão privada dedicada entre sua rede e à VPC na nuvem. reduz custos de rede e aumenta a quantidade de largura de banda.
- aplicações sensíveis a latência
- migração ou transferência de dados em grande escala
- arquitetura de nuvem híbrida

## Serviços adicionais de gateway
- AWS Transit Gateway
- Gateway de conversão de endereços de rede (NAT)
- Amazon API Gateway

## ACLs de Rede
firewall virtual que controla o tráfego de entrada e saída no nível da sub-rede. cada conta aws tem uma ACL de rede padrão. ao configurar a VPC, vc pode usar a padrão ou criar ACLs de rede personalizadas.
- padrão - permite entrada e saída normalmente
- personalizada - bloqueia entrada e saída até que adicione as regras

obs.: são stateless, não lembram de nada e verifica os pacotes em todos os sentidos: entrada e saída

## Grupos de segurança
controla o tráfego de entrada e saída no nível do recurso. 
- padrão - nega todo tráfego de entrada e permite todos de saída
- personalizada - configura qual tráfego deve ser permitido, qualquer outro tráfego seria negado.

obs.: são statefull, as decisões lembram das decisões anteriores para pacotes recebidos

![img.png](img.png)

## Amazon Route 53
é um DNS que fornece uma maneira confiável e enonomica de rotear os usuários finais para aplicação de internet.
capacidade de gerenciar os registros DNS para nomes de domínio, vc pode registrar novos nomes de domínio diretamente no route 53.

## Amazon CloudFront
é um serviço de rede de entrega de conteúdo (CDN) que entrega o conteúdo com tempos de carregamentos mais rápidos, economia de custos e confiabilidade.

## AWS Global Accelerator
é um serviço que usa rede global da aws para melhorar a disponibilidade, o desempenho e a segurança das aplicações. ela usa roteamento inteligente de tráfego e failover rápido se algo der errado em um dos locais de sua aplicação.

## Armazenamento

### Armazenamento em bloco
- divide os dados em partes gerenciáveis chamados blocos
- podem ser atualizados bloco por bloco, o arquivo inteiro não precisa ser alterado
- ideal para aplicações ou banco de dados com atualizações rápidas e frequentes
tipos:
- armazenamento de instâncias do ec2
  - sem persistência de dados
  - benefícios: armazenamento disponível automaticamente, econômico, alto desempenho
- Amazon Elastic Block Store (EBS)
  - com persistência de dados
  - beníficios: migração de dados, alterações no tipo de instância, recuperação de desastres, otimização de custos, ajuste de desempenho

### Armazenamento de objetos
tipos: Amazon Simple Storage Service (S3)
- objetos + dados + ID único + metadados
- requer reescrita do objeto inteiro para cada alteração
- organizados em estruturas planas chamadas buckets
- ideal para grandes arquivos que não mudam constantemente

### Armazenamento de arquivos
tipos: Amazon Elastic File System (EFS), Amazon FSx
- usa sistema de arquivos hierárquico que pode ser compartilhado por aplicações
- implantação direta sem modificação de código
- ideal para aplicações que requerem acesso compartilhado

### Serviços de armazenamento adicionais
não se encaixam nas opções acima, mas são importantes
tipos: AWS Storage Gateway, AWS Elastic Disaster Recovery

## Amazon Data Lifecycle Manager
- programar criação de snapshots
- definir políticas de retenção
- gerenciar ciclos de vida
- aplicar políticas de backup consistentes
fluxo de trabalho:
1. criar política de snapshots
2. selecione o tipo de recurso de destino
3. excluir volumes
4. defina horários personalizados
5. aplique ações adicionais

### Snapshots do EBS
- snapshots = são backups pontuais do volume do EBS, usado para recuperação de desastres, migração de dados
- benefícios: proteção e recuperação de dados, flexibilidade operacional, econômico

## Amazon Simple Storage Service (S3)
- armazene dados como objetos
- armazene objetos em buckets
- upload de objetos com até 5tb
- crie múltiplos buckets
- versionamento de objetos

benefícios:
- armazenamento praticamente ilimitado
- gerenciamento do ciclo de vida de objetos
- ampla variedade de casos de uso

segurança no S3:
- acesso privado por padrão
- políticas de acesso aos buckets
- urls pré-assinadas
- pontos de acesso do S3
- logs de auditoria do S3

## Classes de Armazenamento e casos de uso do S3

### S3 Standard
armazenamento de uso geral para aplicações em nuvem, é usado por padrão

### S3 Intelligent-Tiering
é útil se os dados tiverem padrões de acessos desconhecidos, move automaticamente o dado para o padrão mais economico com base na frequencia de acesso. armazena em 3 camadas:
- acesso frequente
- pouco frequente
- acesso instantâneo

### S3 Standard Infrequent-Access (Standard-IA)
é usado para dados acessados com menos frequência, mas que exigem acesso rápido quando necessário

### S3 One Zone Infrequent-Access (One Zone-IA)
armazena dados em uma única zona de disponibilidade, reduzindo custos em comparação como Standard-IA

### S3 Express One Zone
armazena em umna única zona de disponibilidade e foi criado especificamente para fronecer acesso consistente a dados mais frequentes

### S3 Glacier Instant Retrieval
arquivar dados raramente acessados e que requer recuperação em milissegundos

### S3 Glacier Flexible Retrieval
oferece armazenamento de baixo custo para dados acessados de 1 a 2 vezes por ano, com recuperação rápida

### S3 Glacier Deep Archive
tem o menor custo e oferece suporte a à retenção a longo prazo, podendo manter o dado por sete a dez anos ou mais. tem tempo de recuperação de até 12 horas.

### S3 Outposts
fornece armazenamento de objetos para o ambiente on-premises AWS Outposts, desempenho ideal quando os dados precisam permanecer próximos às aplicações on-premises

## S3 LifeCycle
- ações de transição - definem quando os objetos fazem a transição para outra classe de armazenamento
- ações de expiração - definem quando os objetos expiram e são excluídos

## Amazon Elastic File System (EFS)
serviço de armazenamento totalmente gerenciado e dimensionável para uso com AWS Cloud Services e recursos on-premises. escala automaticamente para petabytes à medida que adiciona ou remove arquivos sem interromper aplicações.

Benefícios do EFS:
- redundância multi-AZ
- acesso compartilhado
- armazenamento elástico

classes de armazenamento EFS:
- armazenamento padrão
- armazenamento de uma zona
- armazenamento de arquivos

ciclo de vida EFS:
- transiação para IA (infrequent-access)
- transição para arquivo
- transição para padrão

## Amazon FSx
oferece suporte a vários protocolos de sistemas de arquivos, incluindo windows file server, lustre, OpenZFS e NetApp ONTAP

benefícios do FSx:
- integração do sistema de arquivos
- infraestrutura gerenciada
- armazenamento dimensionável
- econômico

## AWS Storage Gateway
possibilita integração perfeita de ambientes on-premises com armazenamento em nuvem

benefícios:
- integração perfeita
- gerenciamento de dados aprimorado
- cache local
- otimização de custos

tipos de gateway:
- Amazon S3 File Gateway
- Gateway de volumes
- Gateway de fitas

## Elastic Disaster Recovery
replica workloads críticas para aws com o mínimo de tempo de inatividade. recuperação rápida.

benefícios:
- resiliência empresarial
- recuperação de desastres simplificada
- otimização de custos

## Amazon RDS (RELATIONAL DATABASE SERVICE)

- Aplicação automatizada de patches
- backups
- redundância
- failover
- recuperação de desastres

### Beneficios:

- otimização de custos
- implantação multi-az
- otimização de desempenho
- controles de segurança

## Amazon Aurora
- Postgresql
- mysql
- dsql
- até 15 replicas nas az's
- supporte ao AWS backup

### Benefícios

- alto desempenho e disponibilidade
- armazenamento automatizado e gerenciamento de backup
- replicação avançada e tolerância a falhas

## Amazon DynamoDB
- banco de dados relacional
- dados = itens = coleção de atributos
- atributo = nome + valor
- adicione ou remova atributos a qualquer momento

### benefícios
- escalabilidade com capacidade provisionada
- alto desempenho consistente
- alta disponibilidade e durabilidade
- criptografia de dados

## Amazon Elasticache
- simplifica a implantação, operação e escalabilidade do armazenamento de dados na memória
- automatiza o gerenciamento de tarefas-chave
- melhora a performance e eficiência
- oferece escalabilidade flexível
- reduz as operações em geral

### benefícios
- alto desempenho para instâncias Redis, Valkey ou Memcached
- alta disponibilidade
- replicação em várias AZs
- criptografia de dados

## outros serviços de banco de dados
- Amazon DocumentDB
- AWS Backup
- Amazon Neptune

## serviços de IA/ML
nível 1
### serviços de linguagem
- Amazon Comprehend
- Amazon Polly
- Amazon Transcribe
- Amazon Translate

### serviços de pesquisa e visão computacional
- Amazon Kendra
- Amazon Rekognition
- Amazon Textract

### IA conversacional e serviços de personalização
- Amazon Lex
- Amazon Personalize

nível 2
### serviços de ML
- Amazon SageMaker IA

nível 3
### frameworks e infraestrutura de ML

## SageMaker JumpStart
casos de uso:
- implantações rápidas de modelos de ML
- soluções personalizadas e ajustadas
- experimentos e protótipos de ML

## Amazon Bedrock
casos de uso:
- IA generativa de nível empresarial
- geração de conteúdo multimodal
- IA conversacional avançada

## Produtos Amazon Q
### Amazon Q Business
casos de uso:
- solicitações de informações
- fluxos de trabalho automatizados
- extração de informações

### Amazon Q Developer
casos de uso:
- geração de código mais rápida
- confiabilidade e segurança aprimoradas
- análises automatizadas de código

## Data Analutics

### Processos de ETL (extract, transform, load)
- extrair dados de várias fontes
- transformá-los em formatos consistentes e úteis
- carregá-los no sistema de destino, como um data warehouse

### Serviços do AWS Data Pipeline
- Amazon Kinesis e AWS Glue para ingestão de dados
- Amazon S3 e Amazon Redshift para armazenamento
- Amazon EMR para processamento
- Amazon Quicksight agora é parte do Amazon Quick Suite

### Ingestão de dados
- Amazon Kinesis Data Streams
- Amazon Data Firehose
### Armazenamento de dados
- Amazon S3
- Amazon Redshift
### Catalogação de dados
- AWS Glue Data Catalog
### Processamento de dados
- AWS Glue
- Amazon EMR
### Análise e visualização de dados
- Amazon Athena
- Amazon Redshift
- Amazon QuickSight
- Amazon OpenSearch Service

## controles de segurança

- modelo de responsabilidade compartilhada
- gerenciamento adequado de permissoes e acesso
- proteção completa de rede e aplicaçõe
- proteção de dados
- detecção e resposta a incidente

# AWS IAM

- usuário raiz
- Usuários
- Grupos
- Políticas

- Função/role

  - Permissões associadas
  - Permitem ou negam
  - Assumidas por períodos temporários
  - Não tem usuário e senha

## serviços adicionais de gerenciamento de acesso

- centro de identidade do AWS IAM
- AWS Secrets Manager
- AWS Systems Manager

## proteção da AWS por meio de infraestrutura

- grupos desegurança
- elástic load balancing (ELB)
- regiões AWS

## proteção da AWS por meio de serviços

- AWS shield - protege automaticamente os clientes da AWS contra os tiposmais comuns e frequentes de ataques DDos, sem custo.
- AWS shield avançado - serviço pago que fornesse diagnósticos detalhados de ataques e a capacidde de detectar e mitigar aqueles ataques elaborados de DDoS.
- AWS WAF - firewall de aplicativo web que monitora as solicitações de rede que entram em seus aplicativos web.

## AWS Certificate Manager

- provisiona, gerencia e implanta certificações SSL/TSL
- Protege vários serviços da AWS e recursos internos conectados.

## tipos de criptografia de dados

- criptografia de dados em repouso: os dadps estão ociosos e não se movem, como quando estão armazenados em um banco de dados.
- criptografia de dados em trânsito: os dados estão se movendo entre locais, como qundo estão sendo enviados de um banco de dados para uma aplicação.

## Proteção de dados da AWS

### integrada

- Amazon S3
- Amazon EBS
- Amazon DynamoDB

## Serviços de proteção de dados da AWS

- AWS Key Management Service (AWS KMS)- criare gerenciar chaves criptográficas.
- Amazon Macie- monitorar dados sensíveis em repouso.
- AWS Certificate Manager(ACM) - protege dados em trânsito

## Detectar e responder a incidentes de segurança

## Amazon Inspector

- Executa avaliações de segurança automatizadas.
- Identifica desvios das melhores práticas de segurança
- Detecta exposições no Amazon EC2
- Aponta vulnerabilidades na instalação de softwares

## Amazon GuardDuty

- Monitoramento contínuo
- Detecção de ameaças potencializadas com IA/ML

## Amazon Detective

- Sondagens automáticas de segurança de forma simplificada
- Visualização interativa de ameaças
- Insights potencializados com IA Generativa.

## Amazon Security Hub

- Uma visão abrangente de segurança
- Monitoramento automático e eficiente
- Agrupamentos acionáveis de insights.

## AWS Marketplace recursos de segurança

- Ferramentas de detecção e prevenção de ameaças
- Ferramentas de gerenciamento de identidade e acesso
- Proteção de dados desenvolvimento da AWS
- Ferramentas de conformidade e governança


## Monitoramento de recursos na nuvem AWS

- Segurança
- Monitoramento
- Auditoria
- Conformidade

## Benefícios de monitorar seus recursos de nuvem

- Manter a segurança
- Responder proativamente
- garantir a confiabilidade
- Monitorar custos
- Melhore o desempenhp

## Amazon CloudWatch

- Acesso centralizado a todas as suas métricas
- Visibilidade de todas aplicações, infraestrutura e serviços
- Redução do tempo médio de resolução (MTTR) e melhora do TCO
- Insights para otimizar aplicações e recursos operacionais
- Métricas, alarmes, Painéis, logs

## AWS CloudTrail

rastreia a atividade do usuário e o uso da API  na nuvem AWS, on-premises e até mesmo com outros provedores de nuvem.
Fornece um histórico detalhado das chamadas de API  para que seja possível acompanhar as alterações e identificar quem e quando as fez.

Benefícios: fornece auditoria, monitoramento de segurança e solução de problemas operacionais.

- eventos, logs e claudtrail insights.

## Benefícios da conformidade com a AWS

Conformidade refere-se à adesão de seus recursos e dados na nuvem às regulamentações pertinentes, aospadrões do setor e às políticas internas relacionadas à segurança e proteção de dados.
A AWS ajuda você a cumprir metas e requisitos de confformidade ds seguintes maneiras:
- Ao herdar os controles de segurança mais recentes que a AWS usa em sua própria infraestrutura
- Ao validar para terceiros para milhares de requisitos globais
- Ao simplificar e automatizar a conformidade
- Relatórios de conformidade sob demanda

## AWS Artifact

 Oferece de maneira gratuita acesso sob demanda a relatórios de segurança e conformidade da AWS e a determinados contratos on-line

Benefícios: ajuda a gerenciar em grande escala, economizar tempo com acesso sob demanda a relatórios de conformidade e implantar com mais confiança.

- AWS Artifact Agreements
- AWS Artifact Reports.

## AWS Config
Serviço para avaliar, analisar e auditar as configurações dos recursos da AWS.
Benefícios: Ajuda a avaliar as configurações em relação ao estado desejado, gerenciar alterações na configuração de recursos e simplificar a solução de problemas e a remediação.


- Rastreia continuamente as mudanças
- Cria regras padronizadas
- Gera relatórios de conformidade

## AWS Audit Manager

Serviço que audita continuamente seu uso da AWS para simplificar a avaliação de risco e conformidade. Ela ajuda a coletar evidências
e gerenciar dados de auditoria.

Benefícios: a solução Audit Manager economiza tempo com a coleta automatizada de evidências, simplifica a colaboração entre as equipes e ajuda
a garantir  a integridade das aditorias com permissões somente para leitura.

- Avalia suas políticas
- Gerencia as revisões
- Cria relatórios prontos para auditoria
- Possui estruturas pré-construídas

## AWS Organizations

Ajuda a gerenciar e controlar o ambiente de maneira centralizada à medida que seus recursos da AWS expandem e são dimensionados.

Benefícios: rápido scaling de seu ambiente ao criar de forma programática novas contas da AWS para recursos e equipes. Ela também ajuda a simplificar
o gerenciamento de permissões por meio de SCPs e gerenciar e otimizar os custos em suas contas e recursos da AWS

## Governança na nuvem AWS

- AWS Control Tower
- AWS Service Catalog
- AWS License Manager

## AWS Control Tower

Pode ser usado para impor e gerenciar regras de governança em escala para segurança, operações e conformidade em todas as suas organizações e contas na nuvem AWS.

Benefícios: Pode te ajudar a economizar tempo e , ao mesmo tempo, fornecer governança. Usa controles pré-configurados que podem ajudar a configurar de forma rápida
ambientes com várias contas, automação com governança  integrada e integração de software de terceiros em escala.

## AWS Service Catalog

É possível criar, compartilhar e organizar por meio de um catálogo com curadoria de recursos da AWS. É possível implantar recursos básicos de rede e
ferramentas de segurança para novas contas da AWS para poder governar de forma consistente.

Beefícios: economiza tempo ao agilizar a localização e a implantação de recursos de nuvem de autoatendimento aprovados.
Também ajuda a manter a agilidade e, ao mesmo tempo, melhorar a governança dos recursos em várias contas.

## AWS License Manager

É um serviço que ajuda a gerenciar as licenças de software e ajustar os custos de licenciamento.

Benefícios: a solução License Manager ajuda na visibilidade e no controle, no rastreamento e no gerenciamento de licenças e na redução do risco de não conformidade com as licenças.


## AWS Health Dashboard

É possível visualizar informações de integridade específicas da conta e obter atualizações de eventos da solução AWS Health.
Também é possível usar a solução AWS Health de forma programática com o uso da API da solução AWS Health, disponível com a solução AWS Premiun Support

Benefícios: fornece informações valiosas, serve como fonte de dados para eventos e mudanças. 

## Trusted Advisor

É possível avaliar de forma contínua seu ambiente da AWS  com o uso de verificações de práticas recomendadas em várias categorias.

Benefícios: ajuda a manter o alinhamento com as práticas recomendadas, priorizar recomendações e otimizar os recursos em escala na AWS

## IAM Access Analyzer

Fornece recursos para definir, verificar e refinar permissões ao analisar o acesso externo e validar a possibilidade de suas políticas atenderem aos padrões de segurança corporativos.

Benefícios: Oferece benefícios como refinar permissões, validar políticas do IAM e pode ajudar a atingir as metas de acesso com menos privilégios, além de automatizar as análises de políticas do IAM.

## Principais conceitos de definição de preço da AWS

- Pagamento conforme o uso
- economize com um compromisso
- Pague menos usando mais

## Fatores determinantes de custo

- computação
- Armazenamento
- Transferência de dados de saída

## Serviços de preços e cobrança da Aws

## AWS Organizations
fornece gerenciamento e governança centralizados do ambiente da AWS. É possível criar, agrupar e geranciar contas.
Também é possível aplicar políticas de segurança no nível da conta e consolidar o faturamento com váriias contas com o uso de um 
único método de pagamento.

## Painel do gerenciamento de faturamento e custos da AWS

centraliza o gerenciamento de custos ao mostrar cobranças atuais , uso, previsões e detalhamentos segmentados.
Fornece tbm ferramentas para gerenciar pagamentos, visualizar faturas, definir orçamentos e consolidar o faturamento.

## AWS Budgets

A solução AWS Budgets ajuda a definir orça,emtos personalizados e envia alertas quando os custos, o uso, autilização ou a cobertura da solução savings plnans
e instâncias reservadas excedem os limites definidos.

## AWS Cost Explorer

Ajuda a visualizar, analisar e gerenciar os custos e o uso da AWS com grafos, relatórios e previsões interativos. Ela fornece informações sobre padrões de gastos, tendências e recomendações de instâncias reservadas.

## Calculadora de preços da AWS

É possível inserir configuraçções específicas, como tipos de instância, opçẽs de armazenamento e volumes de transferência de dados.

## Planos de solução Support

- suporte básico:  incluído para rodos os clientes da AWS
- suporte para desenvolvedores: recomendado para experimentar ou testar na AWS
- suporte business: nível minino recomendado para workloads de produção na AWS
- suporte empresarial rápido: recomendado para workloads críticas de produção e negócios na AWS
- enterprise support: recomendado para workloads críticas para os negócios e essenciais para operação na AWS

## AWS Marketplace

Catálogo digital com milhares de ofertas de software de provedores independentes de software. As soluções oferecidas são:

- Software como serviço (SaaS)
- Machine learining(ML) e IA
- Dados e analytics

## Rede de parceiros AWS

Comunidade global que usa tecnologias, programas e serviços para clientes. Alguns benefícios incluem:

- benefícios de financiamento
- eventos de parceiros da AWS
- treinamento e certificação de parceiros da AWS.



## Migração

- fase de avaliação: cria o caso de negócios para a migração e avalia sua prontidão.
- fase de mobilização: prepara a organização e mobiliza os recursos necessários para a migração.
- migrar e modernizar: usa sua estratégia, seu plano e as práticas recomendadas para migrar e modernizar.

## cloud adoption framework (CAF)

### perspectivas do AWS CAF

- negócios
- pessoas 
- governança
- plataforma
- segurança
- operações

## 7 Rs da Migração

- Rehost
- Relocate
- Replatform
- Refactor
- Repurchase
- Retain
- Retire

## Serviços e ferramentas de Migração

- AWS Appliation Discovery
- AWS Application Migration service
- Migration Evaluator
- AWS Migration Hub

Benefícios: 

- Processos de migração simplificados
- Riscos reduzidos de erros ou tempo de inatividade
- economia de custos.
- tempo mais rápido para obter valor na nuvem

FASE DE AVALIAÇÃO:

- Migration evaluator

FASE DE MOBILIZAÇÃO:

- Application Discovery Service
- Migration HUb

FASE DE MIGRAÇÃO E MODERNIZAÇÃO

- Application Migration service.

## Migração de bancos de dados para a AWS

- AWS DMS (Database Migration Service): viabiliza a migração rápida e segura de bancos de dados e a execução de tarefas contínuas de replicação
de dados para bancos de dados ativos e data warehouses.
Benefícios: manutensão de alta isponibilidade e baixo tempo de inatividade durante o processo de migração. Compatível com
migrações homogeneas e heterogeneas

- AWS SCT (Schema Convertion Tool): conversão de esquemas de bancsos de dados e objetos de código de um mecanismo de banco de dados para outro.
Benefícios: simplificar migrações de banco de dados por meio da automatização de análise, recomendações e conversões de esquemas em grande escala.

## Transferências de dados on-line

- AWS DataSync: Simplifica e acelera a movimentação de grandes quantidadades de dados entre o armazenamento on-premises e os serviços de armazenamento da AWS.
Benefícios: simplificar e accelerar migrações seguras de dados. gerencia workloads de movimentação de dados com controle de utilização de largura de banda, agendamento de migração
filtragem de tarefas e relatórios de tarefas.

- AWS Transfer Family: viabili;za o gerenciamento e compartilhamentode dados com facilidade, comm transferências de arquivos simples, seguras e dimensionáveis.
fornece suporte totalmente gerenciadoo para transferencias seguras de arquivos por FTP, Secure FIle Transfer Protocol (SFTP)
, File Transfer protocol secure (FTPS) e outros protocolos.
Benefícios: Incluem a simplificação do processo de cofiguração e gerenciamento detransferências de arquivos e a redução da necessidade
de gerenciamento complexo da infraestrutura.

- AWS Direct Connect: permite estabelecer uma conexão privada dedicada entre sua rede e nuvem privada virtual (VPC) na nuvem AWS. Por ser sua conexão dedicada,
trata-se de uma maneira rápida, confiável e segura de transferir dados ou arquivos.
Benefícios: ajuda a reduzircustos de rede e aumenta a quantidade de largura de banda

## Transferências de dados off-line

- Dispositivos Snowball Edge Storage Optimized: oferecem armazenamento NVMe de alto desempenho para vibilizar a simplificação das migrações de dados de vários petabytes de locais on-premises para a AWS
Benefícios: incluem oferecer melhor desempenho computacional e maior capacidade de armazenamento com gigabytes de dados por segundo para workloads de migração
de dados com requisitos off-line.


## Serviços para desenvolvimento

- AWS CodeBuild
- AWS CodePipeline
- AWS X-Ray
- AWS AppSync
- AWS Amplify

## Serviços para aplicações empresariais

- Amazon Connect
- amazon simple emailservice (Amazon SES)

## serviços de computação para o usuário final

- amazon AppStream 2.0
- Amazon workspaces
- Amazon WorkSpaces Secure Browser (antigo Amazon workspaces web)

## serviços de IoT

- AWS iOt cORE

## AWS Well-architected framework

Pilares:

- Excelência operacional
- Segurança
- Confiabilidade
- Eficiência de desempenho
- Otimização de custos
- Sustentabilidade
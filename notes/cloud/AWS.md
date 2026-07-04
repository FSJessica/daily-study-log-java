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

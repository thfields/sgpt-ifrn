# Projeto da disciplina

### **Sistema de gerenciamento de projetos e tarefas (SGPT)**

**Descrição**: O SGPT é um sistema corporativo projetado para facilitar o gerenciamento de projetos e tarefas em equipes de desenvolvimento de software ou em ambientes corporativos em geral. O sistema permitirá a criação de projetos, atribuição de tarefas a membros da equipe, acompanhamento do progresso e análise de produtividade. Os usuários terão diferentes níveis de acesso, e notificações serão enviadas para manter todos atualizados.

### **Objetivos do projeto**

1. **Gerenciar projetos e tarefas**: Criar e gerenciar projetos e tarefas, com definição de prazos, atribuição de responsáveis e acompanhamento de status.
2. **Colaboração em tempo real**: Permitir que membros da equipe colaborem e atualizem o progresso das tarefas de forma sincronizada.
3. **Integração com mensageria (RabbitMQ)**: Usar RabbitMQ para notificações e atualização de status em tempo real.
4. **Frontend moderno com react**: Construir uma interface amigável e responsiva para facilitar a gestão de projetos e tarefas.
5. **Persistência de dados com PostgreSQL ou MySQL**: Armazenar dados sobre projetos, tarefas, usuários e histórico de alterações.
6. **Autenticação e controle de acesso**: Implementar controle de acesso com diferentes níveis de permissões.

### **Tecnologias a serem utilizadas**

1. **Backend**:
    - **Spring Boot**: Para criar a API REST que gerencia os recursos do sistema.
    - **RabbitMQ**: Para a comunicação assíncrona e notificações de mudanças de status em tarefas e projetos.
    - **PostgreSQL ou MySQL**: Para armazenamento de dados.
    - **Spring Security**: Para controle de autenticação e autorização.
    - **Spring Data JPA**: Para integração com o banco de dados e manipulação de dados.
2. **Frontend**:
    - **React**: Para construção da interface de usuário, utilizando bibliotecas como React Router para roteamento e Redux para gerenciamento de estado.
    - **Ant Design ou Tailwind CSS**: Para componentes de interface e estilização.
3. **Mensageria e Notificações**:
    - **RabbitMQ**: Para implementar filas de mensagens, facilitando notificações sobre mudanças de status.
    - **WebSockets**: Para atualização em tempo real no frontend.
4. **Autenticação e autorização**:
    - **JWT (JSON Web Token)**: Para autenticação segura e gerenciamento de sessões.
    - **Spring Security**: Para configuração de segurança no backend.
5. **Outras tecnologias**:
    - **Docker**: Para containerização do projeto, facilitando o deploy.
    - **Swagger**: Para documentação interativa da API REST.
    - **JUnit e Mockito**: Para testes automatizados.

### **Funcionalidades do sistema**

1. **Gerenciamento de projetos e tarefas**
    - Criar projetos com nome, descrição e data de entrega.
    - Criar tarefas com título, descrição, prioridade, prazo e responsável.
    - Alterar status das tarefas (ex.: "A Fazer", "Em Progresso", "Concluído").
    - Acompanhar o progresso de projetos e tarefas com gráficos de produtividade.
2. **Autenticação e controle de acesso**
    - Sistema de login com JWT.
    - Diferentes papéis de usuários: administrador, gerente e colaborador.
    - Controle de acesso para ações específicas com base no papel do usuário.
3. **Colaboração e notificações**
    - Atualização em tempo real do progresso de tarefas usando WebSockets.
    - Envio de notificações via RabbitMQ para informar sobre mudanças importantes (ex.: tarefa concluída ou novo projeto).
    - Histórico de alterações, permitindo rastrear quem fez o quê.
4. **Relatórios e análise**
    - Geração de relatórios de produtividade e desempenho.
    - Exportação de relatórios para PDF ou Excel.
    - Visão do histórico de tarefas e prazos em gráficos e tabelas.

### **Arquitetura do projeto**

1. **Arquitetura em camadas**:
    - Camadas distintas para controle de apresentação, lógica de negócios e persistência de dados.
2. **API RESTful**:
    - Exposição de endpoints para manipulação de recursos (projetos, tarefas, usuários).
3. **Comunicação assíncrona com RabbitMQ**:
    - Uso de filas para gerenciar notificações e atualizações.

### **Etapas do desenvolvimento**

1. **Planejamento**
    - Levantamento de requisitos e modelagem do banco de dados.
    - Definição dos papéis de usuário e regras de negócio.
2. **Desenvolvimento backend**
    - Criação da API REST com Spring Boot.
    - Implementação do sistema de autenticação e autorização.
    - Integração com RabbitMQ para mensagens assíncronas.
3. **Desenvolvimento frontend**
    - Desenvolvimento da interface com React.
    - Implementação de autenticação com JWT e gerenciamento de sessões.
    - Uso de WebSockets para atualizações em tempo real.
4. **Testes e validação**
    - Testes automatizados com JUnit e testes manuais no frontend.
    - Testes de carga para garantir o desempenho do sistema.
5. **Deploy e monitoramento**
    - Configuração de ambientes com Docker.
    - Monitoramento com ferramentas como Prometheus e Grafana.

### **Justificativa pedagógica**

Este projeto permitirá aos alunos desenvolverem uma solução completa e realista, lidando com conceitos e tecnologias essenciais para sistemas corporativos modernos, como Spring Boot, React, RabbitMQ, autenticação segura e persistência de dados em banco de dados relacionais.

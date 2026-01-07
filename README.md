Sistema de Mensageria com Spring Boot e Kafka
📋 Sobre o Projeto
Este projeto tem como objetivo demonstrar e introduzir os conceitos de sistemas de mensageria utilizando Spring Boot e Apache Kafka. Através de exemplos práticos, o sistema simula um ambiente de produção e consumo de mensagens, mostrando como implementar comunicação assíncrona entre serviços.

🚀 Tecnologias Utilizadas
Java 17+

Spring Boot 3.5+

Apache Kafka

Spring Kafka

Docker (para ambiente Kafka)

Maven

Spring Web (para APIs REST opcionais)

✨ Funcionalidades
✅ Produção de mensagens para tópicos Kafka

✅ Consumo de mensagens de tópicos Kafka

✅ Configuração de serializadores/deserializadores

✅ Exemplo de múltiplos consumidores

✅ Tratamento de erros e retry policies

✅ Exemplo de APIs REST para envio de mensagens




🏗️ Arquitetura


Producer API → Tópico Kafka → Consumer Service
      ↑                              ↓
  (Envia mensagem)           (Processa mensagem)





  📁 Estrutura do Projeto
text
src/main/java/
├── config/          # Configurações do Kafka
├── controller/      # APIs REST (opcional)
├── model/           # Modelos de dados
├── producer/        # Produtor de mensagens
├── consumer/        # Consumidor de mensagens
└── dto/             # Objetos de transferência

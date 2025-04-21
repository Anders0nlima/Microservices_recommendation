# 🎬 Sistema de Streaming com Microsserviços - Catalog & Recommendation

Este repositório contém dois microsserviços desenvolvidos com **Spring Boot** como parte de um sistema de streaming de vídeo:  
- **Catalog Service:** Gerencia o catálogo de vídeos.  
- **Recommendation Service:** Gera e busca recomendações personalizadas com base no usuário, se comunicando com o catálogo.

---

## 🧱 Arquitetura de Microsserviços

Cada serviço é independente, com seu próprio banco de dados (PostgreSQL) e executado localmente em uma porta diferente:

| Serviço             | Porta  | Banco de Dados |
|---------------------|--------|----------------|
| Catalog Service     | 8081   | `catalogdb`    |
| Recommendation      | 8084   | `recommendationdb` |

---

## ⚙️ Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- RestTemplate (para comunicação entre serviços)
- Postman (para testes)
- Maven

---

## 🚀 Como Executar

### 1. Suba o PostgreSQL

Certifique-se de que o PostgreSQL está rodando e os bancos `catalogdb` e `recommendationdb` foram criados:

```sql
CREATE DATABASE catalogdb;
CREATE DATABASE recommendationdb;

![image](https://github.com/user-attachments/assets/36773861-4a2d-4f11-ac5f-2793bee014b9)
![image](https://github.com/user-attachments/assets/77791360-547b-4667-8f27-a79f51c841c7)



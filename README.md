# Spring MongoDB API

![Badge](https://img.shields.io/badge/Status-%20Concluído-green) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.2.7.RELEASE-brightgreen)

Uma API REST desenvolvida com **Spring Boot** e **MongoDB**, focada em operações CRUD de forma escalável e eficiente.

## 🚀 Tecnologias Utilizadas

- **Java 8+**
- **Spring Boot 2.2.7.RELEASE**
- **Spring Data MongoDB**
- **Spring Web**
- **MongoDB**
- **Maven**

## 📌 Funcionalidades

- 📄 **CRUD de funcionários no MongoDB**
- 🔍 **Endpoints REST para operações básicas**

## 🎯 Como Executar o Projet

### 📌 Pré-requisitos
Antes de iniciar, você precisará ter instalado:
- Java 8+
- Maven
- MongoDB

### 🔧 Passos para execução
1. Clone o repositório:
   ```sh
   git clone https://github.com/EltonRiva1/springmongo.git
   ```
2. Acesse a pasta do projeto:
   ```sh
   cd springmongo
   ```
3. Configure o banco de dados no arquivo `application.properties`:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost/folhapagamento
   ```
4. Compile e execute o projeto:
   ```sh
   mvn spring-boot:run
   ```
5. Acesse a API no navegador ou via Postman:
   ```
   http://localhost:8080
   ```

## 🔥 Endpoints Principais

| Método | Endpoint               | Descrição                             |
|--------|------------------------|---------------------------------------|
| GET    | /funcionarios          | Obtém todos os funcionários           |
| GET    | /funcionarios/{codigo} | Obtém um funcionário por código       |
| POST   | /funcionarios          | Cria um novo funcionário              |
| GET    | /funcionarios/range    | Obtém funcionários por range de idade |
| DELETE | /funcionarios/por-nome | Pesquisa funcionário por nome         |

## 🛠️ Contribuindo
1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature-minha-feature`)
3. Commit suas alterações (`git commit -m 'Adicionando nova funcionalidade'`)
4. Faça um push para a branch (`git push origin feature-minha-feature`)
5. Abra um Pull Request

---

🔹 Desenvolvido por [Elton Riva](https://github.com/EltonRiva1) 🚀


# 🌐 API REST — Métodos HTTP em Java

Uma **API REST** (Representational State Transfer) usa métodos HTTP para realizar operações sobre recursos.  
Cada método tem um propósito específico 👇

---

## 🚀 Métodos HTTP Principais

| Método | Descrição | Operação CRUD | Exemplo Java |
|:--------|:-----------|:----------------|:----------------|
| **GET** | 🔍 Recupera dados de um recurso. | **Read** | ```java\nHttpRequest request = HttpRequest.newBuilder()\n    .uri(URI.create("https://api.exemplo.com/usuarios"))\n    .GET()\n    .build();\n``` |
| **POST** | ➕ Cria um novo recurso. | **Create** | ```java\nHttpRequest request = HttpRequest.newBuilder()\n    .uri(URI.create("https://api.exemplo.com/usuarios"))\n    .header("Content-Type", "application/json")\n    .POST(HttpRequest.BodyPublishers.ofString("{\"nome\":\"Ana\"}"))\n    .build();\n``` |
| **PUT** | 🔁 Atualiza **completamente** um recurso existente. | **Update** | ```java\nHttpRequest request = HttpRequest.newBuilder()\n    .uri(URI.create("https://api.exemplo.com/usuarios/1"))\n    .header("Content-Type", "application/json")\n    .PUT(HttpRequest.BodyPublishers.ofString("{\"nome\":\"Ana Maria\"}"))\n    .build();\n``` |
| **PATCH** | ✏️ Atualiza **parcialmente** um recurso. | **Partial Update** | ```java\nHttpRequest request = HttpRequest.newBuilder()\n    .uri(URI.create("https://api.exemplo.com/usuarios/1"))\n    .header("Content-Type", "application/json")\n    .method("PATCH", HttpRequest.BodyPublishers.ofString("{\"email\":\"ana@email.com\"}"))\n    .build();\n``` |
| **DELETE** | ❌ Remove um recurso. | **Delete** | ```java\nHttpRequest request = HttpRequest.newBuilder()\n    .uri(URI.create("https://api.exemplo.com/usuarios/1"))\n    .DELETE()\n    .build();\n``` |

---

## ⚙️ Enviando a Requisição

```java
HttpClient client = HttpClient.newHttpClient();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

System.out.println("Status: " + response.statusCode());
System.out.println("Body: " + response.body());

# Singleton - Padronizando um Sistema de Gerenciamento de Usuários

## Desafio

O **Singleton** é uma abordagem de design de software que visa assegurar a existência de apenas uma instância de uma classe e fornecer um ponto centralizado para acessá-la. Isso é especialmente benéfico em contextos nos quais é desejável manter uma única ocorrência de uma classe responsável pelo controle de um recurso compartilhado, como configurações, conexões de banco de dados ou caches.

Neste desafio, você deve criar um sistema de gerenciamento de usuários que permita adicionar e listar usuários. Você tem a opção de implementar o padrão Singleton para garantir que haja apenas uma instância do gerenciador de usuários em toda a aplicação. No entanto, a implementação do padrão Singleton é opcional e você pode optar por seguir uma abordagem diferente para resolver o desafio, se preferir.

### Especificações do Desafio

- Crie uma classe User com os seguintes atributos: `id` (inteiro) e name (`string`).
- Implemente uma classe `UserManager` que siga o padrão Singleton. Esta classe deve possuir as seguintes funcionalidades:
  - Adicionar um novo usuário ao sistema, recebendo o nome como entrada.
  - Listar todos os usuários cadastrados.
- No programa principal (`main`), siga as etapas abaixo:
  - Solicite ao usuário a quantidade de usuários que deseja cadastrar.
  - Peça ao usuário para informar os nomes dos usuários, um por linha.
  - Após receber os nomes e cadastrar os usuários, liste os usuários cadastrados.

## Solução

Clique aqui para ver o [arquivo da solução](./solucoes/singleton.kt)

```kotlin
class User(val id: Int, val name: String)

/* 
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object) 
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */
object UserManager {

  private val users = mutableListOf<User>()
  private var autoIncrementIdCounter = 1;

  fun addUser(name: String) {
    this.users.add(User(autoIncrementIdCounter, name))
    autoIncrementIdCounter++
  }

  fun listUsers() {
    this.users.forEach {
      with (it) {
        println("$id - $name")
      }
    }
  }
}

fun main() {
  val quantity = readLine()?.toIntOrNull() ?: 0

  for (i in 1..quantity) {
    val name = readLine() ?: ""
    UserManager.addUser(name)
  }
  UserManager.listUsers()
}
```

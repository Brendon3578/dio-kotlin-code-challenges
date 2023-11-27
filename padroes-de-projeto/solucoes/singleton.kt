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
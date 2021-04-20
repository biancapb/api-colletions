package one.digitalinnovation.collections

fun main() {
    //instancia de 3 objetos Funcionario
    val Joao =  Funcionario("Joao", 2200.00)
    val Maria =  Funcionario("Maria", 3800.00)
    val Alice =  Funcionario("Alice", 1600.00)

    //atrubui a uma lista
    val funcionarios = listOf(Joao, Maria, Alice)

    //iterou a lista
    funcionarios.forEach {
        println(it)
    }

    //encontrou apenas um objeto Funcionario com nome Maria
    println(funcionarios.find { it.nome == "Maria" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String = """
        Nome :    $nome
        Salário : $salario
    """.trimIndent()


}
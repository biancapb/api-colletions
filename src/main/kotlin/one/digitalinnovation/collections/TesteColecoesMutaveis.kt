package one.digitalinnovation.collections

fun main() {
    //instancia de 3 objetos Funcionario
    val Joao = Funcionario("Joao", 2200.00, "CLT")
    val Maria = Funcionario("Maria", 8800.00, "PJ")
    val Jose = Funcionario("Jose", 1600.00, "CLT")

    //mutableListOf = é possível mudá-lo, adicionando, removendo objetos
    println("--------- LIST ----------")
    val funcionarios = mutableListOf(Joao, Maria)

    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.add(Jose)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.remove(Joao)
    funcionarios.forEach { println(it) }

    println("--------- SET ----------")
    val funcionarioSet = mutableSetOf(Joao)
    funcionarioSet.forEach { println(it) }

    funcionarioSet.add(Jose)
    funcionarioSet.add(Maria)
}
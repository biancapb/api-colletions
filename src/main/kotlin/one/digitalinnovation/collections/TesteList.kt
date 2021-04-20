package one.digitalinnovation.collections

fun main() {
    //instancia de 3 objetos Funcionario
    val Joao =  Funcionario("Joao", 2200.00, "CLT")
    val Maria =  Funcionario("Maria", 3800.00, "PJ")
    val Jose =  Funcionario("Jose", 1600.00, "CLT")

    //atrubui a uma lista
    val funcionarios = listOf(Joao, Maria, Jose)

    //iterou a lista
    funcionarios.forEach {
        println(it)
    }

    println("------------------")

    //encontrou apenas um objeto Funcionario com nome Maria
    println(funcionarios.find { it.nome == "Maria" })

    println("------------------")

    /*operações sob uma colletions
    sortedBy = ordernar de acordo com o que é definido, ou seja, o salario (nesse caso)
    forEach = operação coletora, imprime o que foi feito
    */
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------")

    /*
    groupBy = agrupa de acordo com o que é definido, ou seja, o tipo de contratação nesse caso
     */
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}

package one.digitalinnovation.collections

fun main() {
    //instancia de 3 objetos Funcionario
    val Joao = Funcionario("Joao", 2200.00, "CLT")
    val Maria = Funcionario("Maria", 8800.00, "PJ")
    val Jose = Funcionario("Jose", 1600.00, "CLT")

    //dois conjuntos
    val financeiroFuncionario = setOf(Joao, Jose)
    val recursosHumanosFuncionario = setOf(Maria)

    //unir os conjuntos
    val resultUnion = financeiroFuncionario.union(recursosHumanosFuncionario)
    resultUnion.forEach { println(it) }

    println("------------------")

    //novo conjunto com todos os funcionarios
    val quartoAndar = setOf(Joao, Maria, Jose)

    //remove o que for definido no subtract
    val resultSubtract = quartoAndar.subtract(recursosHumanosFuncionario)
    resultSubtract.forEach { println(it) }

    println("------------------")

    //mostra o que estiver presente o que tem de comum entre os dois conjuntos
    val resultIntersect = quartoAndar.intersect(recursosHumanosFuncionario)
    resultIntersect.forEach { println(it) }

}
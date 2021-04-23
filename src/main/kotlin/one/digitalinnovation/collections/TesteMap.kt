package one.digitalinnovation.collections

fun main() {
    //cria um par, que tem adicionado uma chave e um valor
    val pair: Pair<String, Double> = Pair("João", 1000.00)
    //elemento de mapa
    val map1 = mapOf(pair)

    //itera o mapa
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("------------------")

    //consegue declarar varios itens que contenham chaves e valores
    val map2 = mapOf(
        "Pedro" to 2500.00,
        "Joana" to 3800.00
    )

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

}
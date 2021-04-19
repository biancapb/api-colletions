package one.digitalinnovation.collections

fun main() {
    //precisa definir antes as posições das Strings
    val nomes = Array(5) {""}
    nomes[0] = "Maria"
    nomes[1] = "Natalia"
    nomes[2] = "Alan"

    for (nome in nomes) {
        println(nome)
    }

    //ordena as strings por ordem alfabética
    nomes.sort()
    for (nome in nomes) {
        println(nome)
    }
}
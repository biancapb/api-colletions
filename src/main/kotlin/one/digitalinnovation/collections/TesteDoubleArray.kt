package one.digitalinnovation.collections

fun main() {
    //precisa pré-definir a posição dos itens
    val salarios = DoubleArray(2)

    salarios[0] = 2000.00
    salarios[1] = 5000.00

    for (sal in salarios) {
        println(sal)
    }

    //permite pegar um item do Array por meio de seu índice
    salarios.forEachIndexed { index, salario ->
        salarios[1] = salario * 1.1

    }

    for (sal in salarios) {
        println(sal)
    }

    //não precisa pré-definir a posição dos itens
    val salarios2 = doubleArrayOf(10000.00, 1300.00, 3200.00)
    salarios2.sort()
    salarios2.forEach { println(it) }
}
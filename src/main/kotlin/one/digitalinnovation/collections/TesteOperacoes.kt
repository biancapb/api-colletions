package one.digitalinnovation.collections

fun main() {
    //não precisa pré-definir a posição dos itens
    val salarios = doubleArrayOf(1000.00, 2250.00, 4080.00)

    for (salario in salarios){
        println(salario)
    }

    //comandos para pegar maior, menor e a média dos números
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    //comando para filtrar
    val salariosMaiorQue2500 = salarios.filter { it > 2000.00 }
    salariosMaiorQue2500.forEach { println(it) }

   //para contar itens dentro de um range... por exemplo, dentro do Array, quantidade de itens que vão de 100 a 200
    println(salarios.count { it in 2000.00..5000.00 })

    //para encontrar um valor dentro do array
    println(salarios.find { it == 2250.00 })

    //verificar se o item que se encaixa na condição existe ou não
    println(salarios.any { it == 1000.00 } )

}
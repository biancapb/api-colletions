package one.digitalinnovation.collections

fun main() {
    //instancia de 3 objetos Funcionario
    val Joao = Funcionario("Joao", 2200.00, "CLT")
    val Maria = Funcionario("Maria", 8800.00, "PJ")
    val Jose = Funcionario("Jose", 1600.00, "CLT")

    val repositorio = Repositorio<Funcionario>()

    //criação
    repositorio.create(Joao.nome, Joao)
    repositorio.create(Maria.nome, Maria)
    repositorio.create(Jose.nome, Jose)

    //busca pelo id
    println(repositorio.findById(Jose.nome))

    println("------------------")

    //mostra todos
    println(repositorio.findAll())

    println("------------------")

    //outra forma de imprimir:
    repositorio.findAll().forEach { println(it) }

    println("------------------")

    //remoção
    repositorio.remove(Jose.nome)
    repositorio.findAll().forEach { println(it) }


}
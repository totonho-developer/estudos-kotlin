package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Antonio"

    var cpf: String = "123.123.123.12"
    private set
}

fun main() {
    val tonho:Pessoa = Pessoa()

    println(tonho.nome)
    println(tonho.cpf)
}

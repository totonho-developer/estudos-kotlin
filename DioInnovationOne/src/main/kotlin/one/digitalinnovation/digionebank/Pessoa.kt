package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Antonio"
    var cpf: String = "123.123.123.12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val tonho:Pessoa = Pessoa()

    println(tonho.nome)
    println(tonho.cpf)
    println(tonho.pessoaInfo())
}

package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val tipo: ClienteTipo,
    val senha: String
):Pessoa(nome, cpf),ILogavel {
    override fun autentica(): Boolean = "851756"==this.senha

    override fun toString(): String = """
        nome: $nome
        cpf: $cpf
        tipo: ${tipo.descricao}
    """.trimIndent()
}
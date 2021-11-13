package one.digitalinnovation.digionebank

abstract class Funcionario(
    cpf: String,
    nome: String,
    val salario:Double
):Pessoa(cpf,nome) {
    protected abstract fun calculoAuxilio():Double
    override fun toString(): String = """
        nome: $nome
        cpf: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}
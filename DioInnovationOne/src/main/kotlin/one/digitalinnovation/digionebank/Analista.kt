package one.digitalinnovation.digionebank

class Analista(cpf: String, nome: String, salario: Double, val senha: String): Funcionario(cpf, nome, salario), ILogavel {
    public override fun calculoAuxilio(): Double = this.salario * 0.15
    override fun autentica(): Boolean ="12545"== this.senha

}
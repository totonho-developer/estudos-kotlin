package one.digitalinnovation.digionebank

class Analista(cpf: String, nome: String, salario: Double): Funcionario(cpf, nome, salario) {
    public override fun calculoAuxilio(): Double = this.salario * 0.15

}
package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("123.123.123-12","Joao",3500.00,"12545")
   ImprimeRelatorioFuncionario.Imprime(joao)
    TesteAutenticacao().autentica(joao)

}
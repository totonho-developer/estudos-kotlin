package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val maria = Cliente("Maria Joaquina","120.158.452.89",ClienteTipo.PF,"851756")
    println(maria)
    TesteAutenticacao().autentica(maria)

}
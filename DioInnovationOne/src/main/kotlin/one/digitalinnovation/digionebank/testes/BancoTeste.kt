package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy("Banco 2", 15)
    println(banco2.info())
}
import pacoteA.SimplesFuncao
import pacoteA.Coisa
import pacoteA.FaceMoeda.CARA
import pacoteB.*    // nesse import foi feito a import de todos os elementos usando .*

fun main() {
    println(SimplesFuncao("Ok"))
    val coisa = Coisa("Bola")
    println(coisa.nome)
    println(CARA)
    println("o resultado da soma é: ${pacoteB.soma(2,3)} e da subtracao é: ${subtracao(6,5)}.")


}
/**
 * Exemplo de template Strings
 */
fun main() {
    val clientes = listOf("joao","pedro","sara","paulo") // criado uma lista de clientes
    println("O primeiro cliente atendido foi: ${clientes[0]}") // chamando os clientes na ordem definida
    println("O primeiro cliente a chegar na clinica foi: ${clientes[2]}")
    println("O ultimo cliente da lista é o: ${clientes[3]}")

    println("------------------outro exemplo no uso de Strings---------------------------")

    val humor = false // boleano que indica verdadeiro
    if (humor == true){
        println("hoje voce esta feliz")  }else{
        println("Hoje voce esta chateado") }


    println("------------ ---reduzindo o numero de linha no código-----------------------")
    // código mais enxuto
    val humor2 = true
    println("Hoje voce esta ${if (humor2)"feliz" else "chateado"}")
}

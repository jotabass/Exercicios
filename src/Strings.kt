/**
 * Exemplo de template Strings
 */
fun main() {
    val clientes = listOf("joao","pedro","sara","paulo") // criado uma lista de clientes
    println("O primeiro cliente atendido foi: ${clientes[0]}")
    println("O primeiro cliente a chegar na clinica foi: ${clientes[2]}")
    println("O ultimo cliente da lista é o: ${clientes[3]}")
}
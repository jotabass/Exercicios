/**
 * neste projeto a intenção é fazer cadastro de membros de uma igreja com dados simples do tipo:
 * nome, sexo, cpf, rg, idade etc...
 */

class Igreja{
    var nome = mutableListOf<String>() //lista mutavel criada para adcionar membros
    var idade = mutableListOf<Int>()
}

fun main() {
    val cadastro = Igreja()
    print("Digite seu nome ")
    cadastro.nome.add(readLine().toString()) // agora falta acrecestar mais de um dado na lista
    print("Digite sua idade ")
    cadastro.idade.add(readLine()!!.toInt())
    println("Exibindo lita de nomes -> ${cadastro.nome}")
    println(cadastro.nome + cadastro.idade)
   // println("${cadastro.nome} tem ${cadastro.idade} anos de idade.")
}

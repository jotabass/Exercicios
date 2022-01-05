class Igreja{
    var membros = mutableListOf<String>() //lista mutavel criada para adcionar membros
}

fun main() {
    val cadastro = Igreja()
    cadastro.membros.add(readLine().toString()) // agora falta acrecestar mais de um dado na lista
    //cadastro.membros.add(readLine().toString())
    println(cadastro.membros)
}

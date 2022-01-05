import java.util.*

/**
 *  Exercicios de funções com e sem retorno
 */

// função, nome da função (parametros: retorno)
/*
fun soma(a: Int,b: Int){ // Exemplo de função sem retorno
    println(a + b)
}
fun subtrair(c: Int,d: Int):Int{   // Exemplo de  função com retorno
    return c - d
}
fun main() {  // Função principal
    soma(2,2)
    println(subtrair(2,6))
}


//----------nesta forma comentada eu acrescentei texto dentro do print--------------

fun soma (a: Int, b: Int){ // funcao sem retorno
    println("a soma de ${a} + ${b} é ${a + b}.")
}
fun subtrair (c: Int, d: Int): Int{  // funcao com retorno
    return c-d
}
fun main() {
   soma(2,2) // a funcao soma recebe os valores
    println("a diferenca entre c e d é ${subtrair(4,4)}.")// a funcao subtrair recebe os valores
}


//---------------------funções top level----------------------------

fun min(e: Int,d: Int): Int{
    return if (e < d) e else d
}
fun main() {
    println("o menor valor é:${min(6,5)}")
}

fun relacaoDeTrabalho(chefe: String, funcionario: String): String{
    return "$funcionario é subordinado a $chefe"
}
fun main() {
    //println(relacaoDeTrabalho("joao","adriana"))
    println(relacaoDeTrabalho(funcionario ="joao", chefe = "adriana"))
}


//----------parametros são imutaveis--------------
// -------------exemplo------------------

fun incremento(num: Int){
  // num++       //ao tentar incrementar num como o parametro num é imutavel da erro
}
fun main() {
    incremento(3)
}



data class Horario(val hora: Int, val minuto: Int, val segundos: Int)

fun agora(): Horario{
    val agora = Calendar.getInstance()
    with(agora){
        return Horario(get(Calendar.HOUR_OF_DAY),get(Calendar.MINUTE),get(Calendar.SECOND))
    }
}
fun main() {
    val(h,m,s) = agora()
    println("$h:$m:$s")
}


fun soma(num: Int = 2): Int{
    return num
}
fun multiplicar(num: Int = 2): Int{
    return num
}
fun subtrair(num: Int = 2): Int{
    return num
}
fun main() {

    println("digite a base de calculo desejada")

    val texto = readLine().toString()

        for (base in 0..10){

            if (texto == "soma"){
                println("${soma()} + ${base} = ${soma()+base}")
            }
            if (texto == "multiplicar"){
                println("${multiplicar()} X ${base} = ${multiplicar()*base}")
            }
            if (texto == "subtrair"){
                println("${subtrair()} - ${base} = ${subtrair() - base}" )
            }
    }
}

 */
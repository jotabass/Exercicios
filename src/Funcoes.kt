/**
 *  Exercicios de funções
 */

// função, nome da função (parametros: retorno)
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


/*
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
 */
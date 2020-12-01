fun main(args: Array<String>) {
    println("Teste de Performace Elvis Lopes!")

    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    val vazio = listOf<Int>()

    //Questão O2
    println("\nQuestao 02")
    verificaLista(triangulo)
    verificaLista(fibonacci)

    //Questão 03
    println("\nQuestao 03")
    verificaMaiorElemento(triangulo)
    verificaMaiorElemento(fibonacci)

    //Questão 04
    println("\nQuestao 04")
    somaParesMultilplicaImpar(triangulo)
    somaParesMultilplicaImpar(fibonacci)

    //Questão 05
    println("\nQuestao 05")
    fatorial(10)
    fatorial(1)
    fatorial(100)

    //Questão 06
    println("\nQuestao 06")
    mascaraPrimo(triangulo)
    mascaraPrimo(fibonacci)

    //Questão 07
    println("\nQuestao 07")
    hashingStrings("cafe")
    hashingStrings("elvis")
    hashingStrings("infnet")

    //Questão 08
    println("\nQuestao 08")
    usoListas(triangulo)
    usoListas(fibonacci)

    //Questão 09]
    println("\nQuestao 09")
    modelaData(1,12,2020)

}

/*
Faça um programa que exiba "Infnet", caso o primeiro elemento de uma lista seja menor que o último,
e "Tenfni", caso contrário.
*/
fun verificaLista(lista: List<Int>) {

    val tamLista = lista.size - 1

    if (lista[0] < lista[tamLista]) {
        println("Infnet")
    } else {
        println("Tenfni")
    }
}

//Faça um programa que exibe o maior elemento de uma lista. Teste nas listas de teste.
fun verificaMaiorElemento(lista: List<Int>){

    var maiorElemento = Int.MIN_VALUE

    for (num in lista){
        if(num > maiorElemento){
            maiorElemento = num
        }
    }
    println("O maior elemento da lista $lista eh $maiorElemento")
}

//Faça um programa que exiba a soma de todos os números pares e o produto de todos os números ímpares de uma lista.
fun somaParesMultilplicaImpar(lista: List<Int>){

    var soma = 0
    var multiplicacao = 1

    for (num in lista){
        if(num % 2 == 0){
            soma += num
        } else {
            multiplicacao *= num
        }
    }

    println("A soma de todos os numeros pares da $lista eh $soma")
    println("A multiplicacao de todos os numeros impares da $lista eh $multiplicacao")

}

// Faça uma função que calcule o fatorial de um número n
fun fatorial(fat: Int){

    var fatorial = 1

    for (num in 1..fat){
        fatorial += fatorial * (num-1)
    }

    println("O o fatorial de numero da $fat eh $fatorial")

}

/*
Faça uma função que receba uma lista de números inteiros e retorne uma nova lista,
com a mesma quantidade de elementos, de modo que as posições em que havia um número primo,
sejam preenchidas com o número 1 e as demais posições, com o número 0.
*/
fun mascaraPrimo(lista: List<Int>){

    var novaLista: MutableList<Int> = mutableListOf()
    var div = 0
    var teste: Int

    for(num in lista){
        for(t in 1..num) {

            teste = num % t
            if (teste == 0) {
                div++
            }
        }

        if(div <= 2 ){
            novaLista.add(1)
        } else {
            novaLista.add(0)
        }

        div = 0

    }

    println("A mascara de primos da lista a seguir: \n$lista \n$novaLista\n")

}

/*
Hashing de strings

Considere que para cada letra do alfabeto exista um número natural associado de maneira sequencial:

a - 1; b - 2; c - 3 .... x - 24; y - 25; z - 26.

Trabalhe apenas com letras minúsculas, não se preocupe com as maiúsculas agora.
Nesta questão, você deve implementar uma função que recebe uma string com uma única palavra e,
então, retorna um número inteiro calculado a partir dessa string.
Teste com as seguintes palavras: "infnet", "abacaxi", "pneumoultramicroscopicosilicovulcaniconiótico", "e".

O cálculo deve ser feito da seguinte forma:
Para cada letra na palavra, você irá calcular um valor associado.

Este valor será igual ao número que representa a letra vezes a posição da letra na palavra.
O valor associado à palavra será igual à soma dos valores associados a cada uma de suas letras — é esse valor que deve ser retornado.
Exemplo: café

LETRA - (número inteiro associado) * (posição na palavra)
*/
fun hashingStrings(palavra: String){
    var soma = 0
    val valorLetraLista = listOf(
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z",
    )

    for(letra in palavra) {
        println("${letra.toLowerCase()} " + (valorLetraLista.indexOf(letra.toString()) + 1) + " X " + (palavra.indexOf(letra)+1))
        soma += (valorLetraLista.indexOf(letra.toString()) + 1) * (palavra.indexOf(letra) + 1)
    }

    println("Hasing de $palavra = $soma\n")
}

/*
Olhe a documentação sobre listas em Kotlin
Escolha 3 métodos descritos na documentação e crie um pequeno programa que demonstre como utilizá-los (podem ser situações completamente diferentes). Faça comentários explicando o uso.
 */
fun usoListas(lista: List<Int>){

    //usando o metódo size para retornar o tamanho da lista
    var tamanho = lista.size
    println("O tamanho da lista $lista eh $tamanho")

    //usando o metódo contanis para verificar se na lista existe um elemento especifico
    var existeElemento = lista.contains(1);
    var existeElemento2 = lista.contains(9876543234567);
    println("Verificando se na lista $lista existe o elemento 1: $existeElemento")
    println("Verificando se na lista $lista existe o elemento 9876543234567: $existeElemento2")

    //usando o metódo indexOf para retornar o indíce do elemento buscado ou -1 se não existir
    var indexElemento = lista.indexOf(1)
    var indexElemento2 = lista.indexOf(9876543234567)
    println("Verificando o indice do elemento 1 na lista: $indexElemento")
    println("Verificando o indice do elemento 9876543234567 na lista: $indexElemento2\n")

}

/*
Escreva uma classe que modele uma data. Represente dia, mês e ano como números.

Escreva métodos para responder às seguintes perguntas:
A data se encontra em ano bissexto?
Quantos dias têm o mês da data?
Quantos dias existem entre o dia da data e o primeiro dia do ano inclusive?
 */
fun modelaData(dia: Int, mes: Int, ano: Int){

    val anoBissexto = anoBissexto(ano)

    //verificar se o ano da data é bissexto
    if(anoBissexto){
        println("O ano de $ano eh bissexto")
    } else {
        println("O ano de $ano eh nao bissexto")
    }

    //verifica quantos dias tem o mês da data
    if(anoBissexto && mes == 2){
        println("O mes $mes possui ${diasMes(mes)+1}")
    } else {
        println("O mes $mes possui ${diasMes(mes)}")
    }

    //verifica quantos dias tem no intervalo da data e o começo do ano
     if(anoBissexto && mes!=1){
        println("O intervalo de dias de $dia/$mes/$ano ate o comeco do ano eh ${quantidadeDiasComecoDoAno(dia,mes)+1}")
    } else {
        println("O intervalo de dias de $dia/$mes/$ano ate o comeco do ano eh ${quantidadeDiasComecoDoAno(dia,mes)}")
    }

}

fun anoBissexto(ano: Int): Boolean{

    //verifica se o ano não terminar em 00
    val teste1 = ano % 100 != 0
    //verifica se o ano é divisível por 4
    val teste2 = ano % 4 == 0
    //verifica se o ano é divisível por 4
    val teste3 = ano % 400 == 0

    // se o ano não terminar em 00 e for divisível por 4 dizemos que ele é bissexto.
    // Os anos terminados em 00 serão bissextos se a divisão deles por 400
    if (teste1){
        if(teste2){
            return true
        } else
        if(teste3){
            return true
        }
    }

    return false
}

fun diasMes(mes: Int): Int {
    var qtdDias = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    return qtdDias[mes-1]
}

fun quantidadeDiasComecoDoAno(dias: Int, mes: Int): Int {
    var somaDias = 0
    var qtdDiasMeses = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    for(i in 1..(mes-1)){
            somaDias += qtdDiasMeses[i-1]
    }

    return somaDias + dias
}
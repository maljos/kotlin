package com.example.introduccion

/*
 * 1. Al igual que delphi este es un lenguaje fuertemente tipado.
 * 2. Es susceptible a mayusculas y minusculas para declarar tipos de variables
 */

fun ioSalida() {
    print("Ingrese una palabra: ")
    val palabra = readln()
    println("Hola $palabra")
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

//Funciones en linea
fun sumarInLine(a: Int, b: Int) = a + b
fun mayorInLine(a: Int, b: Int) = if (a>b) a else b

fun main() {
    //Entrada y salida estandar
    ioSalida()

    //Funcion que devuelve un valor
    print("La suma de 3 + 5 es: ")
    println(sumar(3, 5))

    //Funcion en linea
    println("La suma de 4 + 9 es: ${sumarInLine(4, 9)}")

    //Constante
    val x = 5
    //x = 35 Da error de compilacion

    //Variable
    var y = 8
    y += 30

    println("El valor maximo entre $x y $y es: ${mayorInLine(x, y)}")

    val cadena = """ABC
        |DEF
        |FEJ
    """
    val cadena1: String = "ABC\n" +
            "        |DEF\n" +
            "        |FEJ"

    println("Valor de la cadena es: $cadena")
    println("Longitud de la cadena: ${cadena.trimMargin().length}")
    println("Valor de la cadena es: $cadena")

    println("Valor de la cadena es: $cadena1")
    println("Longitud de la cadena: ${cadena1.length}")
    println("Valor de la cadena es: $cadena1")
}
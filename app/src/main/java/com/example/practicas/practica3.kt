package com.example.myapplication

fun main (parametro:Array<String>) {

    println("Ingresa tu estatura:")
    val estatura = readln().toDouble()

    println("Ingresa tu peso:")
    val peso = readln().toDouble()

    val sumaestatura = (estatura * estatura)

    val imc = (peso / sumaestatura)

    if (imc < 18.5) {
        println("Estas bajo de peso")
    } else if (imc > 18.6 && imc <= 29.9) {
        println("tu peso es ideal")
    } else {
        println("Estas obeso")
    }
}


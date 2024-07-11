package com.example.myapplication

fun main (parametro: Array<String>) {


    println("Ingresa el numero de la semana")
    val diaSemana = readln().toInt()

    when (diaSemana) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")

        else -> println("Fin de semana")}

    if (diaSemana < 3) {
        println("promocion de 50% en cervezas")
    } else if (diaSemana == 3 ) {
        println("Cerveza y alitas ")

    } else {
        println("Karaoke")
    }
}

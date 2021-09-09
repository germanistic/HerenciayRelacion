package com.example.body

fun main() {

    var cabeza2= Head("muy poquito","rojos y locos",nariz = "finita","con terribles colmillos")
    var cabeza1= Head("desastrozo","negros y profundos",nariz = "aplastada","sin dientes")
    var mostro1 = Body("Fran","Kenstein",cabeza1)
    var mostro2 = Body("Conde","Dracula",cabeza2)



    print(mostro1)
    println(" \n ")
    print(mostro2)

}
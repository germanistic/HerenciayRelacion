package com.example.body

open class Body {

    var Nombre:String=""
    var Apellido:String=""
    var Cabeza:Head

    constructor(Nombre: String, Apellido: String, Cabeza: Head) {
        this.Nombre = Nombre
        this.Apellido = Apellido
        this.Cabeza = Cabeza
    }

    override fun toString():String {
        return ("Mi nombre es ${Nombre} apellido ${Apellido} \ntengo pelo ${Cabeza.pelo} y me dicen que tengo ojos ${Cabeza.ojos} \npero lo que mas me gusta es mi nariz ${Cabeza.nariz} \nsoy bueno y doy besos con mi boca ${Cabeza.boca}")

    }

}
package com.dam1.eju5.src.clases

open class Persona( open val nombre:String, open var fechaNac: Int){

    init{
        require(fechaNac > 0) { IllegalArgumentException("ERR0R: el year debe ser mayor que 0.") }
        require(nombre.isNotEmpty()){IllegalArgumentException("ERROR: El campo del nombre no debe estar vacio.")}
    }

    fun cumple(): String {
        return "$nombre ha cumplido ${fechaNac + 1}"
    }

    open fun actividad(): String {
        return "$nombre esta realizando una actividad"
    }

    open fun info(): String {
        return "Persona(Nombre = $nombre, Edad = $fechaNac)"
    }
}
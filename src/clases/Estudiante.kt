package com.dam1.eju5.src.clases

class Estudiante(nombre:String, fechaNac: Int, val carrera: String): Persona (nombre, fechaNac){

    override fun info(): String {
        return "Estudiante(Nombre = $nombre, Edad = $fechaNac, Carrera = $carrera)"
    }
    override fun actividad(): String{
        return "El estudiante $nombre esta realizando una actividad academica."
    }
}
package org.iesra

class Persona2(var peso: Double, var altura: Double) {
    var nombre: String? = null
        set(value) {
            require(!value.isNullOrBlank()) {"El nombre no puede ser nulo o vacio"}
            field = value
        }

    val imc: Double
        get() = peso / (altura * altura)

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura) {
        this.nombre = nombre
    }

    override fun toString(): String {
        return "nombre: $nombre, peso: $peso, altura: $altura, IMC: $imc"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona2) return false

        return (peso == other.peso) && (altura == other.altura) && (nombre == other.nombre)
    }

    fun saludar(): String {
        return "Hola $nombre"
    }

    private fun alturaEncimaMedia(): Boolean {
        return altura >= 1.75
    }

    private fun pesoEncimaMedia(): Boolean {
        return peso >= 70
    }

    private fun obtenerDescImc(): String {
        if (imc < 18.5) {
            return ("peso insuficiente")
        }
        else if (imc in 18.5..24.9) {
            return ("peso saludable")
        }
        else if (imc in 25.0..29.99) {
            return ("sobrepeso")
        }
        else {
            return ("obesidad")
        }
    }

    fun obtenerDesc(): String {
        val declaracionAltura = if (alturaEncimaMedia())
            "Por encima de la media"
        else
            "Por debajo de la media"

        val declaracionPeso = if (pesoEncimaMedia())
            "Por encima de la media"
        else
            "Por debajo de la media"

        return "$nombre con una altura de $altura ($declaracionAltura) y un peso $peso ($declaracionPeso) tiene un IMC de $imc (${obtenerDescImc()})"
    }
}

fun main() {
    val persona1 = Persona2("Manuel",53.4, 1.62)
    val persona2 = Persona2("Juan", 62.0, 1.70)
    val persona3 = Persona2("Franco", 98.5, 1.85)
    val persona4 = Persona2("Maria", 86.2, 1.80)
    val persona5 = Persona2("Paula", 64.4, 1.76)

    val personas = listOf(persona1, persona2, persona3, persona4, persona5)

    for (persona in personas) {
        println(persona.saludar())
        println(persona.obtenerDesc())
        println()
    }
}
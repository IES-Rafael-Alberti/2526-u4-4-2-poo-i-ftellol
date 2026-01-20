package org.iesra

class Persona(var peso: Double, var altura: Double) {
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
        if (other !is Persona) return false

        return (peso == other.peso) && (altura == other.altura) && (nombre == other.nombre)
    }
}

fun main() {
    val persona1 = Persona(53.4, 1.62)
    val persona2 = Persona("Juan", 62.0, 1.70)
    val persona3 = Persona("Franco", 98.5, 1.85)

    // PERSONA 1
    println ("Introduce el nombre de la persona 1")
        val nombrePersona1 = readLine()
        persona1.nombre = nombrePersona1

    println("Persona 1 --> Nombre: ${persona1.nombre}, Peso: ${persona1.peso}, Altura: ${persona1.altura}")

    // PERSONA 3
    persona3.altura = 1.80
    println("Persona 3 --> Peso: ${persona3.peso}, Altura: ${persona3.altura}, IMC: ${persona3.imc}")

    // PERSONA 2
    persona2.altura = persona3.altura

    println("Persona 2 --> $persona2")
    println("Persona 3 --> $persona3")


    if (persona2 == persona3) {
        println("Persona 2 y persona 3 son iguales")
    }
    else {
        println("Persona 2 y persona 3 son diferentes")
    }
}
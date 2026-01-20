package org.iesra

class Rectangulo(private val base: Double, private val altura: Double) {
    fun conseguirArea(): Double {
        return base * altura
    }

    fun conseguirPerimetro(): Double {
        return 2 * (base + altura)
    }

    override fun toString(): String {
        return "Área: ${conseguirArea()}, Perímetro: ${conseguirPerimetro()}"
    }
}

fun main() {
    val rectangulo = Rectangulo(4.0, 6.0)
    println (rectangulo)
}
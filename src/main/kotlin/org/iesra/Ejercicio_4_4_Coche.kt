package org.iesra

class Coche(color: String?, marca: String?, modelo: String?, val caballos: Int?, val puertas: Int?, val matricula: String? ) {

    val marca: String? = marca
        get() = field?.replaceFirstChar { it.uppercase() }

    val modelo: String? = modelo
        get() = field?.replaceFirstChar { it.uppercase() }

    var color: String? = color
        set(value) {
            require(value != null) {"El color no puede ser nulo"}
            field = value
        }

    init {
        require(!marca.isNullOrBlank()) {"La marca no puede estar vacia ni nula"}

        require(!modelo.isNullOrBlank()) {"El modelo no puede estar vacio ni nulo"}

        require(caballos != null) {"El número de caballos no puede ser nulo"}
        require(caballos in 70..700) {"El número de caballos tendra que estar entre 70-700"}

        require(puertas != null) {"El número de puertas no puede ser nulo"}
        require(puertas in 3..5) {"El número de puertas tendra que estar entre 3-5"}

        require(matricula != null) {"El número de matricula no puede ser nulo"}
        require (matricula.length == 7) {"El número de matricula tiene que ser de 7 dígitos"}

        require(color != null) {"El color no puede ser nulo"}
    }

    override fun toString(): String {
        return "Marca: $marca, Modelo: $modelo, Caballos: $caballos, Puertas: $puertas, Matricula: $matricula, Color: $color"
    }
}

fun main() {
    
}

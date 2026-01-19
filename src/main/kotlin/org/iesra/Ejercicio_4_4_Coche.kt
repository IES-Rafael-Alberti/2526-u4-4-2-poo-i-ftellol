package org.iesra

class Coche(var color: String?, val marca: String?, val modelo: String?, val caballos: Int?, val puertas: Int?, val matricula: String? ) {

    init {
        require(!marca.isNullOrBlank()) {"La marca no puede estar vacia ni nula"}

        require(!modelo.isNullOrBlank()) {"El modelo no puede estar vacio ni nulo"}

        require(caballos != null) {"El número de caballos no puede ser nulo"}

        require(puertas != null) {"El número de puertas no puede ser nulo"}

        require(matricula != null) {"El número de matricula no puede ser nulo"}

        require(color != null) {"El color no puede ser nulo"}


    }
}
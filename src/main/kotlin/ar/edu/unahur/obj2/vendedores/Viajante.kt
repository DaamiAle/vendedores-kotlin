package ar.edu.unahur.obj2.vendedores

import ar.edu.unahur.obj2.locaciones.Ciudad
import ar.edu.unahur.obj2.locaciones.Provincia

class Viajante(val provinciasHabilitadas : List<Provincia>) : Vendedor() {
    override fun esInfluyente(): Boolean = this.provinciasHabilitadas.sumBy{ it.poblacion } >= 10000000
    override fun puedeTrabajarEn(unaCiudad: Ciudad): Boolean = this.provinciasHabilitadas.contains(unaCiudad.provincia)

}

package ar.edu.unahur.obj2.vendedores

import ar.edu.unahur.obj2.locaciones.Ciudad

class Fijo (val ciudadDeOrigen : Ciudad): Vendedor(){
    override fun puedeTrabajarEn(unaCiudad: Ciudad): Boolean = this.ciudadDeOrigen == unaCiudad

}
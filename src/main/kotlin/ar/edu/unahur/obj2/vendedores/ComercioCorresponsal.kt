package ar.edu.unahur.obj2.vendedores

import ar.edu.unahur.obj2.locaciones.Ciudad

class ComercioCorresponsal(val ciudadesDeSucursales : List<Ciudad> ) : Vendedor(){
    override fun esInfluyente() = this.ciudadesDeSucursales.size >= 5 || this.ciudadesDeSucursales.map { ciudad -> ciudad.provincia.nombre }.size >= 3
    override fun puedeTrabajarEn(unaCiudad: Ciudad) = this.ciudadesDeSucursales.contains(unaCiudad)
}
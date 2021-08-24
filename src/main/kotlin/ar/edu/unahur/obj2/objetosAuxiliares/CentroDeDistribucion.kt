package ar.edu.unahur.obj2.objetosAuxiliares

import ar.edu.unahur.obj2.locaciones.Ciudad
import ar.edu.unahur.obj2.vendedores.Vendedor

class CentroDeDistribucion(val ciudad: Ciudad){
    val vendedores = mutableListOf<Vendedor>()
    fun agregarVendedor(unVendedor:Vendedor){
        if (vendedores.contains(unVendedor)) { throw IllegalArgumentException("El vendedor ya se encuentra registrado.") }
        else { vendedores.add(unVendedor) }
    }
    fun vendedorEstrella(): Vendedor = vendedores.sortedBy { it.puntaje() }.last()
    fun vendedoresGenericos(): List<Vendedor> = vendedores.filter { it.esGenerico() }
    fun puedeCubrir(unaCiudad: Ciudad): Boolean = vendedores.any { it.puedeTrabajarEn(unaCiudad) }
    fun esRobusto(): Boolean = vendedores.filter { it.esFirme() }.size >= 3
}
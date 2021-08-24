package ar.edu.unahur.obj2.vendedores

import ar.edu.unahur.obj2.locaciones.Ciudad
import ar.edu.unahur.obj2.objetosAuxiliares.Certificado

abstract class Vendedor{
  val certificaciones = mutableListOf<Certificado>()
  open fun esInfluyente(): Boolean= false
  abstract fun puedeTrabajarEn(unaCiudad: Ciudad) :Boolean
  fun esVersatil(): Boolean =
    certificaciones.size >= 3
          && certificaciones.any { it.esDeProducto }
          && certificaciones.any { !it.esDeProducto }
  fun esFirme(): Boolean = certificaciones.sumOf { it.puntaje } >= 30
}

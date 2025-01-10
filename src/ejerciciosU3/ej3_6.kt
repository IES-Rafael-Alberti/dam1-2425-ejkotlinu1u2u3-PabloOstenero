
/* Dado el conjunto de letras:

 vocales = {'a', 'e', 'i', 'o', 'u'}

 Crea un conjunto consonantes que contenga las letras del alfabeto que no son vocales.
 Crea un conjunto letras_comunes que contenga las letras que están tanto en el conjunto vocales como en el conjunto consonantes. */

fun main() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')

    val alfabeto = ('a'..'z').toSet()
    val consonantes = alfabeto - vocales

    val letrasComunes = vocales intersect consonantes

    println("Conjunto de vocales: $vocales")
    println("Conjunto de consonantes: $consonantes")
    println("Intersección de vocales y consonantes: $letrasComunes")
}

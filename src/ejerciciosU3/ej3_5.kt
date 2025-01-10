
/* Dado el conjunto de números enteros:

 numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

 Crea un conjunto pares que contenga los números pares del conjunto numeros.
 Crea un conjunto multiplos_de_tres que contenga los números que son múltiplos de tres del conjunto numeros.
 Encuentra la intersección entre los conjuntos pares y multiplos_de_tres y guárdala en un conjunto llamado pares_y_multiplos_de_tres. */

fun main() {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numeros.filter { it % 2 == 0 }.toSet()

    val multiplosDeTres = numeros.filter { it % 3 == 0 }.toSet()

    val paresYMultiplosDeTres = pares intersect multiplosDeTres

    println("Conjunto de números pares: $pares")
    println("Conjunto de múltiplos de tres: $multiplosDeTres")
    println("Intersección de pares y múltiplos de tres: $paresYMultiplosDeTres")
}

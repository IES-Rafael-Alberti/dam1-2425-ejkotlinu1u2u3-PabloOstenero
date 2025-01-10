
/* Escribir un programa que pregunte por una muestra de números, separados por comas,
 los guarde en una lista y muestre por pantalla su media y desviación típica. */

import kotlin.math.sqrt

fun main() {
    print("Introduce una muestra de números separados por comas: ")
    val input = readLine()

    if (!input.isNullOrEmpty()) {
        try {
            val numeros = input.split(",")
                .map { it.trim().toDouble() }

            val media = numeros.sum() / numeros.size

            val desviacionTipica = sqrt(numeros.sumOf { (it - media) * (it - media) } / numeros.size)

            println("La media es: %.2f".format(media))
            println("La desviación típica es: %.2f".format(desviacionTipica))
        } catch (e: NumberFormatException) {
            println("La entrada no es válida. Asegúrate de introducir solo números.")
        }
    } else {
        println("Por favor, introduce una lista de números.")
    }
}

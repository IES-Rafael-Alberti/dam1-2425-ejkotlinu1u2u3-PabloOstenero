
/* Escribir un programa que pida al usuario un número entero, si la entrada no es correcta,
 mostrará el mensaje "La entrada no es correcta" y lanzará la excepción capturada. */

fun main() {
    try {
        print("Introduce un número entero: ")
        val input = readLine()

        val numero = input?.toInt() ?: throw NumberFormatException()

        println("El número ingresado es: $numero")

    } catch (e: Exception) {
        println("La entrada no es correcta")
        throw e
    }
}


/* Escribir un programa que pida al usuario un número entero positivo y
 muestre por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
 Deberá solicitar el número hasta introducir uno correcto. */

fun main() {
    var numero = 0
    var check = true

    while (check) {
        print("Introduce un número entero positivo: ")
        val input = readLine()

        numero = input?.toIntOrNull() ?: -1

        if (numero > 0) {
            check = false
        } else {
            println("Por favor, introduce un número entero positivo.")
        }
    }

    val cuentaAtras = (numero downTo 0).joinToString(", ")

    println("Cuenta atrás: $cuentaAtras")
}
